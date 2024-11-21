package Infraestrutura;
import Hardwares.PainelDeLed;

public class Semaforo {
	private boolean estado;
	private PainelDeLed painelAberto;
	private PainelDeLed painelFechado;
	
	public Semaforo(PainelDeLed painel1, PainelDeLed painel2) {
		this.estado = true;
		this.painelAberto = painel1;
		this.painelFechado = painel2;
	}

	public boolean isEstado() {
		return estado;
	}

	public void abrir() {
		this.estado = true;
		this.painelAberto.ligar();
		this.painelFechado.desligar();
	}
	
	public void fechar() {
		this.estado = false;
		this.painelAberto.desligar();
		this.painelFechado.ligar();
	}
	
	public String verEstado() {
		if(isEstado()) {
			return "Aberto";
		} else {
			return "Fechado";
		}
	}
}
