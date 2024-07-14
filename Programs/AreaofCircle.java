package mktpackage1;

import java.util.Scanner;

public class AreaofCircle {
	Scanner sc = new Scanner(System.in);
	double pi = Math.PI;
	public void integer() {
		System.out.println("Enter the radius of int number");
		int r = sc.nextInt();
		double result = pi*r*r;
		System.out.println("Area of circle with first input is "+result);
	}
	public void doub() {
		System.out.println("Enter the radius of doub number");
		double r = sc.nextDouble();
		double result = pi*r*r;
		System.out.println("Area of circle with second input is "+result);
	}
	public void flo() {
		System.out.println("Enter the radius of float number");
		float r = sc.nextFloat();
		double result = pi*r*r;
		System.out.println("Area of circle with third input is "+result);
	}
	public void byt() {
		System.out.println("Enter the radius of byte number");
		byte r = sc.nextByte();
		double result = pi*r*r;
		System.out.println("Area of circle with fourth input is "+result);

	}
	public void sho() {
		System.out.println("Enter the radius of short number");
		short r = sc.nextShort();
		double result = pi*r*r;
		System.out.println("Area of circle with fifth input is "+result);
	}
	public static void main(String[] args) {
		AreaofCircle aoc = new AreaofCircle();
		aoc.integer();
		System.out.println("---------------------------------------");
		aoc.doub();
		System.out.println("---------------------------------------");
		aoc.flo();
		System.out.println("---------------------------------------");
		aoc.byt();
		System.out.println("---------------------------------------");
		aoc.sho();
	}

}
