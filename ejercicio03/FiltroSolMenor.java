package ejercicio03;

public class FiltroSolMenor extends Filtro {
	private static final int max = 10;
	private static final int min = 1;
	private int sol;
	public FiltroSolMenor(int sol) {
		this.setSol(sol);
	}
	private void setSol(int s) {
		if(s >= min && s <= max) {
			this.sol = s;
		}
	}
	@Override
	public boolean cumple(Planta p) {
		return p.getSol() < this.sol;
	}

}
