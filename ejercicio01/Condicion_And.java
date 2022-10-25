package ejercicio01;

public class Condicion_And extends Condicion{
	private Condicion c1;
	private Condicion c2;

	public Condicion_And(Condicion c1, Condicion c2){
		this.c1 = c1;
	    this.c2 = c2;
	}

	@Override
	public boolean esValido(Producto_Quimico p) {
		return c1.esValido(p) && c2.esValido(p);
	}
}
