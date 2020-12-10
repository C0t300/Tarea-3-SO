package uno;

public class Main {

	public static void main(String[] args) {
		Funciones f = new Funciones(Archivo.leer());
		System.out.println("Funciones ingresadas.");
		
		Input in = new Input();
		in.getInput();
		Funcion actual = f.getFunct(in.funct);
		if(!actual.tieneFuncionesInternas()) {
			String buf = actual.expresion.replace("x", Integer.toString(in.x));
			System.out.println(Evaluar.funcion(buf));
		}

	}
	
	

}
