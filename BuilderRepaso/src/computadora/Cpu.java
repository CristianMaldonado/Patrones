package computadora;

public class Cpu {

	private int hilos;
	private int frecuencia;
	
	public Cpu(int hilos, int frecuencia) {
		this.setHilos(hilos);
		this.setFrecuencia(frecuencia);
	}

	public int getHilos() {
		return hilos;
	}

	public void setHilos(int hilos) {
		this.hilos = hilos;
	}

	public int getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(int frecuencia) {
		this.frecuencia = frecuencia;
	}
	
	
	
	
}
