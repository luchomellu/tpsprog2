package ejercicio02;

public class FiltroContenidoTamanio extends Filtro {
	private final static int tamanio = 20;
	@Override
	public boolean cumple(Documento doc) {
		return doc.getContenido().length() >= tamanio;
	}

}
