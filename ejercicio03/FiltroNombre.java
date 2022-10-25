package ejercicio03;

public class FiltroNombre extends Filtro {

	private String nombre;
	
	public FiltroNombre(String n) {
		this.nombre = n;
	}
	@Override
	public boolean cumple(Planta p) {
		return p.getNombreCientifico().contains(nombre);
	}

}
