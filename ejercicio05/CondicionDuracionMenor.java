package ejercicio05;

public class CondicionDuracionMenor extends Condicion {

	private int duracion;
	
	public CondicionDuracionMenor(int d) {
		this.duracion = d;
	}
	@Override
	public boolean cumple(Pelicula p) {
		return p.getDuracion() < this.duracion;
	}

}
