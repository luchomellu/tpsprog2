package sistemaElectoral;

import java.time.LocalTime;
import java.util.ArrayList;

public class Mesa extends Lugar{

	protected ArrayList<Voto>votos;
	public Mesa(String nombre) {
		super(nombre);
		this.votos = new ArrayList<>();
	}
	
	public void votar(int DNI, Candidato c) {
		if(this.getPadron().contains(DNI) && c != null) {
			Voto v = new Voto(DNI, c, LocalTime.now());
			this.votos.add(v);
		}
	}
	
	public void addVoto(Voto v) {
		this.votos.add(v);
	}

	@Override
	public ArrayList<Voto> getVotos() {
		return new ArrayList<Voto>(votos);
	}

	@Override
	public ArrayList<Integer> getPadron() {
		return new ArrayList<Integer>(padron);
	}

	@Override
	public double getPorcentajeCandidato(Candidato c) {
		double porc = 0;
		for(Voto item:votos) {
			if(item.getCandidato().equals(c)) {
				porc++;
			}
		}
		return (porc / this.votos.size()) * 100;
	}

	@Override
	public int getCantVotos() {
		return this.votos.size();
	}

}
