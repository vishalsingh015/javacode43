package mktpackage1;

abstract class Google_Code{
	abstract public void login();
	abstract public void registration();
}
public class Abstract_Class extends Google_Code {
	final int a = 34;
	final static int b =99;
public void login() {
	System.out.println("Login");
}
public void registration() {
	System.out.println("Registration");
}
public static void main(String[] args) {
	Abstract_Class ab = new Abstract_Class();
	ab.login();
	ab.registration();
	System.out.println(ab.a);
	System.out.println(b);
}
}
