package javabasics;

public class linearsearch 
{
	public static void main(String[] args) 
	{
		
		int[] arr= {5,7,3,4,8,9,1};
		
		int target=1;

		
//		boolean found=false;
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			
//			if(arr[i]==target)
//			{
//				found=true;
//				
//			}
//			
//		}
//		
//		if(found==true)
//		{
//			System.out.println("Element found in the array");
//		}
//		else
//		{
//			System.out.println("Element not found in the array");
//		}
		
		
		int index=-1;
		
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i]==target)
			{
				index=i;
			}
			
		}
		
		System.out.println("The position of the number is= "+index);
		
		
		
		
	}

}
