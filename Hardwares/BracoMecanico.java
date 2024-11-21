package Hardwares;

public class BracoMecanico {
	private boolean estado;
	private int grau;
	
	public BracoMecanico(boolean estado) {
        this.estado = estado;
        this.grau = 0;
    }

	public boolean isEstado() {
		return estado;
	}

	public int getGrau() {
		return grau;
	}

	public void alterarGrau(int valor) {
		this.grau += valor;
		if(this.grau < 0) {
			this.grau = 0;
		} else if (this.grau > 50) {
			this.grau = 50;
		}
	}
}
