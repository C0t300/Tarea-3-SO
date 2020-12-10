package uno;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Evaluar {
	public static int funcion(String expresion){
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
