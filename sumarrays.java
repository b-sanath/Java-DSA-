package javabasics;
import java.util.*;

public class sumarrays 
{
	public static void main(String[] args) 
	{
		System.out.println("enter the size of the array= ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		
		System.out.println(Arrays.toString(arr));
		
		//SUM Array
		int sum = 0;
		
		for(int i=0;i<n;i++)
		{
			sum+=arr[i];
		}
		
		System.out.println("Sum of the array= "+sum);
		
		
		
		
	}
	

}
