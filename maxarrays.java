package javabasics;
import java.util.*;

public class maxarrays 
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
		
		int sum = 0;
		
		for(int i=0;i<n;i++)
		{
			sum+=arr[i];
		}
		
		System.out.println("Sum of the array= "+sum);
		
		//Maximum Array
		int maxarr=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if (arr[i]>maxarr)
			{
				maxarr=arr[i];
				
			}
				
		}
		System.out.println("Maximum in the array= "+maxarr);
		
		
		
		
	}
	

}
