package Decorator;

public class ClienteSafeShop extends ClienteConCondicionComercial{

	private int montoMaximo;
	
	public void comprar(int monto) {
		if (monto > montoMaximo) 	
			throw new RuntimeException("Ha excedido el monto maximo");
		cliente.comprar(monto); 
	}
	
	public void pagarVencimiento(int monto) {}
	
	
	public ClienteSafeShop(int montoMaximo, Cliente unCliente) {
		this.montoMaximo = montoMaximo;
		super.cliente = unCliente;
	}
	
	public int getSaldo() {
		return super.cliente.getSaldo();
	}

}
