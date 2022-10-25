package ejercicio05;

public class CondicionGenero extends Condicion {

	private String genero;
	
	public CondicionGenero(String g) {
		this.genero = g;
	}
	@Override
	public boolean cumple(Pelicula p) {
		return p.getGeneros().contains(genero);
	}

}
