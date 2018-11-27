import java.util.ArrayList;

public class Mar {

	private String nome;
	private ArrayList<Embarcacao> embarcacoes;
	
	public Mar() {
		super();
	}
	
	public Mar(String nome) {
		super();
		setNome(nome);
		embarcacoes = new ArrayList<Embarcacao>();
	}
	
	public ArrayList<Embarcacao> getEmbarcacoes() {
		return this.embarcacoes;
	}

	public void addEmbarcacao(Embarcacao embarcacao) {
		if (embarcacao != null) {	
			this.embarcacoes.add(embarcacao);
		}
	}	
	
	public Embarcacao remEmbarcacao() {
		if (!embarcacoes.isEmpty()) {
			Embarcacao aux = embarcacoes.get(0); 
			embarcacoes.remove(0);
			return aux;
		}
		return null;
	}
	
	public Embarcacao primeiroDaFila() {
		if (!embarcacoes.isEmpty()) {
			return embarcacoes.get(0); 			
		}
		return null;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome != null) {
			this.nome = nome;			
		}
	}	

}
