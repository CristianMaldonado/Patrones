package command;

public class Accion3 implements Accion {
	
	
	private Integer contador;
	
	public void ejecutar() {
		contador++;
	}
		
	public Integer getContador() {
		return this.contador;
	}
	
	public void setContador(Integer valor) {
		this.contador = valor;
	}
	
}
