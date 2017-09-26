package src;

public class AdapterAcustica implements Guitarra{

	private GuitarraAcustica acustic = new GuitarraAcustica();
	
	public void encender() {
		acustic.on();
	}

	public void apagar() {
		acustic.off();
	}

}
