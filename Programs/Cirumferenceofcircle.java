package mktpackage1;

import java.util.Scanner;

public class Cirumferenceofcircle{
	final static float pi = 3.14f;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of r");	
		int r = sc.nextInt();
		double result = 2*pi*r;
		System.out.println("Circumference of circle is "+result);
		sc.close();
	}
}
