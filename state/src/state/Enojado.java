package state;

public class Enojado implements Estado {

	public void come(Persona persona) {
		persona.cambiarEstado(new Feliz());		
	}


	public void duerme(Persona persona) {
		persona.cambiarEstado(new Cansado());
	}

	public void trabaja(Persona persona) {
		persona.setNivelFelicidad(persona.getNivelFelicidad() -2);
	}

}
