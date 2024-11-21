package Infraestrutura;

import Hardwares.AutoFalante;

public class Sirene {
	private boolean estado;
	private AutoFalante autoFalante;
	
	public Sirene(AutoFalante autoFalante) {
		this.estado = false;
		this.autoFalante = autoFalante;
	}
	
	public boolean isEstado() {
		return estado;
	}
	
	public void ligar() {
		this.estado = true;
		this.autoFalante.alterarVolume(50);
	}
	
	public void desligar() {
		this.estado = false;
		this.autoFalante.alterarVolume(-50);
	}
	
	public String verEstado() {
		if(isEstado()) {
			return "Ligada";
		} else {
			return "Desligada";
		}
	}
}
