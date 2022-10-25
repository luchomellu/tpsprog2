package ejercicio03;

public class FiltroRiegoMenor extends Filtro {
	private static final int max = 10;
	private static final int min = 1;
	private int riego;
	public FiltroRiegoMenor(int riego) {
		this.setSol(riego);
	}
	private void setSol(int s) {
		if(s >= min && s <= max) {
			this.riego = s;
		}
	}
	@Override
	public boolean cumple(Planta p) {
		return p.getRiego() < this.riego;
	}
}
