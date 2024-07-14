package ab43;

import java.util.Scanner;

public class All_Scanner_Class {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the byte number");
	byte b = sc.nextByte();
	System.out.println(b);
	System.out.println("Enter the integer range number");
	int i = sc.nextInt();
	System.out.println(i);
	System.out.println("Enter the short range number");
	short s = sc.nextShort();
	System.out.println(s);
	System.out.println("Enter the long range number");
	long l = sc.nextLong();
	System.out.println(l);
	System.out.println("Enter the float range number");
	float f = sc.nextFloat();
	System.out.println(f);
	System.out.println("Enter the double range number");
	double d = sc.nextDouble();
	System.out.println(d);
	System.out.println("Enter the boolean range number");
	boolean boo = sc.nextBoolean();
	System.out.println(boo);
	System.out.println("Enter the String");
	String str = sc.next();
	System.out.println(str);
}
}
