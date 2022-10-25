package noticias;

import java.util.ArrayList;

public interface SitioWeb {
	public int getCantNoticias();//cada objeto sabe como contarse
	public SitioWeb restringir(String clave);
	public ArrayList<Noticia> buscar(Filtro f);
}
