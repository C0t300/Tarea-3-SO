package uno;

import java.util.Scanner;

public class Input {
	
	String funct = "";
	int x = 0;
	
	public Input(String f, int a) {
		this.funct = f;
		this.x = a;
	}
	
	public void getInput() {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String numbers = str.replaceAll("[^-?0-9]+", " "); 
		numbers = numbers.replaceAll("\\s+","");
		this.x = Integer.parseInt(numbers);
		this.funct = str.charAt(0) + "(x)";
		sc.close();
	}
}
