package mktpackage1;

public class Constructor {
	 int a =100;
public  Constructor(int a) {
	System.out.println("First Constructor with int value "+a);
}
Constructor(char a){
	System.out.println("Second Constructor with char value "+a);
}
Constructor(String d){
	System.out.println("Third Constructor with String value "+d);
}
Constructor(boolean a)
{
	System.out.println("Fourth Constructor with boolean value "+a);
}
Constructor(int a,boolean b,String c)
{

	System.out.println("Fifth Constructor with values int "+a+", boolean "+b+" and String "+c);
}
//public void h() {
	//this(22);
	
//}
public static void main(String[] args) {
	new Constructor(20);
	new Constructor('D');
	new Constructor("Vishal");
	new Constructor(false);
	new Constructor(99,true,"Singh");

}
}
