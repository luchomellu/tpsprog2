package ejercicio05;

import java.util.ArrayList;


public class Plataforma {
	private ArrayList<Pelicula>peliculas;
	private Condicion politica;
	
	public Plataforma(Condicion politica) {
		this.politica = politica;
		this.peliculas = new ArrayList<>();
	}
	
	public void addPelicula(Pelicula p) {
		if(p != null) {
			peliculas.add(p);
		}
	}
	
	public ArrayList<Pelicula> buscar(Condicion c){
		ArrayList<Pelicula> aux = new ArrayList<>();
		for(Pelicula p:peliculas) {
			if(c.cumple(p)) {
				aux.add(p);
			}
		}
		return aux;
	}
	
	public boolean esRentable(Pelicula p) {
		return politica.cumple(p);
	}
}
