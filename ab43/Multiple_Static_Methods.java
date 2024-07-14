package ab43;

public class Multiple_Static_Methods {
  public static void addition() {
	  int a = 34;
	  int b= 55;
	  int add = a+b;
	  System.out.println("Addition of two numbers is "+add);
  }
  public static void substraction() {
	  float a = 24.5f;
	  int b =45; 
	  float sub = a-b;
	  System.out.println("Substraction of two numbers is "+sub);
  }
  public static void multiply() {
	  int c= 45;
	  int f = 45;
	  int mult = c*f;
	  System.out.println("Multiply of two numbers is "+mult);
  }
  public static void main(String[] args) {
	System.out.println("Main Method");
	addition();
	substraction();
	multiply();
}
}
