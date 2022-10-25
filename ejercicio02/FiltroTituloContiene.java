package ejercicio02;

public class FiltroTituloContiene extends Filtro {
	private String text;
	
	public FiltroTituloContiene(String t) {
		this.text = t;
	}
	@Override
	public boolean cumple(Documento doc) {
		return doc.getTitulo().contains(this.text);
	}

}
