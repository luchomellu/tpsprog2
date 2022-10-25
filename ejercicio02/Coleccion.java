package ejercicio02;

import java.util.ArrayList;

public class Coleccion {
	private ArrayList<Documento>coleccion;
	
	public Coleccion() {
		this.coleccion = new ArrayList<>();
	}
	
	public void addDocumento(Documento d) {
		if(d != null) {
			coleccion.add(d);
		}
	}
	
	public ArrayList<Documento> buscar(Filtro f){
		ArrayList<Documento>resultado = new ArrayList<>();
		for(Documento doc : coleccion) {
			if(f.cumple(doc)) {
				resultado.add(doc);
			};
		}
		return resultado;
	}
}
