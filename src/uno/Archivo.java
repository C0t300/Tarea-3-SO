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
			File myObj = new File("../data/text.txt");
			Scanner escaner = new Scanner(myObj);
			int cantFunciones = 0;
			if(escaner.hasNextLine()) {
				String primero = escaner.nextLine();
				cantFunciones = Integer.parseInt(primero);
			}
			int i;
			for(i = 0; i < cantFunciones; i++) {
				retorno.add(escaner.nextLine());
			}
			escaner.close();
			return retorno;
	    	} catch (FileNotFoundException e) {
	    		System.out.println("An error occurred.");
	    		e.printStackTrace();
	    	}
		return null;
	}
}
