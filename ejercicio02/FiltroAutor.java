package ejercicio02;

public class FiltroAutor extends Filtro {
	private String autor;
	
	public FiltroAutor(String a){
		this.autor = a;
	}
	@Override
	public boolean cumple(Documento doc) {
		return doc.getAutores().contains(autor);
	}

}
