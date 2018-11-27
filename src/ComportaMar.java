
public class ComportaMar {
	private Eclusa eclusa;
	private boolean open;
	
	public ComportaMar(Eclusa eclusa) {
		this.eclusa = eclusa;
	}
		
	public void openComporta() {
		if (!eclusa.getStatus().equals("Secando") && !eclusa.getStatus().equals("Enchendo") && !eclusa.getStatus().equals("Seca")) {
			if (!isOpen()) {
				open = true;
			}else {
				System.out.println("Excessao: comportaMar já esta aberta!");
			}
		}else {
			System.out.println("Excessao: comportaMar nao pode abrir agora!");
		}
	}
	
	public void closeComporta() {
		if (isOpen()) {
			open = false;
		}else {
			System.out.println("Excessao: comportaMar já esta fechada!");
		}
	}
	
	public boolean isOpen() {
		return open;
	}

}
