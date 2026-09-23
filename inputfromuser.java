package javabasics;
import java.util.*;

public class inputfromuser 
{
	
	public static void main(String[] args) 
	{
		System.out.println("Enter first digit= ");
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		sc.nextLine();

		System.out.println("Enter second digit= ");
		int b=sc.nextInt();
		
		int c=a+b;
		
		System.out.print("Result= ");
		System.out.println(c);
		
	}
	

}
