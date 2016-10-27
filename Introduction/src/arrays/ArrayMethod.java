package arrays;
import java.util.Random;
public class ArrayMethod {
	public static void main(String[] args) {
		/**
		 * IMPORTANT NOTE: 
		 * This homework assignment will be weighted 4x.
		 * DO NOT ASSUME my tests are perfect! If you have code that you think should work, 
		 * but you keep failing the tests PLEASE bring it to my attention so that I can fix the tests
		 * DO NOT spend hours and hours trying to fix perfect code just because my test
		 * says that it isn't perfect!
		 * */
		int[] testArray = {2,3,4,6,9,11,12,15};
//		System.out.println(checkHalfway(testArray,12,0,testArray.length-1));
//		swap(testArray,0,testArray.length-1);
		shuffle(testArray);
		print(testArray);
//		if(checkHalfway(testArray,12,0,testArray.length-1)){
//			System.out.println("The number you are searching for is less than the value in the middle of the array");
//		}
//		else{
//			System.out.println("The number you are searching for is greater than or equal to the value in the middle of the array");
//		}
	}
	//gap

	private static void print(int[] arr) {
		for(int i = 0; i < arr.length-1; i++){
			System.out.print(arr[i]+", ");
		}
		System.out.println(arr[arr.length-1]);
	}

	private static void shuffle(int[] arr) {
		for(int i = 0; i<arr.length; i++){
			int random = (int)(Math.random()*arr.length);
			swap(arr,i,random);
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int placeholder = arr[j];
		arr[j] = arr[i];
		arr[i] = placeholder;
	}
	public static int countUnderBound(double[] arr, double d)
	{
		int counter = 0;
		for(int i=0;i<arr.length;i++)
		{
			if (arr[i] < d)
			{
				counter++;
			}
		}
		return counter;
	}
	/**
	 * returns true if searchValue is less than element
	 * halfway between beginning and end
	 * @param testArray the int[] to be searched
	 * @param i
	 * @param j
	 * @param length
	 * @return
	 */

	private static boolean checkHalfway(int[] arr, int searchValue, int begin, int end) {
		return searchValue < arr[(begin+end+1)/2];
	}
	public static int longestConsecutiveSequence(int[] array1){
		count = 0;
		for(int i = 0; i<array1.length; i++){
			if(array1[i]+1==array1[i+1]){
				count++;
			}
		}
	}
	public static int[] getSubArray(int[] arr, int startIndex, int endIndex)
	{
		int[] subArray = new int[endIndex = startIndex +1];
		for (int i=0; i<subArray.length; i++)
		{
			subArray[i] = arr[startIndex+1];
		}
	}
	public static boolean contains(int[], int[] subArray)
	{
		for (int i=0; i<arr.length;i++)
		{
			int j= 0;
			while (j<length)
			{
				if (subArray[j]==arr)
				{
					
				}
			}
		}
	}
	private static void testPrimes (int numberToTest)
	{
		int lastToCheck = (int) (Math.sqrt(numberToTest));
		boolean[] theNumbers = new boolean(numberToTest);
		for (int i= 0; i< numberToTest;i++)
		{
			theNumber[i] = true;
		}
		theNumber[0] = false;
		theNumber[1] = false;
		for(int text = 2; text<= lastToCheck; text = text + increment)
		{
			if(!first)
			{
				theNumber[test] = false;
				
			}
			else
			{
				first= false;
			}
		}
		for (int i=0; i<theNumbers.length; i++)
		{
			if(theNumber[i])
			{
				System.out.println(i + "is prime.");
			}
		}
	}
}