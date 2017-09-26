package src;

public class Main {
	public static void main(String[] args) {
		GuitarraAcustica acustica = new GuitarraAcustica();
		GuitarraCriolla criolla = new GuitarraCriolla();
		
		AdapterAcustica acusticaAdap = new AdapterAcustica();
		
		acustica.on();
		acustica.off();
		
		criolla.encender();
		criolla.apagar();
		
		acusticaAdap.encender();
		acusticaAdap.apagar();
		
	}
}
