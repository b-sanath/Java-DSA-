package javabasics;

public class minarrays 
{
	public static void main(String[] args) {
		
	
	int[] arr= {50,40,20,80,60};
	
	int min=arr[0];
	
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]<min)
		{
			min=arr[i];
		}
		
	}
	System.out.println("Minimum = "+min);

}
}

