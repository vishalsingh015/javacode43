package ab43;

public class A_Static_Method {
public static void add()
{
	System.out.println("Calling a static method from the main method");
}
public static void main(String[] args) {
	System.out.println("Main Method");
	add();
}
	
}
