package ejercicio01;

public class Condicion_Cultivo extends Condicion {
	private Cultivo cultivo;

	  public Condicion_Cultivo(Cultivo cultivo){
	    this.cultivo = cultivo;
	  }
	@Override
	public boolean esValido(Producto_Quimico producto) {
		return producto.apto(cultivo);
	}

}
