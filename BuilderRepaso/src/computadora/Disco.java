package computadora;

public class Disco {
	
	private int sectores;
	private int pistas;
	private int cabezas;
	
	public Disco(int sectores, int pistas, int cabezas) {
		this.setSectores(sectores);
		this.setPistas(pistas);
		this.setCabezas(cabezas);
	}

	public int getSectores() {
		return sectores;
	}

	public void setSectores(int sectores) {
		this.sectores = sectores;
	}

	public int getPistas() {
		return pistas;
	}

	public void setPistas(int pistas) {
		this.pistas = pistas;
	}

	public int getCabezas() {
		return cabezas;
	}

	public void setCabezas(int cabezas) {
		this.cabezas = cabezas;
	}

}
