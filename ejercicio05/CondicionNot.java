package ejercicio05;

public class CondicionNot extends Condicion{

	private Condicion f;
	
	public CondicionNot(Condicion f) {
		this.f = f;
	}

	@Override
	public boolean cumple(Pelicula p) {
		return !f.cumple(p);
	}
	
	
}
