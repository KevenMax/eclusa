import java.util.ArrayList;

public class NavioCargueiro extends Embarcacao{

	private ArrayList<Container> containers;
	private String portoOrigem;
	private String portoDestino;
	
	public NavioCargueiro() {
		super();
	}
	
	public NavioCargueiro(double pesoMaximo, String pais, String condutor, String sentido, double comprimento, double largura, String portoOrigem, String portoDestino) {
		setPesoMaximo(pesoMaximo);
		setPais(pais);
		setCondutor(condutor);
		setSentido(sentido);
		setComprimento(comprimento);
		setLargura(largura);
		setPortoOrigem(portoOrigem);
		setPortoDestino(portoDestino);
	}

	@Override
	public void calcularPeso() {
		
	}
	
	public ArrayList<Container> getContainers() {
		return containers;
	}

	public void setContainers(Container container) {
		this.containers.add(container);
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
