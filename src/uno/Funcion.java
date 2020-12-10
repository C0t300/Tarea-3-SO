package uno;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	
}
