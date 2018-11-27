
public class ComportaRio {
	
	private Eclusa eclusa;
	private boolean open;
	
	public ComportaRio(Eclusa eclusa) {
		this.eclusa = eclusa;
	}
		
	public void openComporta() {
		if (!eclusa.getStatus().equals("Secando") && !eclusa.getStatus().equals("Enchendo") && !eclusa.getStatus().equals("Cheia")) {
			if (!isOpen()) {
				open = true;
			}else {
				System.out.println("Excessao: comportaRio ja esta aberta");
			}
		}else {
			System.out.println("Excessao: comportaRio nao pode abrir agora!");
		}
	}
	
	public void closeComporta() {
		if (isOpen()) {
			open = false;
		}else {
			System.out.println("Excessao: comportaRio ja esta fechada");
		}		
	}
	
	public boolean isOpen() {
		return open;
	}

}
