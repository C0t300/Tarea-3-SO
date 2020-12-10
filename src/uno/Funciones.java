package uno;
import java.util.Hashtable;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Funciones {
	
	Hashtable<String, String> funciones = new Hashtable<>(); 
	
	public void setFunciones(List<String> f) {
		for (String fu : f) {
			String[] buf = fu.split("=");
			funciones.put(buf[0], buf[1]);
		}
	}
	
	
	
	
}
