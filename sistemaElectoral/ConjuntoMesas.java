package sistemaElectoral;

import java.util.ArrayList;

public class ConjuntoMesas extends Lugar{

	protected ArrayList<Lugar> lugares;
	
	public ConjuntoMesas(String nombre) {
		super(nombre);
		this.lugares = new ArrayList<>();
	}

	@Override
	public ArrayList<Integer> getPadron() {
		ArrayList<Integer> resultado = new ArrayList<>();
		for(Integer item:padron) {
			resultado.add(item);
		}
		return resultado;
	}

	@Override
	public ArrayList<Voto> getVotos() {
		ArrayList<Voto> resultado = new ArrayList<>();
		for(Lugar lugar:lugares) {
			resultado.addAll(lugar.getVotos());
		}
		return resultado;
	}

	@Override
	public double getPorcentajeCandidato(Candidato c) {
		double porc = 0;
		for(Lugar item:lugares) {
			porc += item.getPorcentajeCandidato(c);
		}
		return porc / this.lugares.size();
	}

	@Override
	public int getCantVotos() {
		int cant_votos = 0;
		for(Lugar item:lugares) {
			cant_votos += item.getCantVotos();
		}
		return cant_votos;
	}

}
