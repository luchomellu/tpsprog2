package ejercicio03;

import java.util.ArrayList;

public class Planta {

	private String nombreCientifico,clasificacionSuperior,familia,clase;
	private ArrayList<String>nombresVulgares;
	private int sol,riego;
	
	public Planta(String nombreCientifico,String clasificacionSuperior,String familia,String clase,int sol,int riego) {
		this.nombreCientifico = nombreCientifico;
		this.clasificacionSuperior = clasificacionSuperior;
		this.familia = familia;
		this.clase = clase;
		this.sol = sol;
		this.riego = riego;
		this.nombresVulgares = new ArrayList<>();
	}
	
	public void addNombreVulgar(String n) {
		if(n != null) {
			nombresVulgares.add(n);
		}
	}
	
	public String toString() {
	    return "Nombre cientifico: " + getNombreCientifico() + ", calificacion superior: " + getClasificacionSuperior() + ", familia: " + getFamilia() + ", clase: " + getClase() + ", puntaje riego: " + getRiego() + ", puntaje sol: " + getSol() + ", conocida vulgarmente como: " + this.nombresVulgares + "\n";
	  }
	
	public ArrayList<String> getnombresVulgares() {
		return new ArrayList<>(nombresVulgares);
	}

	public String getNombreCientifico() {
		return nombreCientifico;
	}

	public String getClasificacionSuperior() {
		return clasificacionSuperior;
	}

	public String getFamilia() {
		return familia;
	}

	public String getClase() {
		return clase;
	}

	public int getSol() {
		return sol;
	}

	public int getRiego() {
		return riego;
	}
	
}
