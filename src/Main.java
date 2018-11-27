
public class Main {
	public static void main(String[] args) {
		Eclusa e = new Eclusa(550.0, 200.0, 30.0, 8.0, 1.0, "Seca");
		Rio rio = new Rio("itapecuru");
		Mar mar = new Mar("Atlantico");
		
		Lancha lancha1 = new Lancha(1, "brasil", "luis", "MAR->RIO", 2, 1);
		Lancha lancha2 = new Lancha(1, "brasil", "luisa", "MAR->RIO", 1, 1);
		Lancha lancha3 = new Lancha(1, "brasil", "luismelo", "MAR->RIO", 8, 1);
		

		Lancha lancha4 = new Lancha(1, "brasil", "luis", "RIO->MAR", 3, 1);
		Lancha lancha5 = new Lancha(1, "brasil", "luisa", "RIO->MAR", 7, 1);
		Lancha lancha6 = new Lancha(1, "brasil", "luismelo", "RIO->MAR", 5, 1);
		Lancha lancha7 = new Lancha(1, "brasil", "luismelo", "RIO->MAR", 3, 1);
		
		mar.addEmbarcacao(lancha1);
		mar.addEmbarcacao(lancha2);
		mar.addEmbarcacao(lancha3);
		
		rio.addEmbarcacao(lancha4);
		rio.addEmbarcacao(lancha5);
		rio.addEmbarcacao(lancha6);
		rio.addEmbarcacao(lancha7);
		
		e.setRio(rio);
		e.setMar(mar);
		
		float cargueiroR$[] = new float[2];
			cargueiroR$[0] = 2f;
			cargueiroR$[1] = 5f;
		float petroleiroR$[] = new float[2];
			petroleiroR$[0] = 2f;
			petroleiroR$[1] = 5f;
		float veleiroR$[] = new float[2];
			veleiroR$[0] = 2f;
			veleiroR$[1] = 5f;
		float lanchaR$[] = new float[2];
			lanchaR$[0] = 2f;
			lanchaR$[1] = 5f;
		e.addPrecosEmbarcacoes(cargueiroR$, petroleiroR$, veleiroR$, lanchaR$);
		
//		e.inserirNavio("RIO->ECLUSA");
//		e.diminuirNivelDagua();
//		e.inserirNavio("RIO->ECLUSA");
//		rio.addEmbarcacao(lancha4);
//		rio.addEmbarcacao(lancha5);
//		rio.addEmbarcacao(lancha6);
//		e.inserirNavio("RIO->ECLUSA");
//		e.getComportaRio().openComporta();
//		e.inserirNavio("RIO->ECLUSA");
//		System.out.println(e.getRio().getEmbarcacoes().size());
	}
}
