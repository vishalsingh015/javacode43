package ab43;

import java.util.Scanner;

public class Voting {
public static void main(String[] args) {
	int age ;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the age");
	age = sc.nextInt();
	if(age>=18)
	{
		System.out.println("Person eligible to vote");
	}
	else 
	{
		System.out.println("Not eligible!");
	}
	System.out.println("Enter the age 2nd time");
	age = sc.nextInt();
	if(age>=18)
	{
		System.out.println("Person eligible to vote");
	}
	else 
	{
		System.out.println("Not eligible!");
	}
}
}
