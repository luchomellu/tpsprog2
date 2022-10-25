package ejercicio03;

public class FiltroClasificacion extends Filtro {
	private String clasificacion;
	public FiltroClasificacion(String c) {
		this.clasificacion = c;
	}
	@Override
	public boolean cumple(Planta p) {
		return p.getClasificacionSuperior().equals(clasificacion);
	}

}
