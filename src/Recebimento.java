import java.util.Date;

public class Recebimento {
	private Date data;
	private float valor;
	private Embarcacao embarcacao;
	
	public Recebimento() {
		super();
	}
	
	public Recebimento(Date data, float valor, Embarcacao embarcacao) {
		setData(data);
		setValor(valor);
		setEmbarcacao(embarcacao);
	}
	
	public void setData(Date data) {
		if (data != null) {
			this.data = data;
		}
	}
	
	public Date getData() {
		return data;
	}
	
	public float getValor() {
		return valor;
	}
	
	public void setValor(float valor) {
		if (valor > 0) {
			this.valor = valor;
		}
	}
	
	public Embarcacao getEmbarcacao() {
		return embarcacao;
	}
	
	public void setEmbarcacao(Embarcacao embarcacao) {
		if (embarcacao != null) {
			this.embarcacao = embarcacao;			
		}
	}
	
	
}
