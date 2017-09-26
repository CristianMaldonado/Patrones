package Decorator;

public class ClientePosta implements Cliente {
	
	private int puntosAcumulados;
	private int saldo;
	
	public void comprar(int monto) {
		this.saldo -= monto;
	}
	
	public void pagarVencimiento(int monto) {
	}
	
	public void sumarPuntos(int puntos) {
		this.puntosAcumulados += puntos; 
	}
	
	public ClientePosta(int puntosAcumulados, int saldo) {
		this.setPuntosAcumulados(puntosAcumulados);
		this.saldo = saldo;
	}
	
	public int getSaldo() {
		return this.saldo;
	}

	public int getPuntosAcumulados() {
		return puntosAcumulados;
	}

	public void setPuntosAcumulados(int puntosAcumulados) {
		this.puntosAcumulados = puntosAcumulados;
	}

}
