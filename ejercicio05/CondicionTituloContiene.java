package ejercicio05;

public class CondicionTituloContiene extends Condicion {
	
	private String text;
	
	public CondicionTituloContiene(String t) {
		this.text = t;
	}
	@Override
	public boolean cumple(Pelicula p) {
		return p.getTitulo().contains(this.text);
	}

}
