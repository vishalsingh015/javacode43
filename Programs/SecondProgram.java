package mktpackage1;

public class SecondProgram {
 public static void add () {
	 int a = 20;
	 int b = 30;
	 int sum = a+b;
	 System.out.println("Sum of two number is "+sum);
 }
 public static void sub (){
	 int a =30;
	 int b = 10;
	 int sub = a-b;
	 System.out.println("Sub of two number is "+sub);
 }
 public static void mult()
 {
	 int a = 10;
	 int b =2;
	 int mult = a*b;
	 System.out.println("Multiply of two number is "+mult);
 }
 public static void div()
 {
	 int a = 20;
	 int b= 10 ;
	 int div = a/b;
	 System.out.println("Divide of two number is "+div);
 }
 public static void main(String[] args) {
	System.out.println("We are performing arithmetic operation by creating static method and calling it from main method");
	add();
	sub();
	mult();
	div();
	}
}
