package ejercicio01;

import java.util.ArrayList;

public class Cultivo {
	
	private String nombre;
	private ArrayList<Enfermedad>enfermedades;
	
	public Cultivo(String nombre) {
		this.nombre = nombre;
		this.enfermedades = new ArrayList<>();
	}

	public void addEnfermedad(Enfermedad e) {
		if(e != null) {
			enfermedades.add(e);
		}
		
	}

	
}
