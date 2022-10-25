package noticias;

public class FiltroOr implements Filtro {
	private Filtro f1;
	private Filtro f2;

	public FiltroOr(Filtro c1, Filtro c2){
		this.f1 = c1;
		this.f2 = c2;
	}
	
	@Override
	public boolean cumple(Noticia n) {
		return f1.cumple(n) || f2.cumple(n);
	}

}
