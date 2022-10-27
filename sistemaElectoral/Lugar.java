package sistemaElectoral;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class Lugar {
	
	protected String nombre;
	protected ArrayList<Integer>padron;
	protected ArrayList<Candidato>candidatos;
	
	public Lugar(String nombre) {
		this.nombre = nombre;
		this.padron = new ArrayList<>();
		this.candidatos = new ArrayList<>();
	}
	
	public ArrayList<Candidato> getCandidatos() {
		return new ArrayList<Candidato>(candidatos);
	}
	
	public ArrayList<Candidato> getCandidatosOrdenado(Comparator<Candidato> comp){
		ArrayList<Candidato> res = new ArrayList<Candidato>(candidatos);
		Collections.sort(res, comp);
		return res;
	}
	
	public void addCandidato(Candidato c) {
		if(c != null) {
			this.candidatos.add(c);
		}
	}
	
	public abstract ArrayList<Integer> getPadron();
	
	public abstract ArrayList<Voto> getVotos();
	
	public void addDNI(int dni) {
		this.padron.add(dni);
	}
	
	public abstract double getPorcentajeCandidato(Candidato c);
	
	public abstract int getCantVotos();
	
}
