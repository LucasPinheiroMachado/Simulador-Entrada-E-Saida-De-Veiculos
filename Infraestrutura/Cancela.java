package Infraestrutura;

import Hardwares.BracoMecanico;

public class Cancela {
	private boolean estado;
	private BracoMecanico braco;
	
	public Cancela(BracoMecanico braco) {
		this.estado = false;
		this.braco = braco;
	}
	
	public boolean isEstado() {
		return estado;
	}
	
	public void abrir() {
		this.estado = true;
		this.braco.alterarGrau(90);
	}
	
	public void fechar() {
		this.estado = false;
		this.braco.alterarGrau(-90);
	}
	
	public String verEstado() {
		if(isEstado()) {
			return "Aberta";
		} else {
			return "Fechada";
		}
	}
}
