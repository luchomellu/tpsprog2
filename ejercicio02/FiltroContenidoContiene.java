package ejercicio02;

public class FiltroContenidoContiene extends Filtro {
	private String text;
	
	public FiltroContenidoContiene(String text) {
		this.text = text;
	}
	@Override
	public boolean cumple(Documento doc) {
		return doc.getContenido().contains(text);
	}

}
