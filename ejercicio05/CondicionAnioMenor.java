package ejercicio05;

public class CondicionAnioMenor extends Condicion {

	private int anio;
	
	public CondicionAnioMenor(int a) {
		this.anio = a;
	}
	
	@Override
	public boolean cumple(Pelicula p) {
		return p.getEstreno()<this.anio;
	}

}
