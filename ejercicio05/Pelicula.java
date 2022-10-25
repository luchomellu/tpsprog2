package ejercicio05;

import java.util.ArrayList;

public class Pelicula {
	private String titulo,sinopsis,director;
	private ArrayList<String>generos;
	private ArrayList<String>actores;
	private int estreno,duracion,edadMinima;
	
	public Pelicula(String titulo,String sinopsis,String director,int estreno,int duracion,int edadMinima){
		this.titulo = titulo;
		this.sinopsis = sinopsis;
		this.director = director;
		this.estreno = estreno;
		this.duracion = duracion;
		this.edadMinima = edadMinima;
		this.generos = new ArrayList<>();
		this.actores = new ArrayList<>();
	}
	
	public void addGenero(String g) {
		if(g != null) {
			generos.add(g);
		}
	}
	
	public void addActor(String a) {
		if(a != null) {
			actores.add(a);
		}
	}
	
	public String toString() {
	    return "Titulo: " + this.titulo + ", Sinopsis: " + this.sinopsis + ", Director: " + this.director +
	    ", Año de estreno: " + this.estreno + ", duracion: " + this.duracion + " minutos.\nGeneros: " +
	    this.generos + "\nActores: " + this.actores + "\n";
	  }
	
	public ArrayList<String> getGeneros(){
		return new ArrayList<>(generos);
	}
	
	public ArrayList<String> getActores(){
		return new ArrayList<>(actores);
	}

	public String getTitulo() {
		return titulo;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public String getDirector() {
		return director;
	}

	public int getEstreno() {
		return estreno;
	}

	public int getDuracion() {
		return duracion;
	}

	public int getEdadMinima() {
		return edadMinima;
	}
	
}
