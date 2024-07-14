package mktpackage1;

public class C {
  public static void A()
  {
	  System.out.println("Static method A");
  }
  public static void B()
  {
	  System.out.println("Static methdd B");
  }
  public static void C() 
  {
	  System.out.println("Static method C");
  }
  public static void D() {
	  System.out.println("Static method D");
  }
  public void E()
  {
	  System.out.println("Non-static method E");
  }
  public void F()
  {
	  System.out.println("Non-static method F");
  }
  public void G()
  {
	  System.out.println("Non-static method G");
  }
  public void H()
  {
	  System.out.println("Non-static method H");
  }
  public static void main(String[] args) {
	  System.out.println("Calling static method");
	A();
	B();
	C();
	D();
	 System.out.println("Calling of Static method done");
	 System.out.println("------------------------------------------------------------------------");
	C a1 = new C();
	System.out.println("Calling non-static method");
	a1.E();
	a1.F();
	a1.G();
	a1.H();
	System.out.println("Calling of non-static method done");
}
}
