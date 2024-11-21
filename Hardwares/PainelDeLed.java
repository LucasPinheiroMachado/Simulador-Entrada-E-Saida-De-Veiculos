package Hardwares;

public class PainelDeLed {
	private boolean estado;
	private String cor;
	
	public PainelDeLed(boolean estado, String cor) {
        this.estado = estado;
        this.cor = cor;
    }
	
	public boolean isEstado() {
		return estado;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void ligar() {
		this.estado = true;
	}
	
	public void desligar() {
		this.estado = false;
	}
}
