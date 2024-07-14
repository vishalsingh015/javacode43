package ab43;

public class A_Nonstatic_Method {
    
	public void nation() {
		System.out.println("I am from India");
	}
	public static void main(String[] args) {
		A_Nonstatic_Method anm = new A_Nonstatic_Method();
		System.out.println("Main Method");
		anm.nation();
	}

}
