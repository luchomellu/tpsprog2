package ejercicio03;

public class FiltroNot extends Filtro{

	private Filtro f;
	
	public FiltroNot(Filtro f) {
		this.f = f;
	}

	@Override
	public boolean cumple(Planta p) {
		return !f.cumple(p);
	}
	
	
}
