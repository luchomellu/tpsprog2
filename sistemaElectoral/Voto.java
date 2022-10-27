package sistemaElectoral;

import java.time.LocalTime;

public class Voto {
	
	private int dni;
	private Candidato candidato;
	private LocalTime horaVoto;
	
	public Voto(int dni, Candidato candidato, LocalTime horaVoto) {
		this.dni = dni;
		this.candidato = candidato;
		this.horaVoto = horaVoto;
	}

	public int getDni() {
		return dni;
	}

	public Candidato getCandidato() {
		return candidato;
	}

	public LocalTime getHoraVoto() {
		return horaVoto;
	}
	
	
	
	
}
