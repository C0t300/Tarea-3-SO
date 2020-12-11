package dos;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class RandomArray {

	public static List<Integer> randArray(int n, int maxNumber) {
		if(maxNumber < 1) {
			System.out.println("maxNumber debe ser mayor o igual a 1");
			return null;
		}
		if(n < 1) {
			System.out.println("n debe ser mayor o igual a 1");
			return null;
		}
		List<Integer> retorno = new ArrayList<>();
		int i;
		Random rand = new Random();
		for(i = 0; i < n; i++) {
			retorno.add(rand.nextInt(maxNumber));
		}
		return retorno;
	}
}
