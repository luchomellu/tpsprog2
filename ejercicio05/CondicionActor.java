package ejercicio05;

public class CondicionActor extends Condicion {

	private String actor;
	
	public CondicionActor(String a) {
		this.actor = a;
	}
	@Override
	public boolean cumple(Pelicula p) {
		return p.getActores().contains(actor);
	}

}
