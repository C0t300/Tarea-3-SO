package uno;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> sfun = Archivo.leer();
		Funciones f = new Funciones();
		f.setFunciones(sfun);
		System.out.println(f.funciones);

	}

}
