package uno;

public class Main {
	

	public static void main(String[] args) {
		Funciones f = new Funciones(Archivo.leer());
		System.out.println("Funciones ingresadas.");
		
		Input in = new Input("", 0);
		in.getInput();
		
		Evaluar ev1 = new Evaluar(f, in);
		
		synchronized(ev1) {
			ev1.run();
		}
		System.out.println(ev1.resultado);
		System.out.println("finish.");
		

	}
	
	

}
