package uno;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; // Import the Scanner class to read text files

public class Archivo {
	public static List<String> leer() {
		try {
			List<String> retorno = new ArrayList<>();
			File myObj = new File("/home/c0t300/git/Tarea-3-SO/Tarea-3-SO/data/text.txt");
			Scanner myReader = new Scanner(myObj);
			int cantFunciones = 0;
			if(myReader.hasNextLine()) {
				String primero = myReader.nextLine();
				cantFunciones = Integer.parseInt(primero);
			}
			int i;
			for(i = 0; i < cantFunciones; i++) {
				retorno.add(myReader.nextLine());
			}
			myReader.close();
			return retorno;
	    	} catch (FileNotFoundException e) {
	    		System.out.println("An error occurred.");
	    		e.printStackTrace();
	    	}
		return null;
	}
}
