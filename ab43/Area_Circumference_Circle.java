package ab43;

import java.util.Scanner;

public class Area_Circumference_Circle {
    final static double pi = 3.14;
    static int radius;
	public void area () 
	{
	Scanner sc = new Scanner(System.in);	
    System.out.println("Enter the radius");
    radius = sc.nextInt();
    double result = pi*radius*radius;
    System.out.println("Area of circle "+result);
	}
	public static void circum()
	{
		Scanner sc = new Scanner(System.in);	
	    System.out.println("Enter the radius");
	    radius = sc.nextInt();
	    double result = 2*pi*radius;
	    System.out.println("Circumference of circle is "+result);
	}
	public static void main(String[] args) {
		Area_Circumference_Circle acc = new Area_Circumference_Circle();
		acc.area();
		circum(); 	
	}

}
