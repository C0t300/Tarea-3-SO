package uno;
import java.util.ArrayList;
import java.util.List;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Evaluar implements Runnable{
	
	Funciones f;
	Input in;
	int resultado;
	
	public Evaluar(Funciones a, Input b) {
		this.f = a;
		this.in = b;
	}
	
	@Override
	public void run() {
		Funcion actual = f.getFunct(in.funct);
		
		if(!actual.tieneFuncionesInternas()) {
			String buf = actual.expresion.replace("x", Integer.toString(in.x));
			this.resultado = evaljs(buf);
		}
		else {
			List<String> funcionesInternas = actual.getFuncionesInternas();
			List<Integer> cambio = new ArrayList<>();
			for (String fun : funcionesInternas) {
				Input in2 = new Input(fun, in.x);
				Evaluar ev2 = new Evaluar(this.f, in2);
				synchronized(ev2) {
					ev2.run();
				}
				cambio.add(ev2.resultado);
			}
			if(funcionesInternas.size() != cambio.size()) {
				System.out.println("uh oh");
			}
			else {
				int i;
				int tamano = funcionesInternas.size();
				String newExp = actual.expresion;
				for(i = 0; i < tamano; i++) {
					newExp = newExp.replace(funcionesInternas.get(i), Integer.toString(cambio.get(i)));
				}
				this.resultado = evaljs(newExp);
			
			}
		}
		
		synchronized(this) {
			this.notify();
		}
	}
	
	private static int evaljs(String expresion){
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");
        try {
            Object result = engine.eval(expresion);
            return (int) result;
        } catch(ScriptException e){
            e.printStackTrace();
        }
		return 0;
    }
	
}
