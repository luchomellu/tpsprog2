package ejercicio01;

import java.util.ArrayList;

public class Producto_Quimico {
	
	private String nombre;
	private ArrayList<Cultivo> cultivos_prohibidos; 
	private ArrayList<String> estados_patologicos;
	public Producto_Quimico(String nombre) {
		this.nombre = nombre;
		this.cultivos_prohibidos = new ArrayList<>();
		this.estados_patologicos = new ArrayList<>();
	}

	public boolean sirveContra(Enfermedad e) {
		return estados_patologicos.containsAll(e.getEstadosPatologicos());
	}

	public boolean apto(Cultivo cultivo) {
		return !cultivos_prohibidos.contains(cultivo);
	}
	
	public String toString() {
	    return "Nombre: " + this.nombre + "\n";
	  }

	public void addEstadoPatologico(String e) {
		if(e != null) {
			estados_patologicos.add(e);
		}
		
	}

	public void addCultivoProhibido(Cultivo c) {
		if(c != null) {
			cultivos_prohibidos.add(c);
		}
	}

}
