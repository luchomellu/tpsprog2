package ejercicio05;

public class CondicionDirector extends Condicion{

	private String director;
	
	public CondicionDirector(String d) {
		this.director = d;
	}
	@Override
	public boolean cumple(Pelicula p) {
		return p.getDirector().equals(director);
	}

}
