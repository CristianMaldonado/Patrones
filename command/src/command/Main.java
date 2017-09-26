package command;

public class Main {
	
	
	
	public static void main(String[] args) {
		
		ResponsableEjecucion r = new ResponsableEjecucion();
		
		Accion1 a1 = new Accion1();
		Accion2 a2 = new Accion2();
		Accion3 a3 = new Accion3();
		a3.setContador(0);
		
		r.agregarAccion(a1);
		r.agregarAccion(a1);
		r.agregarAccion(a1);
		r.agregarAccion(a1);
		r.agregarAccion(a2);
		r.agregarAccion(a2);
		r.agregarAccion(a2);
		r.agregarAccion(a2);
		r.agregarAccion(a2);
		r.agregarAccion(a3);
		r.agregarAccion(a3);
		r.agregarAccion(a3);
		r.agregarAccion(a3);
		r.agregarAccion(a3);
		
		r.ejecutarAcciones();
		
		System.out.println(a2.getLista());
		System.out.println(a3.getContador());
		
	
		
	}
	
	

}
