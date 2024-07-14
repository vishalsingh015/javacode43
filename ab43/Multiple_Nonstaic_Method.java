package ab43;

public class Multiple_Nonstaic_Method {

	public void add() {
		System.out.println("Addition");
	}
	public void sub() {
		System.out.println("Substraction");
	}
	public void div() {
		System.out.println("Divison");
	}
	public void mul() {
		System.out.println("Multiplication");
	}
	public static void main(String[] args) {
        System.out.println("Main Method");
        Multiple_Nonstaic_Method mns = new Multiple_Nonstaic_Method();
        mns.add();
        mns.sub();
        mns.div();
        mns.mul();
	}

}
