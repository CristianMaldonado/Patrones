package observer;

import java.util.ArrayList;
import java.util.List;

public class Observable {
	
	
	private List<Observadores> observadores = new ArrayList<>();
	
	public void registrarObservador(Observadores o) {
		this.observadores.add(o);
	}
	
	public void notificarATodos(Evento unEvento) {
		observadores.forEach(observador -> unEvento.notificar(observador));
	}
	
	
	

}
