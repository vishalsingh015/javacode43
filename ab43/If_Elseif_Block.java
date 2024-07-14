package ab43;

public class If_Elseif_Block {

	public static void main(String[] args) {
	 int age = 25;
	 double salary = 58240;
    if(age>18 && salary<20000)
    {
    	System.out.println("you are eligible to vote but you cannot avail loan");
    }
    else if(age>18 && salary<60000) {
    	System.out.println("You can avail loan from the ABC Bank");
    }
    else {
    	System.out.println("Niether you can vote nor avail loan from ABC Bank");
    }
	}

}
