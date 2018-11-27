
public abstract class Embarcacao {
	private double pesoMaximo;
	private String pais;
	private int codigoIdentificacao;
	private String condutor;
	private String sentido;
	private double comprimento;
	private double largura;
	private int tipo;
	private static int codigo = 1000;
	
	public Embarcacao() {
		super();
	}
	
	public Embarcacao(double pesoMaximo, String pais, String condutor, String sentido, double comprimento, double largura) {
		setPesoMaximo(pesoMaximo);
		setPais(pais);
		setCondutor(condutor);
		setSentido(sentido);
		setComprimento(comprimento);
		setLargura(largura);
		setCodigoIdentificacao();
	}
	
	
	
	//metodo para calcular area
	public double calculaArea() {
		return comprimento*largura;
	}
	
	public abstract void calcularPeso();
	//metodos modificadores e acessadores
	public double getPesoMaximo() {
		return pesoMaximo;
	}
	public void setPesoMaximo(double pesoMaximo) {
		if(pesoMaximo > 0) {
			this.pesoMaximo = pesoMaximo;
		}
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		if(pais != null) {
			this.pais = pais;			
		}
	}
	public int getCodigoIdentificacao() {
		return codigoIdentificacao;
	}
	private void setCodigoIdentificacao() {
		this.codigoIdentificacao = codigo;
		codigo = codigo + 10;
	}
	public String getCondutor() {
		return condutor;
	}
	public void setCondutor(String condutor) {
		if(condutor != null) {
			this.condutor = condutor;			
		}
	}
	public String getSentido() {
		return sentido;
	}
	public void setSentido(String sentido) {
		if(sentido == "RIO->MAR" || sentido == "MAR->RIO") {
			this.sentido = sentido;			
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
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		if(tipo >= 1 && tipo <= 4) {
			this.tipo = tipo;			
		}
	}
		
}
