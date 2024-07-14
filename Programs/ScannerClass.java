package mktpackage1;

import java.util.Scanner;

public class ScannerClass {
	
	final static float  pi= 3.14f;
	Scanner sc = new Scanner(System.in);
	double result;
	public void inradius() {
		System.out.println("Enter the value of radius");
		int r = sc.nextInt();
		result = pi*r*r;
		System.out.println("Area of circle "+result);
		
	}
	public void doubleradius() {
		System.out.println("Enter the value of radius");
		double r = sc.nextDouble();
		result =pi*r*r;
		System.out.println("Area of circle "+result);
	}
public static void main(String[] args) {
	ScannerClass sc = new ScannerClass();
	sc.doubleradius();
	System.out.println("--------------------------");
	sc.inradius();

}
}
