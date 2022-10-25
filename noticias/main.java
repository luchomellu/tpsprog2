package noticias;

public class main {

	public static void main(String[] args) {
		SitioWeb n1 = new Noticia("Hackean a Iran", "Si flaco, lo que lees... hackearon a Iran", "Emmmmmm eso", "Chustin", "link1");
		((Noticia) n1).addPalabrasClave("Iran");
		SitioWeb n2 = new Noticia("Chustin dijo que hackearon a Iran", "Que pajero es Chustin", "I get knock down, but I get up again cos they never gonna break me down", "Lucho", "link2");
		((Noticia) n1).addPalabrasClave("Pajaros");
		SitioWeb n3 = new Noticia("Kanye West antisemita?", "Dichos controversiales de Kanye en una entrevista", "Kanye basta por favor, toma las pastillas", "El pueblo", "link3");
		((Noticia) n1).addPalabrasClave("Kanye");
		SitioWeb n4 = new Noticia("Boca Campeon", "Empato con el Rojo", "VAMO BOCAAAAAAAAAAAAA", "Chime", "link4");
		((Noticia) n1).addPalabrasClave("Boca");
		
		SitioWeb s1 = new Seccion("Generales", "algo", "x");
		SitioWeb s2 = new Seccion("Musica", "glog", "x");
		SitioWeb s3 = new Seccion("Otro Cancelado", "algo", "x");
		SitioWeb s4 = new Seccion("Politica", "algo", "x");
		SitioWeb s5 = new Seccion("Deportes", "algo", "x");
		SitioWeb s6 = new Seccion("Futbol", "algo", "x");
		
		//agrego noticia kanye a Otro cancelado
		((Seccion) s3).addContenido(n3);
		//agrego noticia iran a Politica
		((Seccion) s4).addContenido(n1);
		//agrego noticia iran a Politica
		((Seccion) s4).addContenido(n2);
		//agrego noticia boca a Futbol
		((Seccion) s6).addContenido(n4);
		//agrego Otro cancelado a Musica
		((Seccion) s2).addContenido(s3);
		//agrego Musica a Generales
		((Seccion) s1).addContenido(s2);
		//agrego Politica a Generales
		((Seccion) s1).addContenido(s4);
		//agrego Futbol a Deportes
		((Seccion) s5).addContenido(s6);
		//agrego Deportes a Generales
		((Seccion) s1).addContenido(s5);
		
		System.out.println(s1.toString());
		System.out.println(s1.getCantNoticias());
		
	}

}
