package by.bntu.fitr.povt.bugncrack.javalabs.util;

import java.util.Scanner;

public class UserInput {
	public static String input(String msg) {
		Scanner scanner = new Scanner(System.in);

		System.out.print(msg);
		String value = scanner.nextLine();
		
		return value;
	}		
	
}