package ejercicio02;

public class FiltroTituloExacto extends Filtro {
	
	private String titulo;
	
	public FiltroTituloExacto(String t) {
		this.titulo = t;
	}
	@Override
	public boolean cumple(Documento doc) {
		return doc.getTitulo().equalsIgnoreCase(this.titulo);
	}

}
