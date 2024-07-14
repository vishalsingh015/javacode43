package mktpackage1;

import java.util.Scanner;

public class ScannerGlobal {
	Scanner sc = new Scanner(System.in);
	static int a;
	int a1;
	
	public void add() {

		//Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number");
		int a = sc.nextInt();
		System.out.println("Enter the second number");
		int b = sc.nextInt();
		System.out.println("The sum of two number is "+(a+b));
	}
	public void sub() {
		//Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number");
		int a = sc.nextInt();
		System.out.println("Enter the second number");
		int b = sc.nextInt();
		System.out.println("The sub of two number is "+(a-b));
	}
	public void mul() {
		//Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number");
		int a = sc.nextInt();
		System.out.println("Enter the second number");
		int b = sc.nextInt();
		System.out.println("The mul of two number is "+(a*b));
	}
	public void div() {
		//Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number");
		int a = sc.nextInt();
		System.out.println("Enter the second number");
		int b = sc.nextInt();
		System.out.println("The div of two number is "+(a/b));
	}
	public void mod() {
		//Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number");
		int a = sc.nextInt();
		System.out.println("Enter the second number");
		int b = sc.nextInt();
		System.out.println("The mod of two number is "+(a%b));
		sc.close();
	}
public static void main(String[] args) {
	
	ScannerGlobal s = new ScannerGlobal();
	s.add();
	System.out.println("------------------------------------------------------");
	s.sub();
	System.out.println("------------------------------------------------------");
	s.mul();
	System.out.println("------------------------------------------------------");
	s.div();
	System.out.println("------------------------------------------------------");
	s.mod();
	
	
	
	
}
}
