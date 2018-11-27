import java.util.ArrayList;

public class Lancha extends Embarcacao {
	
	private ArrayList<Pessoa> tripulacao;
	
	public Lancha() {
		super();
	}

	public Lancha(double pesoMaximo, String pais, String condutor, String sentido, double comprimento, double largura) {
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
