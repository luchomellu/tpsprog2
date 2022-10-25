package ejercicio02;

public class FiltroNot extends Filtro{

	private Filtro f;
	
	public FiltroNot(Filtro f) {
		this.f = f;
	}

	@Override
	public boolean cumple(Documento doc) {
		return !f.cumple(doc);
	}
	
	
}
