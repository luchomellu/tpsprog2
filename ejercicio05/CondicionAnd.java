package ejercicio05;

public class CondicionAnd extends Condicion {
	  private Condicion f1;
	  private Condicion f2;

	  public CondicionAnd(Condicion c1, Condicion c2){
	    this.f1 = c1;
	    this.f2 = c2;
	  }
	  @Override
	  public boolean cumple(Pelicula p) {
	    return f1.cumple(p) && f2.cumple(p);
	  }

}
