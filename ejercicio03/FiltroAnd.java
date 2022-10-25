package ejercicio03;

public class FiltroAnd extends Filtro {
	  private Filtro f1;
	  private Filtro f2;

	  public FiltroAnd(Filtro c1, Filtro c2){
	    this.f1 = c1;
	    this.f2 = c2;
	  }
	  @Override
	  public boolean cumple(Planta p) {
	    return f1.cumple(p) && f2.cumple(p);
	  }

}
