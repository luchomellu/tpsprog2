package noticias;

public class FiltroClave implements Filtro {

	private String clave;
	
	public FiltroClave(String c) {
		this.clave = c;
	}
	@Override
	public boolean cumple(Noticia n) {
		return n.getPalabrasClave().contains(this.clave);
	}

}
