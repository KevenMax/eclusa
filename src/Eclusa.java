import java.util.ArrayList;
import java.util.Date;

public class Eclusa {

	private Rio rio;
	private Mar mar;
	private double capacidadeMaxima;
	private double capacidadeMinima;
	private double nivelAtual;
	private double vazao;
	private ArrayList<Embarcacao> embarcacoes = new ArrayList<Embarcacao>();
	private PrecoEmbarcacao[] precoEmbarcacao;
	private ComportaRio comportaRio;
	private ComportaMar comportaMar;
	private String status;
	private double porcentagemAgua;
	private double totalCaixa;
	private double comprimento;
	private double largura;
	private double tempoTotalOperacao;
	private ArrayList<Recebimento> recebimentos = new ArrayList<Recebimento>();
	
	//Contrutores
	public Eclusa() {
		super();
	}
	
	public Eclusa(double capacidadeMaxima, double capacidadeMinima, double vazao, double comprimento, double largura, String status) {
		setCapacidadeMaxima(capacidadeMaxima);
		setCapacidadeMinima(capacidadeMinima);
		setVazao(vazao);
		setComprimento(comprimento);
		setLargura(largura);
		setStatus(status);
		setPrecoEmbarcacao();
		setTempoTotalOperaca();
		comportaRio = new ComportaRio(this);
		comportaMar = new ComportaMar(this);
	}
	
	//metodos para encher/secar a eclusa
	public void aumentarNivelDagua() {
		if (comportaMar.isOpen()== false && comportaRio.isOpen() == false && status.equals("Seca")) {
			setStatus("Enchendo");
			operacao("Encher");
		}
	}
	
	public void diminuirNivelDagua() {
		if (comportaMar.isOpen()== false && comportaRio.isOpen() == false && status.equals("Cheia")) {
			setStatus("Secando");
			operacao("Secar");
		}
	}
	
	
	//metodos para calcular % da agua
	private void operacao(String operacao) {
		if (operacao.equals("Encher")) {
			for(nivelAtual = capacidadeMinima; nivelAtual <= capacidadeMaxima; nivelAtual += vazao) {
				try {					
					Thread.sleep(1000);
					calculaPorcentagemOperacao(operacao);
					System.out.println("Tempo Total: " + tempoTotalOperacao +" segundos");
					System.out.println("Tempo Decorrido: " + ((nivelAtual - capacidadeMinima)/vazao) + " segundos");
					System.out.println("Enchendo: "+ porcentagemAgua +"% \n");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			if (nivelAtual > capacidadeMaxima) {
				calculaPorcentagemOperacao(operacao);
				System.out.println("Tempo Total: " + tempoTotalOperacao +" segundos");
				System.out.println("Tempo Decorrido: " + tempoTotalOperacao + " segundos");
				System.out.println("Enchendo: "+ porcentagemAgua +"% \n");
			}
			nivelAtual = capacidadeMaxima;
			setStatus("Cheia");
			porcentagemAgua = 0;
		}else {			
			for(nivelAtual = capacidadeMaxima; nivelAtual >= capacidadeMinima; nivelAtual -= vazao) {
				try {					
					Thread.sleep(1000);
					calculaPorcentagemOperacao(operacao);
					System.out.println("Tempo Total: " + tempoTotalOperacao +" segundos");
					System.out.println("Tempo Decorrido: " + (tempoTotalOperacao - (nivelAtual - capacidadeMinima)/vazao) + " segundos");
					System.out.println("Secando: "+ porcentagemAgua +"% \n");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			if (nivelAtual < capacidadeMinima) {
				calculaPorcentagemOperacao(operacao);
				System.out.println("Tempo Total: " + tempoTotalOperacao +" segundos");
				System.out.println("Tempo Decorrido: " + tempoTotalOperacao + " segundos");
				System.out.println("Secando: "+ porcentagemAgua +"% \n");
			}
			nivelAtual = capacidadeMinima;
			setStatus("Seca");
			porcentagemAgua = 0;
		}
	}
	
	public void calculaPorcentagemOperacao(String operacao) {
		if (operacao.equals("Encher")) {
			double total = capacidadeMaxima - capacidadeMinima;
			double atual = nivelAtual - capacidadeMinima;
			if ((100 * atual)/total <= 100) {
				porcentagemAgua =  (100 * atual)/total;
			}else {
				porcentagemAgua = 100;
			}			
		}else{
			double total = capacidadeMaxima - capacidadeMinima;
			double atual = nivelAtual - capacidadeMinima;
			if ((100 - (100 * atual)/total)<=100) {
				porcentagemAgua = 100 - (100 * atual)/total;
			}else {
				porcentagemAgua = 100;
			}
			
		}
	}
		
	
	//metodos para calcular area, areaa total, area usada
	public double calcularArea() {
		return comprimento * largura;
	}
	
	public double calcularAreaUsada() {
		double somaAreaUsada = 0;
		for (Embarcacao embarcacao : embarcacoes) {
			somaAreaUsada += embarcacao.calculaArea();
		}
		return somaAreaUsada;
	}
	
	
	//metodos para saber o tempo total previsto
	public double tempoPrevistoTotal(){
		ArrayList<Embarcacao> cloneRio = clonaRio();
		ArrayList<Embarcacao> cloneMar = clonaMar();
		double tempoTotal = 0;
		double areaDisponivel;
		if (status.equals("Cheia") || status.equals("Enchendo")) {
			
			while(!cloneRio.isEmpty() || !cloneMar.isEmpty()) {
				
				areaDisponivel = calcularArea();				
				for (int i = 0; i < cloneMar.size(); i++) {
					
					if (cloneMar.get(i).calculaArea() <= areaDisponivel){
						//System.out.println("cheio:mar:"+i +" " + cloneMar.get(i).calculaArea());
						areaDisponivel -= cloneMar.get(i).calculaArea();
						cloneMar.remove(i);
						i--;
					}else {
						break;
					}
				}
				
				tempoTotal += tempoTotalOperacao;
				
				if (cloneRio.isEmpty() && cloneMar.isEmpty()) {
					break;
				}
				
				areaDisponivel = calcularArea();
				for (int i = 0; i < cloneRio.size(); i++) {
					
					if (cloneRio.get(i).calculaArea() <= areaDisponivel){
						//System.out.println("cheio:rio:"+i +" " + cloneRio.get(i).calculaArea());
						areaDisponivel -= cloneRio.get(i).calculaArea();
						cloneRio.remove(i);
						i--;
					}else {
						break;
					}
				}
				tempoTotal += tempoTotalOperacao;
			}
			return tempoTotal;
		}else{
			
			while(!cloneRio.isEmpty() || !cloneMar.isEmpty()) {
				
				areaDisponivel = calcularArea();				
				for (int i = 0; i < cloneRio.size(); i++) {
					if (cloneRio.get(i).calculaArea() <= areaDisponivel){
						//System.out.println("seca:rio:"+i +" " + cloneRio.get(i).calculaArea());
						areaDisponivel -= cloneRio.get(i).calculaArea();
						cloneRio.remove(i);
						i--;
					}else {
						break;
					}
				}
				
				tempoTotal += tempoTotalOperacao;
				
				if (cloneRio.isEmpty() && cloneMar.isEmpty()) {
					break;
				}
				
				areaDisponivel = calcularArea();
				for (int i = 0; i < cloneMar.size(); i++) {
					if (cloneMar.get(i).calculaArea() <= areaDisponivel){
						//System.out.println("seca:mar:"+i +" " + cloneMar.get(i).calculaArea());
						areaDisponivel -= cloneMar.get(i).calculaArea();
						cloneMar.remove(i);
						i--;
					}else {
						break;
					}
				}
				
				tempoTotal += tempoTotalOperacao;
			}
			return tempoTotal;
		}
	}
	
	private ArrayList<Embarcacao> clonaRio(){
		ArrayList<Embarcacao> clone = new ArrayList<Embarcacao>();
		for (Embarcacao embarcacao : rio.getEmbarcacoes()) {
			clone.add(embarcacao);
		}
		return clone;
	}
	
	private ArrayList<Embarcacao> clonaMar(){
		ArrayList<Embarcacao> clone = new ArrayList<Embarcacao>();
		for (Embarcacao embarcacao : mar.getEmbarcacoes()) {
			clone.add(embarcacao);
		}
		return clone;
	}
	
	
	//metodo para inserir navio do rio|mar p/ eclusa
	public void inserirNavio(String sentido) {
		if (sentido.equals("RIO->ECLUSA")) {
			if (embarcacoes.isEmpty()) {				
				if (status.equals("Seca")) {
					if (!rio.getEmbarcacoes().isEmpty()) {
						if (comportaRio.isOpen()) {
							double areaDisponivel = calcularArea();
							while(areaDisponivel >= 0) {
								if (!rio.getEmbarcacoes().isEmpty()) {
									Embarcacao embarcacaoAUX = rio.primeiroDaFila();
									if (embarcacaoAUX.calculaArea() <= areaDisponivel) {
										setEmbarcacoes(embarcacaoAUX);
										Date data = new Date();
										setRecebimentos(new Recebimento(data, calculaPrecoEmbarcacao(embarcacaoAUX), embarcacaoAUX));
										areaDisponivel -= embarcacaoAUX.calculaArea();
										rio.remEmbarcacao();
									}else {
										break;
									}
								}else {
									break;
								}
							}
						}else {
							System.out.println("excecao: a comporta do rio nao esta aberta");
						}						
					}else {
						System.out.println("excecao: nao tem barcos no rio");
					}	
				}else {
					System.out.println("execessa: a eclusa esta cheia");
				}
			}else {
				System.out.println("exececao: precisa tirar barcos da eclusa!");
			}			
		}else if(sentido.equals("MAR->ECLUSA")) {
			if (embarcacoes.isEmpty()) {				
				if (status.equals("Cheia")) {
					if (!mar.getEmbarcacoes().isEmpty()) {
						if (comportaMar.isOpen()) {
							double areaDisponivel = calcularArea();
							while(areaDisponivel >= 0) {
								if (!mar.getEmbarcacoes().isEmpty()) {
									Embarcacao embarcacaoAUX = mar.primeiroDaFila();
									if (embarcacaoAUX.calculaArea() <= areaDisponivel) {
										setEmbarcacoes(embarcacaoAUX);
										Date data = new Date();
										setRecebimentos(new Recebimento(data, calculaPrecoEmbarcacao(embarcacaoAUX), embarcacaoAUX));
										areaDisponivel -= embarcacaoAUX.calculaArea();
										mar.remEmbarcacao();
									}else {
										break;
									}
								}else {
									break;
								}
							}
						}else {
							System.out.println("excecao: a comporta do mar nao esta aberta");
						}						
					}else {
						System.out.println("excecao: nao tem barcos no mar");
					}			
				}else {
					System.out.println("Execessa: a eclusa esta seca");
				}
			}else {
				System.out.println("exececao: precisa tirar barcos da eclusa!");
			}			
		}
	}
	
	
	//metodo para remover embarcacoes da eclusa
	public void removerEmbarcacoes() {
		embarcacoes.clear();
	}
	
	
	//calcula preco da embarcacao
	private float calculaPrecoEmbarcacao(Embarcacao embarcacao) {
		float precoTotal = 0.0f;
		switch(embarcacao.getTipo()) {
			case 0:
				return precoEmbarcacao[0].calculaPreco(embarcacao);
			case 1:
				return precoEmbarcacao[1].calculaPreco(embarcacao);
			case 2:
				return precoEmbarcacao[2].calculaPreco(embarcacao);
			case 3:
				return precoEmbarcacao[3].calculaPreco(embarcacao);
			default:
				return 0.0f;
		}
	}
	
	
	//cadastra precos embarcacao
	public void addPrecosEmbarcacoes(float[] cargueiroR$, float[] petroleiroR$, float[] veleiroR$, float[] lanchaR$) {
		if (cargueiroR$ != null) {
			precoEmbarcacao[0].setTipo(0);
			precoEmbarcacao[0].setValorFixo(cargueiroR$[0]);
			precoEmbarcacao[0].setValorArea(cargueiroR$[1]);
		}
		if (petroleiroR$ != null) {
			precoEmbarcacao[1].setTipo(1);
			precoEmbarcacao[1].setValorFixo(petroleiroR$[0]);
			precoEmbarcacao[1].setValorArea(petroleiroR$[1]);
		}
		if (veleiroR$ != null) {
			precoEmbarcacao[2].setTipo(2);
			precoEmbarcacao[2].setValorFixo(veleiroR$[0]);
			precoEmbarcacao[2].setValorArea(veleiroR$[1]);
		}
		if (lanchaR$ != null) {
			precoEmbarcacao[3].setTipo(3);
			precoEmbarcacao[3].setValorFixo(lanchaR$[0]);
			precoEmbarcacao[3].setValorArea(lanchaR$[1]);
		}
	}
	
	
	//metodos para calcular (sobrecarga)
	public float lucro(int dia, int mes, int ano) {
		if (recebimentos != null) {
			float lucro = 0.0f;
			for (Recebimento recebimento : recebimentos) {
				if (recebimento.getData().getDay() == dia && recebimento.getData().getMonth() == mes && recebimento.getData().getYear() == ano) {
					lucro += recebimento.getValor();
				}
			}
			return lucro;
		}
		return 0.0f;
	}
	
	public float lucro(int mes, int ano) {
		if (recebimentos != null) {
			float lucro = 0.0f;
			for (Recebimento recebimento : recebimentos) {
				if (recebimento.getData().getMonth() == mes && recebimento.getData().getYear() == ano) {
					lucro += recebimento.getValor();
				}
			}
			return lucro;
		}
		return 0.0f;
	}
	
	public float lucro(int ano) {
		if (recebimentos != null) {
			float lucro = 0.0f;
			for (Recebimento recebimento : recebimentos) {
				if (recebimento.getData().getYear() == ano) {
					lucro += recebimento.getValor();
				}
			}
			return lucro;
		}
		return 0.0f;
	}
	
	//Acessadores e Modificadores
	public Rio getRio() {
		return rio;
	}

	public void setRio(Rio rio) {
		if (rio != null) {
			this.rio = rio;
		}
	}

	public Mar getMar() {
		return mar;
	}

	public void setMar(Mar mar) {
		if (mar != null) {
			 this.mar = mar;
		}
			
	}

	public double getCapacidadeMaxima() {
		return capacidadeMaxima;
	}
	
	public void setCapacidadeMaxima(double capacidadeMaxima) {
		if(capacidadeMaxima > 0) {
			this.capacidadeMaxima = capacidadeMaxima;			
		}
	}

	public double getCapacidadeMinima() {
		return capacidadeMinima;
	}

	public void setCapacidadeMinima(double capacidadeMinima) {
		if(capacidadeMinima > 0) {
			this.capacidadeMinima = capacidadeMinima;			
		}
	}

	public double getNivelAtual() {
		return nivelAtual;
	}

	public void setNivelAtual(double nivelAtual) {
		if (nivelAtual >= capacidadeMinima && nivelAtual <= capacidadeMaxima) {
			this.nivelAtual = nivelAtual;			
		}
	}

	public double getVazao() {
		return vazao;
	}

	public void setVazao(double vazao) {
		if(vazao > 0) {
			this.vazao = vazao;			
		}
	}

	public ArrayList<Embarcacao> getEmbarcacoes() {
		return embarcacoes;
	}

	private void setEmbarcacoes(Embarcacao embarcacao) {
		this.embarcacoes.add(embarcacao);
	}

	public PrecoEmbarcacao[] getPrecoEmbarcacao() {
		return precoEmbarcacao;
	}

	private void setPrecoEmbarcacao() {
		 precoEmbarcacao = new PrecoEmbarcacao[4];
		 for(int i = 0; i<4; i++) {
			 precoEmbarcacao[i] = new PrecoEmbarcacao(i);
		 }
	}
	
	public ComportaRio getComportaRio() {
		return comportaRio;
	}

	public ComportaMar getComportaMar() {
		return comportaMar;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		if(status != null && (status.equals("Secando")||status.equals("Enchendo")||status.equals("Seca") || status.equals("Cheia"))) {
			this.status = status;			
		}
	}

	public double getPorcentagemAgua() {
		return porcentagemAgua;
	}

	public double getTotalCaixa() {
		return totalCaixa;
	}

	public void setTotalCaixa(double totalCaixa) {
		if(totalCaixa >= 0) {
			this.totalCaixa = totalCaixa;			
		}
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		if(comprimento > 0) {
			this.comprimento = comprimento;			
		} 
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		if(largura > 0) {
			this.largura = largura;			
		}
	}

	public double getTempoTotalOperaca() {
		return tempoTotalOperacao;
	}

	private void setTempoTotalOperaca() {
		tempoTotalOperacao =  ((capacidadeMaxima - capacidadeMinima)/vazao);
	}

	public ArrayList<Recebimento> getRecebimentos() {
		return recebimentos;
	}

	public void setRecebimentos(Recebimento recebimento) {
		this.recebimentos.add(recebimento);
	}
	
}
