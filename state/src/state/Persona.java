package state;

public class Persona {

	private Estado estado;
	private int nivelFelicidad;
	
	
	public void come(){
		estado.come(this);
	}

	
	public void duerme() {
		estado.duerme(this);
	}

	
	public void trabaja() {
		estado.trabaja(this);
	}
	
	
	
	public int getNivelFelicidad() {
		return nivelFelicidad;
	}
	public void setNivelFelicidad(int nivelFelicidad) {
		this.nivelFelicidad = nivelFelicidad;
	}
	public Estado getEstado() {
		return estado;
	}
	public void cambiarEstado(Estado estado) {
		this.estado = estado;
	}
	
}
