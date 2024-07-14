package mktpackage1;

public class Non_Static_Method {
	public int add(int a,String s,char c) {
		System.out.println(a);
		System.out.println(s);
		System.out.println(c);
		a=89;
		return 200;
	
		
	}
public static void main(String[] args) {
	Non_Static_Method a1 = new Non_Static_Method();
	int returnvalue = a1.add(45,"Vishal",'t');
	System.out.println("main");
	System.out.println(returnvalue);
}
}
