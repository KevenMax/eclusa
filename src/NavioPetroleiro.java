import java.util.ArrayList;

public class NavioPetroleiro extends Embarcacao {
	
	private ArrayList<Galao> galoes;
	private String portoOrigem;
	private String portoDestino;
	
	public NavioPetroleiro() {
		super();
	}
	
	public NavioPetroleiro(double pesoMaximo, String pais, String condutor, String sentido, double comprimento, double largura, String portoOrigem, String portoDestino) {
		super(pesoMaximo, pais, condutor, sentido, comprimento, largura);
		setPortoOrigem(portoOrigem);
		setPortoDestino(portoDestino);
	}
	
	@Override
	public void calcularPeso() {
		
	}
	
	public ArrayList<Galao> getGaloes() {
		return galoes;
	}

	public void setGaloes(Galao galao) {
		galoes.add(galao);
	}

	public String getPortoOrigem() {
		return portoOrigem;
	}
	
	public void setPortoOrigem(String portoOrigem) {
		if(portoOrigem != null) {
			this.portoOrigem = portoOrigem;			
		}
	}

	public String getPortoDestino() {
		return portoDestino;
	}
	
	public void setPortoDestino(String portoDestino) {
		if(portoDestino != null) {
			this.portoDestino = portoDestino;			
		}
	}


	
	

}
