package noticias;

import java.util.ArrayList;

public class Seccion implements SitioWeb{
	private ArrayList<SitioWeb>contenido;
	private String desc,img,nombre;
	
	public Seccion(String nombre,String desc, String img) {
		this.nombre = nombre;
		this.desc = desc;
		this.img = img;
		this.contenido = new ArrayList<>();
	}
	
	@Override
	public int getCantNoticias() {
		int cantidad = 0;
		for(SitioWeb item:contenido) {
			cantidad += item.getCantNoticias();
		}
		return cantidad;
	}
	
	@Override
	public SitioWeb restringir(String clave) {
		Seccion copia = new Seccion(this.getNombre(),this.getDesc(), this.getImg());
		for(SitioWeb item:contenido) {
			SitioWeb restrigido = item.restringir(clave);
			if(restrigido != null) {
				copia.addContenido(restrigido);
			}
		}
		return copia;
	}
	
	public ArrayList<SitioWeb> getContenido() {
		return new ArrayList<SitioWeb>(contenido);
	}
	public void addContenido(SitioWeb contenido) {
		this.contenido.add(contenido);
	}
	public String getNombre() {
		return nombre;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}

	@Override
	public ArrayList<Noticia> buscar(Filtro f) {
		ArrayList<Noticia> res = new ArrayList<>();
		for(SitioWeb item:contenido) {
			res.addAll(item.buscar(f));
		}
        return res;
	}

	public String toString() {
		String resultado = "";
		for(SitioWeb item:contenido) {
			resultado += this.getNombre()+"/"+item.toString();
		}
		return resultado;
	}
	
}
