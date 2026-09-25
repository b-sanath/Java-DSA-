package javabasics;

public class occurenceoffirstduplicatelinear 
{
	public static void main(String[] args) 
	{
		
		int[] arr= {5,7,1,4,9,1,3,2,1};
		
		int target=1;
		
		int index=-1;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
			{
				index=i;
				break;
			}
		}
		
		System.out.println("The first ocuurence of target is at index= "+index);
		
	}

}

