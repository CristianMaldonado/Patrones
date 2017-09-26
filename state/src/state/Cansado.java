package state;

public class Cansado implements Estado {

	
	public void come(Persona persona) {
		persona.cambiarEstado(new Feliz());
	}

	
	public void duerme(Persona persona) {
		persona.cambiarEstado(new Feliz());
	}

	public void trabaja(Persona persona) {
		System.out.println("sigue cansado");
	}

}
