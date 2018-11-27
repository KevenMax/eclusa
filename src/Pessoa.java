public class Pessoa {
	private String nome;
	private double peso;
	
	public Pessoa() {
		super();
	}
	
	public Pessoa(String nome, double peso) {
		setNome(nome);
		setPeso(peso);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome != null) {
			this.nome = nome;			
		}
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if(peso > 0) {
			this.peso = peso;			
		}
	}
	
	
}
