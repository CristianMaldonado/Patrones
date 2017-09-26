package observer;

import java.util.ArrayList;
import java.util.List;

public class AgregarALista implements Observadores{

	private List<Integer> lista = new ArrayList<Integer>(); 
	
	public void agregar() {
		this.lista.add(1);
	}
	
	public void imprimir() {
	}
	
	public void incrementar(Integer valor){
	}
	
	public List<Integer> getLista() {
		return this.lista;
	}

}
