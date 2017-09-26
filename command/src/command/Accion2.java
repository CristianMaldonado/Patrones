package command;

import java.util.ArrayList;
import java.util.List;

public class Accion2 implements Accion {

	
	List<Integer> lista = new ArrayList<>();
	
	public void ejecutar() {
		lista.add(1);
	}
	
	public List<Integer> getLista() {
		return this.lista;
	}
	
}
