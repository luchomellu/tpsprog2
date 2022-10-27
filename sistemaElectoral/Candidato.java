package sistemaElectoral;

public class Candidato {

	private String nombre,partidoPolitico,agrupacion;

	public Candidato(String nombre, String partidoPolitico, String agrupacion) {
		this.nombre = nombre;
		this.partidoPolitico = partidoPolitico;
		this.agrupacion = agrupacion;
	}
	
	public boolean equals(Candidato c) {
		return c.getNombre().equals(this.nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public String getPartidoPolitico() {
		return partidoPolitico;
	}

	public String getAgrupacion() {
		return agrupacion;
	}
	
	public String toString() {
		return this.partidoPolitico + " - " + this.agrupacion + " - " + this.nombre + "\n";
	}
	
}
