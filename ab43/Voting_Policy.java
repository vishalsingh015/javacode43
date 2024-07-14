package ab43;

import java.util.Scanner;

public class Voting_Policy {
	static String name ;
    static int age;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name");
    name = sc.next();
    System.out.println("Enter your age");
    age = sc.nextInt();
        if(age>18) {
        	System.out.println(name+" you can cast vote");
        }
        else {
        	System.out.println("Not eligible to cast vote");
        }
	}

}
