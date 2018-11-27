
public class PrecoEmbarcacao {
	private int tipo;
	private float valorFixo;
	private float valorArea;
	
	
	public PrecoEmbarcacao() {
		
	}
	
	public PrecoEmbarcacao(int tipo) {
		setTipo(tipo);
	}
	
	public PrecoEmbarcacao(int tipo, float valorFixo, float valorArea) {
		setTipo(tipo);
		setValorFixo(valorFixo);
		setValorArea(valorArea);
	}
	
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		if (tipo >= 0 && tipo <= 3) {
			this.tipo = tipo;
		}
	}
	public float getValorFixo() {
		return valorFixo;
	}
	public void setValorFixo(float valorFixo) {
		this.valorFixo = valorFixo;
	}
	public float getValorArea() {
		return valorArea;
	}
	public void setValorArea(float valorArea) {
		this.valorArea = valorArea;
	}
	
	public float calculaPreco(Embarcacao embarcacao) {
		return valorFixo + (float)embarcacao.calculaArea()*valorArea;
	}
}