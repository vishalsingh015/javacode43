package mktpackage1;

import java.util.Scanner;

public class ScannerLocal {
public void add (int a, int b) {

	
    int result = a+b;
    System.out.println("Sum of two number is "+result);
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ScannerLocal sl = new ScannerLocal();
	System.out.println("Enter the first number");
	int a1 = sc.nextInt();
	System.out.println("Enter the second number");
	int a2 = sc.nextInt();
    sl.add(a1, a2);
	
}
}
