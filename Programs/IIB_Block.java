package mktpackage1;

public class IIB_Block {
	
// #SIB Block	
	static{
		System.out.println("1st SIB Block");
	
	}
// #Static Method	
	public static void sub() {
		System.out.println("Static Method");
	}
// #non-static method	
	public void add() {
		System.out.println("Non-Static Method");
	}
	{
		System.out.println("3rd IIB Block");
	}
// #Constructor
	IIB_Block(){
		System.out.println("Constructor");
	}
// #IIB Block
	{
		
		System.out.println("IIB Block");
	}
// #IIB Block	
	{
		System.out.println("2nd IIB Block");
	}
//	#SIB Block
	static
	{
		System.out.println("2nd SIB Block");
	}
	
public static void main(String[] args) {
	System.out.println("Main Method Starts");
	
    sub();
	IIB_Block a1 = new IIB_Block();
	a1.add();
	System.out.println("Main Method");
	System.out.println("---------------------------------------------------------------");
	new IIB_Block();
	
}
}
