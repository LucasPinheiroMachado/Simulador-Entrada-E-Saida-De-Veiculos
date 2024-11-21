package Hardwares;

public class AutoFalante {
	private boolean estado;
	private int volume;
	
	public AutoFalante(boolean estado) {
        this.estado = estado;
        this.volume = 0;
    }

	public boolean isEstado() {
		return estado;
	}

	public int getVolume() {
		return volume;
	}

	public void alterarVolume(int valor) {
		this.volume += valor;
		if(this.volume < 0) {
			this.volume = 0;
		} else if (this.volume > 50) {
			this.volume = 50;
		}
	}
}
