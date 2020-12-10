package uno;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;

public class Funcion {
	String nombre;
	String expresion;
	
	public Funcion(String n, String exp) {
		this.nombre = n;
		this.expresion = exp;
	}
	
	public boolean tieneFuncionesInternas() {
		Pattern p = Pattern.compile("\\w\\(x\\)");
		Matcher m = p.matcher(this.expresion);
		return m.find();
	}
	
	public List<String> getFuncionesInternas() {
		List<String> retorno = new ArrayList<>();
		Pattern p = Pattern.compile("(\\w\\(x\\))");
		Matcher m = p.matcher(this.expresion);
		while (m.find()) {
	        for (int i = 1; i <= m.groupCount(); i++) {
	            retorno.add(m.group(i));
	        }
	    } 
		return retorno;
	}
	
}
