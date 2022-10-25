package ejercicio01;

import java.util.ArrayList;
import java.util.Collection;

public class Enfermedad {
	private String nombre;
	private ArrayList<String> estados_patologicos;
	
	public Enfermedad(String nombre) {
		this.nombre = nombre;
		this.estados_patologicos = new ArrayList<>();
	}

	public ArrayList<String> getEstadosPatologicos() {
		return new ArrayList<>(estados_patologicos);
	}
	
	public void addEstadoPatologico(String e) {
		if(e != null) {
			estados_patologicos.add(e);
		}
	}

	
}
