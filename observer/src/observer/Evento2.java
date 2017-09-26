package observer;

public class Evento2 implements Evento {

	public void notificar(Observadores o) {
		o.incrementar(1);
		o.agregar();
	}
	
}
