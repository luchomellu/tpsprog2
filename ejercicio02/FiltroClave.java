package ejercicio02;

public class FiltroClave extends Filtro {
	private String clave;
	
	public FiltroClave(String c) {
		this.clave = c;
	}
	@Override
	public boolean cumple(Documento doc) {
		return doc.getPalabrasClaves().contains(this.clave);
	}

}
