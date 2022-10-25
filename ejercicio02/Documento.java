package ejercicio02;

import java.util.ArrayList;

public class Documento {
	
	private String titulo,contenido;
	private ArrayList<String>autores;
	private ArrayList<String>palabras_claves;
	
	public Documento(String t, String c) {
		this.titulo = t;
		this.contenido = c;
		this.autores = new ArrayList<>();
		this.palabras_claves = new ArrayList<>();
	}
	
	public String getTitulo() {
		return titulo;
	}

	public String getContenido() {
		return contenido;
	}

	public void addAutor(String autor) {
		if(autor != null) {
			autores.add(autor);
		}
	}
	
	public void addPalabraClave(String pc) {
		if(pc != null) {
			palabras_claves.add(pc);
		}
	}

	public ArrayList<String> getPalabrasClaves() {
		return new ArrayList<>(palabras_claves);
	}
	
	public ArrayList<String> getAutores() {
		return new ArrayList<>(autores);
	}
	
	public String toString() {
	    return "Titulo: " + this.titulo + ", contenido: " + this.contenido + ", autores: " + this.autores + ", palabras claves: " + this.palabras_claves + "\n";
	  }
}
