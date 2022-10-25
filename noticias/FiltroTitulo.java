package noticias;

public class FiltroTitulo implements Filtro {

	private String titulo;
	
	public FiltroTitulo(String t) {
		this.titulo = t;
	}
	@Override
	public boolean cumple(Noticia n) {
		return n.getTitulo().equals(this.titulo);
	}

}
