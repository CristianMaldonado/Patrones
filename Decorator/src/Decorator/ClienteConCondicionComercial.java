package Decorator;

// es una superclase de las subclases clientePromocion y clienteSafeShop
public abstract class ClienteConCondicionComercial implements Cliente {
	
	protected Cliente cliente;
	
	public void comprar(int monto) {
	}
	
	public void pagarVencimiento(int monto) {
	}
	
	public int getSaldo() {
		return this.cliente.getSaldo();
	}
	
	public int getPuntosAcumulados() {
		return this.cliente.getPuntosAcumulados();
	}
	
	public void sumarPuntos(int puntosPromocion) {
		this.cliente.sumarPuntos(puntosPromocion);
	}
	
	// el comportamiento de la clase abstracta es para que conozca a la interfaz todos los decoradores
	// y para que haya efecto en los atributos del cliente post, sino se pierden en el camino de la instanciacion
	// para llamar a los metodos del cliente posta, con un metodo del mismo nombre

}
