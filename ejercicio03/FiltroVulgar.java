package ejercicio03;

public class FiltroVulgar extends Filtro {
	private String vulgar;
	public FiltroVulgar(String v) {
		this.vulgar = v;
	}
	@Override
	public boolean cumple(Planta p) {
		return p.getnombresVulgares().contains(this.vulgar);
	}

}
