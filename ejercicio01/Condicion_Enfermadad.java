package ejercicio01;

public class Condicion_Enfermadad extends Condicion{
	
	private Enfermedad e;
	
	public Condicion_Enfermadad(Enfermedad enfermedad) {
		this.e = enfermedad;
	}
	
	@Override
	public boolean esValido(Producto_Quimico producto) {
		return producto.sirveContra(this.e);
	}

}
