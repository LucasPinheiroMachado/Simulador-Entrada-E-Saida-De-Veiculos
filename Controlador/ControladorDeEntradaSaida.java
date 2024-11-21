package Controlador;

import Infraestrutura.*;

public class ControladorDeEntradaSaida {
	private Sirene sirene;
	private Semaforo semaforoInterno;
	private Semaforo semaforoExterno;
	private Cancela cancela;
	
	public ControladorDeEntradaSaida(Sirene sirene, Semaforo semaforoInterno, Semaforo semaforoExterno, Cancela cancela) {
		this.sirene = sirene;
		this.semaforoInterno = semaforoInterno;
		this.semaforoExterno = semaforoExterno;
		this.cancela = cancela;
	}
	
	public void entrada() {
		sirene.ligar();
		semaforoInterno.fechar();
		cancela.abrir();
	}
	
	public void saida() {
		sirene.ligar();
		semaforoExterno.fechar();
		cancela.abrir();
	}
	
	public void encerramento() {
		sirene.desligar();
		semaforoInterno.abrir();
		semaforoExterno.abrir();
		cancela.fechar();
	}
}
