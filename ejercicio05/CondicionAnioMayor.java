package ejercicio05;

public class CondicionAnioMayor extends Condicion {

	private int anio;
	
	public CondicionAnioMayor(int a) {
		this.anio = a;
	}
	
	@Override
	public boolean cumple(Pelicula p) {
		return p.getEstreno()>this.anio;
	}


}
