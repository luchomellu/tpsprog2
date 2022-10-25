package noticias;

import java.util.ArrayList;

public class Noticia implements SitioWeb{
	private String titulo,introduccion,texto,autor,link;
	private ArrayList<String>palabrasClave;
	
	public Noticia(String titulo, String introduccion, String texto, String autor, String link) {
		this.titulo = titulo;
		this.introduccion = introduccion;
		this.texto = texto;
		this.autor = autor;
		this.link = link;
		this.palabrasClave = new ArrayList<>();
	}
	
	public Noticia(Noticia noticia) {
		this.titulo = noticia.getTitulo();
		this.introduccion = noticia.getIntroduccion();
		this.texto = noticia.getTexto();
		this.autor = noticia.getAutor();
		this.link = noticia.getLink();
		this.palabrasClave = noticia.getPalabrasClave();
	}
	
	@Override
	public int getCantNoticias() {
		return 1;
	}
	
	@Override
	public SitioWeb restringir(String clave) {
		if(this.palabrasClave.contains(clave)) {
			return new Noticia(this);
		}
		return null;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIntroduccion() {
		return introduccion;
	}

	public void setIntroduccion(String introduccion) {
		this.introduccion = introduccion;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public ArrayList<String> getPalabrasClave() {
		return new ArrayList<String>(palabrasClave);
	}

	public void addPalabrasClave(String palabraClave) {
		this.palabrasClave.add(palabraClave);
	}

	@Override
	public ArrayList<Noticia> buscar(Filtro f) {
		ArrayList<Noticia> res = new ArrayList<>();
        if (f.cumple(this))
            res.add(this);
        return res;
	}

	public String toString() {
		return this.getLink() + "\n";
	}
	
}
