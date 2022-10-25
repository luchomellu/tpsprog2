package ejercicio02;

public class FiltroClaveEmpty extends Filtro {
	@Override
	public boolean cumple(Documento doc) {
		return doc.getPalabrasClaves().isEmpty();
	}

}
