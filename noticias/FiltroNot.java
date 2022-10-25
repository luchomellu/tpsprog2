package noticias;

public class FiltroNot implements Filtro{

	private Filtro f;
	
	public FiltroNot(Filtro f) {
		this.f = f;
	}

	@Override
	public boolean cumple(Noticia n) {
		return !f.cumple(n);
	}
	
	
}
