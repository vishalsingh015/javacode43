package mktpackage1;

public class This_Calling_Statement {
	This_Calling_Statement(){
		this(23);
	System.out.println("1st");	
	}
	This_Calling_Statement(int a){
		this("Vishal");
		System.out.println("2nd");
	}
	This_Calling_Statement(String s1){
		System.out.println("3rd");
	}
public static void main(String[] args) {
	This_Calling_Statement tcs = new This_Calling_Statement();
}
}
