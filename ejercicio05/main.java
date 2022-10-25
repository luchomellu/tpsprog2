package ejercicio05;

public class main {

	public static void main(String[] args) {
		// Instanciacion de peliculas
	    Pelicula pelicula1 = new Pelicula("Batman: el caballero de la noche asciende", "Ocho a�os despu�s de asumir la culpa por la muerte de Harvey Dent y desaparecer en la noche, Batman se ve obligado a salir del exilio autoimpuesto gracias a una ladrona astuta y a un terrorista despiadado.", "Christopher Nolan", 2012, 165, 13);
	    pelicula1.addGenero("accion");
	    pelicula1.addGenero("policial");
	    pelicula1.addGenero("drama");
	    pelicula1.addGenero("thriller");
	    pelicula1.addGenero("actor1");
	    pelicula1.addGenero("actor7");
	    pelicula1.addActor("actor3");
	    pelicula1.addActor("actor9");
	    pelicula1.addActor("actor10");
	    
	    Pelicula pelicula2 = new Pelicula("Blonde", "Una mirada al ascenso a la fama y la �pica desaparici�n de la actriz Marilyn Monroe, una de las estrellas m�s grandes del mundo.", "Andrew Dominik", 2022, 166, 16);
	    pelicula2.addGenero("drama");
	    pelicula2.addActor("actor1");
	    pelicula2.addActor("actor4");
	    pelicula2.addActor("actor2");
	    pelicula2.addActor("actor8");
	    
	    Pelicula pelicula3 = new Pelicula("El Camino", "Tras un dram�tico escape de su cautiverio, Jesse Pinkman debe lidiar con su pasado para pensar en un futuro.", "Vince Gilligan", 2019, 122, 16);
	    pelicula3.addGenero("drama");
	    pelicula3.addGenero("crimen");
	    pelicula3.addActor("actor4");
	    pelicula3.addActor("actor2");
	    pelicula3.addActor("actor5");
	    pelicula3.addActor("actor6");
	    
	    Pelicula pelicula4 = new Pelicula("1917", "Durante la Primera Guerra Mundial, dos j�venes soldados brit�nicos reciben una orden, aparentemente, imposible de ejecutar: en una carrera contra el reloj, deben infiltrarse en territorio enemigo para entregar un mensaje que podr�a salvar a miles de compa�eros.", "Sam Mendes", 2019, 119, 13);
	    pelicula4.addGenero("guerra");
	    pelicula4.addGenero("drama");
	    pelicula4.addGenero("historia");
	    pelicula4.addGenero("accion");
	    pelicula4.addGenero("ficcion");
	    pelicula4.addActor("actor2");
	    pelicula4.addActor("actor3");
	    pelicula4.addActor("actor7");
	    pelicula4.addActor("actor11");
	    
	    Pelicula pelicula5 = new Pelicula("Nosotros", "Adelaide y su esposo viajan a la casa en la que ella creci� junto a la playa. Tiene un presentimiento siniestro que precede a un encuentro espeluznante: cuatro enmascarados se presentan ante su casa. Lo aterrador viene cuando muestran sus rostros.", "Jordan Peele", 2019, 121, 16);
	    pelicula5.addGenero("thriller");
	    pelicula5.addGenero("terror");
	    pelicula5.addActor("actor2");
	    pelicula5.addActor("actor3");
	    pelicula5.addActor("actor1");
	    pelicula5.addActor("actor6");
	    
	    Pelicula pelicula6 = new Pelicula("Psic�pata americano", "En la d�cada de 1980, Patrick Bateman es un hombre exitoso y obsesionado por la competencia y por la perfecci�n material, quien utiliza los m�s caros cosm�ticos masculinos, equipos de gimnasia, sol�rium y dem�s maquinaria est�tica para lograr un cuerpo atl�tico y bien acicalado, identificador material del �xito social.", "Mary Harron", 2000, 102, 16);
	    pelicula6.addGenero("thriller");
	    pelicula6.addGenero("comedia");
	    pelicula6.addGenero("drama");
	    pelicula6.addGenero("policial");
	    pelicula6.addActor("actor1");
	    pelicula6.addActor("actor2");
	    pelicula6.addActor("actor3");
	    pelicula6.addActor("actor4");
	    
	    Pelicula pelicula7 = new Pelicula("La teor�a del todo", "Durante los a�os sesenta, el estudiante de la Universidad de Cambridge y futuro f�sico Stephen Hawking se enamora de su compa�era Jane Wilde. A pesar de que le diagnostican una enfermedad devastadora, �l y Jane abren nuevos caminos cient�ficos.", "James Marsh", 2015, 123, 10);
	    pelicula7.addGenero("drama");
	    pelicula7.addGenero("romantico");
	    pelicula7.addActor("actor4");
	    pelicula7.addActor("actor3");
	    pelicula7.addActor("actor7");
	    pelicula7.addActor("actor9");

	    // La condicion especificada fue la de: "Pel�culas cuya duraci�n sea menor a 120 minutos, que no sean del g�nero 'comedia'"
	    Plataforma plataforma = new Plataforma(new CondicionAnd(new CondicionDuracionMenor(120),new CondicionNot(new CondicionGenero("comedia"))));
	    // Agregando las peliculas a la plataforma
	    plataforma.addPelicula(pelicula1);
	    plataforma.addPelicula(pelicula2);
	    plataforma.addPelicula(pelicula3);
	    plataforma.addPelicula(pelicula4);
	    plataforma.addPelicula(pelicula5);
	    plataforma.addPelicula(pelicula6);
	    plataforma.addPelicula(pelicula7);

	    /**
	     * Verificando si una pelicula va a ser rentable (o no) 
	     * [Esto se puede ejecutar sin siquiera haber agregado previamente la pelicula a la plataforma]
	     * [Lo ideal calculo que seria que al agregar una pelicula, internamente verifique si es rentable o no,
	     * y que en caso de que no lo sea NO la agregue]
	     */
	    System.out.println("La pelicula '" + pelicula1.getTitulo() + "' ser� rentable: " + plataforma.esRentable(pelicula1));
	    // Tira false porque la pelicula NO dura menos que 120 minutos
	    System.out.println("");

	    
	    System.out.println("Buscar todas las pel�culas que en el t�tulo contenga la palabra 'de': ");
	    System.out.println(plataforma.buscar(new CondicionTituloContiene("de")));
	    System.out.println("");
	    System.out.println("Buscar todas las pel�culas que contengan el genero 'comedia': ");
	    System.out.println(plataforma.buscar(new CondicionGenero("comedia")));
	    System.out.println("");
	    System.out.println("Buscar todas las pel�culas en las que haya actuado 'actor1' y cuyo director NO haya sido 'Andrew Dominik': ");
	    System.out.println(plataforma.buscar(new CondicionAnd(
	                                                      new CondicionActor("actor1"), 
	                                                      new CondicionNot(
	                                                        new CondicionDirector("Andrew Dominik"))
	                                                    )));
	    System.out.println("");
	    System.out.println("Buscar todas las pel�culas que se hayan grabado antes del 2015 y cuya duraci�n sea menor a 120 minutos: ");
	    System.out.println(plataforma.buscar(new CondicionAnd(new CondicionAnioMenor(2015),new CondicionDuracionMenor(120))));
	    System.out.println("");

	}

}
