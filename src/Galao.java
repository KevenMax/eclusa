public class Galao {
	private int identificador;
	private double peso;
	private static int codigo = 10;
	
	public Galao() {
		super();
	}

	public int getIdentificador() {
		return identificador;
	}

	private void setIdentificador() {
		this.identificador = codigo;
		codigo = codigo + 5;
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
