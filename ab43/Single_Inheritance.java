package ab43;

class Addition
{ 
	int a = 34;
	int b = 45;
	public void add() {

	int sum = a+b;
	System.out.println(sum);
	
	}
	
}
public class Single_Inheritance extends Addition {
	public  void sub() {
		int sub = a-b;
		System.out.println(sub);
	}
      public static void main(String[] args) {
    	  Single_Inheritance si = new Single_Inheritance();
    	  si.add();
    	  si.sub();
    	  
	}
}
