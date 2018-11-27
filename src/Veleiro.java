import java.util.ArrayList;

public class Veleiro extends Embarcacao {

	private ArrayList<Pessoa> tripulacao;
	
	public Veleiro() {
		super();
	}

	public Veleiro(double pesoMaximo, String pais, String condutor, String sentido, double comprimento, double largura) {
		super(pesoMaximo, pais, condutor, sentido, comprimento, largura);
	}
	
	@Override
	public void calcularPeso() {
		
	}

	public ArrayList<Pessoa> getTripulacao() {
		return tripulacao;
	}

	public void setTripulacao(Pessoa pessoa) {
		this.tripulacao.add(pessoa);
	}
	
	

}
