package command;

import java.util.ArrayList;
import java.util.List;

public class ResponsableEjecucion {

	
	private List<Accion> acciones = new ArrayList<>();
	
	public void agregarAccion(Accion unaAccion) {
		this.acciones.add(unaAccion);
	}
	
	public void ejecutarAcciones() {
		this.acciones.forEach(a -> a.ejecutar());
	}
	
}
