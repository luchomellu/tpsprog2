package ejercicio02;

public class FiltroOr extends Filtro {
	 private Filtro f1;
	 private Filtro f2;

	 public FiltroOr(Filtro c1, Filtro c2){
		 this.f1 = c1;
		 this.f2 = c2;
	 }
	 @Override
	 public boolean cumple(Documento documento) {
		 return f1.cumple(documento) || f2.cumple(documento);
	 }

}
