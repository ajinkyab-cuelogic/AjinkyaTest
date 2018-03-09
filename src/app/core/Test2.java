package app.core;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		String ipString = null;
		int ipNumer;
		char ipChar;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string ");
		ipString  = sc.next();
		
		System.out.println("Enter Number ");
		ipNumer  = sc.nextInt();
		
		System.out.println("Enter Character ");
		ipChar	= sc.next().charAt(0);
		
		System.out.println(ipString + "   "+ ipNumer + "   " + ipChar);
		sc.close();

	}

}
