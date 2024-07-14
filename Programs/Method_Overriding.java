package mktpackage1;

class Method{
	public final void sub() {
		System.out.println("This is Parent method");
	}
}
public class Method_Overriding extends Method {
 
	
	public void subb() {
		super.sub();
		System.out.println("This is Child method");
		super.sub();
	}
	public static void main(String[] args) {
		Method_Overriding m1 = new Method_Overriding();
		m1.sub();
		m1.subb();
	}
}
