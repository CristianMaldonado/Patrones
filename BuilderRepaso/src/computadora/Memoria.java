package computadora;

public class Memoria {

	private int capacidad;
	private int frecuencia;
	
	public Memoria(int capacidad, int frecuencia) {
		this.setCapacidad(capacidad);
		this.setFrecuencia(frecuencia);
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public int getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(int frecuencia) {
		this.frecuencia = frecuencia;
	}
	
	
}
