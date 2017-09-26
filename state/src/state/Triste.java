package state;

public class Triste implements Estado {


	public void come(Persona persona) {
		System.out.println("No puede");		
	}

	public void duerme(Persona persona) {
		System.out.println("Sigue triste");
	}

	public void trabaja(Persona persona) {
		persona.cambiarEstado(new Enojado());
	}

}
