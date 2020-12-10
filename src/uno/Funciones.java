package uno;
import java.util.ArrayList;
import java.util.List;

public class Funciones {
	
	List<Funcion> funciones = new ArrayList<>();
	
	public Funciones(List<String> f) {
		for (String fu : f) {
			String[] buf = fu.split("=");
			Funcion nuevo = new Funcion(buf[0], buf[1]);
			funciones.add(nuevo);
		}
	}
	
	public Funcion getFunct(String f) {
		for (Funcion actual : this.funciones) {
			if(actual.nombre.equals(f)) {
				return actual;
			}
		}
		System.out.println("No existe la funcion" + f);
		return null;
	}
	
	//public boolean tieneFuncionesInternas()
	
	
	
	
}
