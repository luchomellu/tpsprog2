package ejercicio02;

public class main {

	public static void main(String[] args) {
		 Documento doc1 = new Documento("La se�ora March", "Una novela ambientada en el exquisito Upper East Side de Nueva York donde vive la se�ora March, la mujer de un exitoso escritor que disfruta de su estilo de vida hasta que una dependienta de su panader�a le pregunta si su marido se ha inspirado en ella para crear a su protagonista, una pat�tica prostituta");
		    doc1.addAutor("Virginia Feito");
		    doc1.addPalabraClave("novela");
		    doc1.addPalabraClave("entretenido");
		    doc1.addPalabraClave("amor");

		    Documento doc2 = new Documento("Violeta", "Esta es la �pica y emocionante historia de una mujer cuya vida abarca los momentos hist�ricos m�s relevantes del siglo XX. Desde 1920 (con la llamada 'gripe espa�ola') hasta la pandemia de 2020, la vida de Violeta es mucho m�s que la historia de un siglo. Vista con los ojos de una mujer poseedora de una pasi�n, una determinaci�n y un sentido del humor inolvidables (que la sostienen a lo largo de una vida turbulenta), Isabel Allende regala a sus lectores, otra historia �pica inspiradora y emotiva.");
		    doc2.addAutor("Isabel Allende");
		    doc2.addPalabraClave("epica");
		    doc2.addPalabraClave("inspiradora");
		    doc2.addPalabraClave("movida");

		    Documento doc3 = new Documento("Todas esas cosas que te dir� ma�ana", "Miranda trabaja como subdirectora en una revista de moda y es feliz junto a su pareja, Trist�n. Por eso no entiende que la est� dejando. Ojal� pudiera dar marcha atr�s y volver al momento en que se conocieron... Pero �y si realmente tuviera la oportunidad de cambiar su historia? Haciendo gala de una destreza excepcional, El�sabet Benavent golpea el coraz�n de los lectores con una historia de saltos en el tiempo que reconstruye de forma hilarante y aleatoria los momentos estelares de una relaci�n de pareja.");
		    doc3.addAutor("El�sabet Benvent");
		    doc3.addPalabraClave("amor");
		    doc3.addPalabraClave("inspiradora");
		    doc3.addPalabraClave("emotiva");

		    Documento doc4 = new Documento("Brillo", "Libro favorito de Barack Obama, best seller en la lista de The New York Times y adaptaci�n en curso a serie de HBO, Brillo cuenta la historia de Edie, una joven afroamericana de 23 a�os que tiene una aventura con un hombre blanco casado de 41. Este matrimonio privilegiado, pero progresista, la invita a trabajar en su casa. El hogar, lleno de tensiones y descubrimientos, se convierte entonces en otra cosa.");
		    doc4.addAutor("Raven Leilani");
		    doc4.addPalabraClave("encantador");
		    doc4.addPalabraClave("best seller");

		    Documento doc5 = new Documento("El principito", "El Principito es el libro infantil m�s le�do de la historia, aunque muchos lo catalogan como una obra para todas las edades, con reflexiones profundas sobre temas como el amor, la amistad, la soledad o la rutina. Sin duda, la forma de interpretarlo cambia con la edad y en el momento vital en el que te encuentres.");
		    doc5.addAutor("Antoine de Saint-Exup�ry");
		    //doc5.addPalabraClave("infantil");
		    //doc5.addPalabraClave("muy leido");

		    Documento doc6 = new Documento("La bestia", "La que se li� cuando, al recibir el Premio Planeta 2021, se descubri� que la nueva reina de la novela negra en espa�ol eran tres hombres. Sin embargo, no ha afectado al prestigio y ventas de su �ltimo libro. En La bestia corre el a�o 1834 y Madrid, una peque�a ciudad que trata de abrirse paso m�s all� de las murallas que la rodean, sufre una terrible epidemia de c�lera. Pero la peste no es lo �nico que aterroriza a sus habitantes: en los arrabales aparecen cad�veres desmembrados de ni�as que nadie reclama. Todos los rumores apuntan a un ser a quien nadie ha visto pero al que todos temen.");
		    doc6.addAutor("Carmen Mola");
		    doc6.addPalabraClave("gan� un premio");
		    doc6.addPalabraClave("accion");
		    doc6.addPalabraClave("thriller");

		    Documento doc7 = new Documento("La casa de los espiritus", "La novela narra la historia de cuatro generaciones de la familia Trueba, desde inicios del siglo XX hasta la d�cada de 1970, con el tel�n de fondo de diversos episodios de la historia de Chile que se entrecruzan con las experiencias y relatos de los personajes femeninos de N�vea, Clara, Blanca y Alba.");
		    doc7.addAutor("Isabel Allende");
		    doc7.addPalabraClave("novela");
		    doc7.addPalabraClave("thriller");
		    
		    Coleccion coleccion = new Coleccion();
		    
		    coleccion.addDocumento(doc1);
		    coleccion.addDocumento(doc2);
		    coleccion.addDocumento(doc3);
		    coleccion.addDocumento(doc4);
		    coleccion.addDocumento(doc5);
		    coleccion.addDocumento(doc6);
		    coleccion.addDocumento(doc7);
		    
		    
		    System.out.println("Titulo igual a 'La casa de los espiritus': ");
		    System.out.println(coleccion.buscar(new FiltroTituloExacto("La casa de los espiritus")));
		    System.out.println("");
		    System.out.println("Titulo contiene 'a': ");
		    System.out.println(coleccion.buscar(new FiltroTituloContiene("a")));
		    System.out.println("");
		    System.out.println("Palabras claves contiene la palabra 'thriller': ");
		    System.out.println(coleccion.buscar(new FiltroClave("thriller")));
		    System.out.println("");
		    System.out.println("Palabras claves NO contiene palabra clave: ");
		    System.out.println(coleccion.buscar(new FiltroClaveEmpty()));
		    System.out.println("");
		    System.out.println("Uno de los autores fue 'Isabel Allende': ");
		    System.out.println(coleccion.buscar(new FiltroAutor("Isabel Allende")));
		    System.out.println("");
		    System.out.println("Contenido contiene la palabra 'novela': ");
		    System.out.println(coleccion.buscar(new FiltroContenidoContiene("novela")));
		    System.out.println("");
		    System.out.println("Contenido almenos 80 palabras: ");
		    System.out.println(coleccion.buscar(new FiltroContenidoTamanio()));
	}

}
