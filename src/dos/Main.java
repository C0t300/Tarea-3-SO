package dos;
import java.text.DecimalFormat;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		int n = 400000;
		int maxNumber = 100;
		boolean showArrays = false;
		List<Integer> desorden = RandomArray.randArray(n, maxNumber);
		
		if(showArrays) {
			System.out.println(desorden);
		}
		
		Sort s = new Sort();
		int[] arr = new int[desorden.size()];
		for (int i =0; i < desorden.size(); i++) {
            arr[i] = desorden.get(i); 
		}
		
		long startTime = System.nanoTime();
		s.sort(arr, 0, n-1);
		long totalTimeNoThreads = System.nanoTime() - startTime;
		
		if(showArrays) {
			for (int x : arr) {
	            System.out.print(x + " "); 
			}
		}
		System.out.print("\n");
		System.out.println("Sin threads toma: " + String.valueOf(totalTimeNoThreads) + " nanosegundos");
		
		
		arr = new int[desorden.size()];
		for (int i =0; i < desorden.size(); i++) {
            arr[i] = desorden.get(i); 
		}
		SortThread st = new SortThread(arr, 0, n-1);
		
		startTime = System.nanoTime();
		st.run();
		long totalTime = System.nanoTime() - startTime;
		if(showArrays) {
			for (int x : arr) {
	            System.out.print(x + " "); 
			}
		}
		long dif = totalTimeNoThreads - totalTime;
		long div = 1000000000L;
		double sec = ((double)dif/div); /* casting one of the variables to (double) means the result will not be 0 */
		
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(4);
		String seconds = df.format(sec);
		
		System.out.print("\n");
		System.out.println("Con threads toma: " + String.valueOf(totalTime) + " nanosegundos.");
		System.out.println("Entregando una diferencia de " + String.valueOf(dif) + " nanosegundos o " + seconds + " segundos aproximadamente.");

	}

}
