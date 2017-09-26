package Decorator;

public class ClientePromocion extends ClienteConCondicionComercial{

	private int montoMinimo;
	private int puntosPromocion;
	
	public void comprar(int monto) {
		cliente.comprar(monto);
		if (monto > montoMinimo)
			this.sumarPuntos(puntosPromocion);
	}
	
	public void pagarVencimiento(int monto) {		
	}
	
	public ClientePromocion(int monto, int puntosPromocion,  Cliente unCliente) {
		super.cliente = unCliente;
		this.puntosPromocion = puntosPromocion;
		montoMinimo = monto;
	}
	
	
	
}
