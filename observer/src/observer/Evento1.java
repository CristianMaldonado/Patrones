package observer;

public class Evento1 implements Evento {
	
	public void notificar(Observadores o) {
		o.imprimir();
	}

}
