package app.core;

import java.util.Scanner;

public class Test4 {
	

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
 
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        scan.close();
        
        System.out.println("test");
        System.out.println("String : " + s);
        System.out.println("Double : " + d);
        System.out.println("Int : " + i);
    }

}
