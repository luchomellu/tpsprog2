package noticias;

public class FiltroTextoLargoMayor implements Filtro {
	private int largo;
	
	public FiltroTextoLargoMayor(int largo) {
		this.largo = largo;
	}
	@Override
	public boolean cumple(Noticia n) {
		return n.getTexto().length() > this.largo;
	}

}
