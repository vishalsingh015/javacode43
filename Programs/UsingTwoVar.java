package mktpackage1;

public class UsingTwoVar {
int a = 10;
int b = 20;
    static void  address(){
	
}
public void add() {
	System.out.println("Sum of two number is "+(a+b));
}
public  void sub() {
	System.out.println("Sub of two number is "+(b-a));
}
public void div() {
	System.out.println("Div of two number is "+(b/a)+" & "+(b%a));
}
public void mul() {
	System.out.println("Mul of two number is "+(a*b));
}
public static void main(String[] args) {
	UsingTwoVar a1 = new UsingTwoVar();
	a1.add();
	a1.sub();
	a1.div();
	a1.mul();
}
}
