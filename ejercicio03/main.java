package ejercicio03;

public class main {

	public static void main(String[] args) {
		Planta planta1 = new Planta("Epipremnum aureum", "Epipremnum", "Araceae", "Monocotyledoneae", 4, 5);
	    planta1.addNombreVulgar("potus");
	    planta1.addNombreVulgar("pothos");
	    planta1.addNombreVulgar("potos");
	    
	    Planta planta2 = new Planta("Epipremnum pinnatum", "Epipremnum", "Araceae", "Monocotyledoneae", 7, 6);
	    planta2.addNombreVulgar("potus");
	    planta2.addNombreVulgar("pothos");
	    planta2.addNombreVulgar("ciempiés");
	    planta2.addNombreVulgar("vid de tonga");
	    planta2.addNombreVulgar("planta de cola de dragón");

	    Planta planta3 = new Planta("Philodendron", "Fanerógamas", "Araceae", "Liliopsida", 2, 9);
	    Planta planta4 = new Planta("Philodendron xanadu", "Philodendron", "Araceae", "Alismatales", 8, 3);
	    // Como veran me dio fiaca...
	    Planta planta5 = new Planta("planta5", "calificacion4", "familia1", "clase2", 7, 7);
	    planta5.addNombreVulgar("nombreVulgar1");
	    planta5.addNombreVulgar("nombreVulgar2");
	    planta5.addNombreVulgar("nombreVulgar7");
	    Planta planta6 = new Planta("planta6", "calificacion4", "familia1", "clase1", 2, 6);
	    planta6.addNombreVulgar("nombreVulgar1");
	    planta6.addNombreVulgar("nombreVulgar8");
	    planta6.addNombreVulgar("nombreVulgar5");
	    planta6.addNombreVulgar("nombreVulgar0");
	    Planta planta7 = new Planta("planta7", "calificacion1", "familia7", "clase2", 1, 5);
	    planta7.addNombreVulgar("nombreVulgar2");
	    planta7.addNombreVulgar("nombreVulgar1");
	    Planta planta8 = new Planta("planta8", "calificacion1", "familia1", "clase6", 7, 8);
	    planta8.addNombreVulgar("nombreVulgar8");
	    planta8.addNombreVulgar("nombreVulgar2");
	    planta8.addNombreVulgar("nombreVulgar7");
	    Planta planta9 = new Planta("planta9", "calificacion4", "familia4", "clase6", 8, 5);
	    planta9.addNombreVulgar("nombreVulgar3");

	    Vivero vivero = new Vivero();

	    vivero.addPlanta(planta1);
	    vivero.addPlanta(planta2);
	    vivero.addPlanta(planta3);
	    vivero.addPlanta(planta4);
	    vivero.addPlanta(planta5);
	    vivero.addPlanta(planta6);
	    vivero.addPlanta(planta7);
	    vivero.addPlanta(planta8);
	    vivero.addPlanta(planta9);


	    //System.out.println("Todas las plantas: ");
	    //System.out.println(vivero.getTodasLasPlantas());
	    //System.out.println("");
	    System.out.println("Todas las plantas cuyo nombre científico incluya la palabra 'aureum': ");
	    System.out.println(vivero.buscar(new FiltroNombre("aureum")));
	    System.out.println("");
	    System.out.println("Todas las plantas a las que se conozca vulgarmente como 'nombreVulgar2': ");
	    System.out.println(vivero.buscar(new FiltroVulgar("nombreVulgar2")));
	    System.out.println("");
	    System.out.println("Todas las plantas cuya clasificación sea 'Monocotyledoneae': ");
	    System.out.println(vivero.buscar(new FiltroClasificacion("Monocotyledoneae")));
	    System.out.println("");
	    System.out.println("Todas las plantas que requieran un nivel de sol superior a 5 y riego inferior a 3: ");
	    System.out.println(vivero.buscar(new FiltroAnd(
	                                                new FiltroSolMayor(5), 
	                                                new FiltroRiegoMenor(3)
	                                                )));
	    System.out.println("");
	    System.out.println("Todas las plantas que requieran un nivel de sol inferior a 4 y riego superior a 4: ");
	    System.out.println(vivero.buscar(new FiltroAnd(
	                                                new FiltroSolMenor(4), 
	                                                new FiltroRiegoMayor(4)
	                                                )));
	    System.out.println("");
	    //System.out.println("Todas las plantas de interior que necesiten poco riego (inferior a 3): ");
	    //System.out.println(vivero.buscar(new FiltroAnd(new CondicionTipo("interior"), new CondicionRiegoMenorA(3))));
	    //System.out.println("");

	}

}
