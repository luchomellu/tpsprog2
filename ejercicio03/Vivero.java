package ejercicio03;

import java.util.ArrayList;

public class Vivero {

	private ArrayList<Planta>plantas;
	
	public Vivero() {
		this.plantas = new ArrayList<>();
	}
	
	public void addPlanta(Planta p) {
		if(p != null) {
			plantas.add(p);
		}
	}
	
	public ArrayList<Planta> buscar(Filtro f){
		ArrayList<Planta>aux = new ArrayList<>();
		for(Planta p : plantas) {
			if(f.cumple(p)) {
				aux.add(p);
			}
		}
		return aux;
	}
	
	
}
