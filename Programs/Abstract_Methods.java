package mktpackage1;
abstract class AB{
	abstract void add ();
	abstract void sub();
 //abstract static void dic();
	void mul() {
	  System.out.println("mul");
	}
	static void ap() {
		System.out.println("Ap");
	}
}
public class Abstract_Methods extends AB {
	void modulous() {
		System.out.println("odulous");
		
	}
	
   void add() {
	   System.out.println("Add");
   }
   void sub() {
	   System.out.println("Sub");
   }
   void mul()
   {
	   System.out.println("Multiply");
   }
   static void ap() {
	   System.out.println("APP");
   }
   public static void main(String[] args) {
	   Abstract_Methods am = new Abstract_Methods();
	   am.add();
	   am.sub();
	   am.mul();
	   am.modulous();
	   ap();
}
}
