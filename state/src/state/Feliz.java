package state;

public class Feliz implements Estado{
	
	int tiempo = 5;

	public void come(Persona persona){
		persona.setNivelFelicidad(persona.getNivelFelicidad() + 5);
	}

	
	public void duerme(Persona persona) {
		persona.setNivelFelicidad(persona.getNivelFelicidad() + 1);
	}

	
	public void trabaja(Persona persona) {
		if(this.tiempo > 5) persona.cambiarEstado(new Triste());
		
	}
	
	
	
}
