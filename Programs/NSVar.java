package mktpackage1;

public class NSVar {
	int a=78;
	
public static void main(String[] args) {
	NSVar a1 = new NSVar();
    a1.a =99;
	System.out.println(a1.a);
	System.out.println(new NSVar().a);
	NSVar a2 = new NSVar();
	System.out.println(a2.a);
}
}
