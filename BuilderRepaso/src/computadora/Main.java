package computadora;

public class Main {

	public static void main(String[] args) {
		
		
		BuilderComputadora bComp = new BuilderComputadora();
			
		Computadora macBookProRetina = bComp.setDisco(new Disco(5,45,4)).setCpu(new Cpu(7,5)).setMemoria(new Memoria(5, 40)).setFuente(new Fuente("pirulo"))
				.setMonitor(new Monitor("chori", 78)).setTeclado(new Teclado()).setParlante(new Parlante(5)).setMother(new Mother("cacona"))
				.setMouse(new Mouse(true)).build();
		
		
		System.out.println(macBookProRetina.getParlante().getCantidadAltavoces());
		System.out.println(macBookProRetina.getMemoria().getFrecuencia());
		System.out.println(macBookProRetina.getCpu().getHilos());
		System.out.println(macBookProRetina.getDisco().getSectores());
		System.out.println(macBookProRetina.getMother().getMarca());
		
		
	}
		
}
