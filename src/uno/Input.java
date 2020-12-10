package uno;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Input {
	
	String funct = "";
	int x = 0;
	
	public void getInput() {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String numbers = str.replaceAll("[^-?0-9]+", " "); 
		numbers = numbers.replaceAll("\\s+","");
		this.x = Integer.parseInt(numbers);
		this.funct = str.charAt(0) + "(x)";
	}
}
