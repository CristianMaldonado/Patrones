package observer;

public class IncrementaContador implements Observadores {

	private Integer entero;
	
	public void agregar() {		
	}
	
	public void imprimir() {
	}
	
	public void incrementar(Integer valor) {
		entero += valor;
	}
	
	public IncrementaContador() {
		this.entero = 0;
	}
	
	public Integer getEntero() {
		return this.entero;
	}
}
