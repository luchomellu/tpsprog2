package sistemaElectoral;

import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		Candidato c1 = new Candidato("Chustin", "Peronismo", "Agrupacion Anti Pova");
		Candidato c2 = new Candidato("Benja", "Anarquismo Para Todos", "Movimiento Drogas Libres");
		Candidato c3 = new Candidato("Nene", "Conservador", "Furbo");
		Candidato c4 = new Candidato("Portox", "Liberal", "zzz");
		Candidato c7 = new Candidato("Facu", "Liberal", "zzz");
		Candidato c5 = new Candidato("Isa", "Liberal", "Racismo no more");
		Candidato c6 = new Candidato("Lolo", "Partido Obrero", "Aguante Japon");
		
		Lugar mesa1 = new Mesa("Mesa 1");
		mesa1.addDNI(1);
		mesa1.addDNI(2);
		mesa1.addDNI(3);
		mesa1.addDNI(4);
		((Mesa) mesa1).votar(1, c1);
		((Mesa) mesa1).votar(2, c1);
		((Mesa) mesa1).votar(3, c4);
		((Mesa) mesa1).votar(4, c5);
		
		System.out.println("Cantida de votos en mesa 1: " + mesa1.getCantVotos());
		Lugar mesa2 = new Mesa("Mesa 2");
		mesa1.addDNI(5);
		mesa1.addDNI(6);
		mesa1.addDNI(7);
		mesa1.addDNI(8);
		mesa1.addDNI(9);
		mesa1.addDNI(10);
		Lugar mesa3 = new Mesa("Mesa 3");
		mesa1.addDNI(11);
		mesa1.addDNI(12);
		mesa1.addDNI(13);
		mesa1.addDNI(14);
		mesa1.addDNI(15);
		mesa1.addDNI(16);
		Lugar mesa4 = new Mesa("Mesa 4");
		mesa1.addDNI(17);
		mesa1.addDNI(18);
		Lugar mesa5 = new Mesa("Mesa 5");
		mesa1.addDNI(19);
		mesa1.addDNI(20);
		mesa1.addDNI(21);
		mesa1.addDNI(22);
		Lugar mesa6 = new Mesa("Mesa 6");
		mesa1.addDNI(99);
		
		Lugar cole1 = new ConjuntoMesas("Colegio Hermanas");
		Lugar cole2 = new ConjuntoMesas("Colegio Danes");
		Lugar cole3 = new ConjuntoMesas("Colegio Capuchinos");
		
		Lugar barrio1 = new ConjuntoMesas("Centro");
		Lugar barrio2 = new ConjuntoMesas("Los Pibes");
	
		
		Lugar ciudad = new ConjuntoMesas("Necochea");
		ciudad.addCandidato(c1);
		ciudad.addCandidato(c2);
		ciudad.addCandidato(c3);
		ciudad.addCandidato(c4);
		ciudad.addCandidato(c5);
		ciudad.addCandidato(c6);
		ciudad.addCandidato(c7);
		
		Comparator<Candidato> partido = new ComparadorPartido();
        Comparator<Candidato> nombre = new ComparadorNombre();
        Comparator<Candidato> agrupacion = new ComparadorAgrupacion();
        Comparator<Candidato> partido_agrupacion = new ComparadorMultiple(partido,agrupacion);
        Comparator<Candidato> todo = new ComparadorMultiple(partido_agrupacion,nombre);
		
        System.out.println(ciudad.getCandidatos());
        System.out.println(" ");
		System.out.println(ciudad.getCandidatosOrdenado(todo));
		
		
	}

}
