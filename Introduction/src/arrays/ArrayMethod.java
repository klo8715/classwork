package arrays;

public class ArrayMethod {
	public static void main(String[] args)
	{
		int [] arr={2,3,4,6,9,11,12,13};
//		swap(arr,6, arr.length-1);
		shuffle(arr);
		if(checkHalfway(arr,12,9,arr.length-1))
		{
			System.out.println("The number you are searching for is less than the value in the middle of the array");
		}
		else
		{
			System.out.println("THe number is greater than equal to the value in the middle of the array");
		}
	}
	private static void shuffle(int[] arr) {
		for(int i=0; i <arr.length;i++)
		{
			int random = (int)(Math.random)*6)
			
		}
		
	}
	private static void swap(int[] arr, int i, int j) {
		int placeholder = arr[j];
		arr[j]=arr[i];
		arr[i]= placeholder;
		
	}
	private static boolean checkHalfway(int[] arr,int i, int j, int length)
	{
		
		return searchValue <arr[(begin+end+1)/2];
	}
	
}