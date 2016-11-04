package arrays;

public class Array {
	public static void main(String[] args)
	{
		int[] array = {1,2,3,4,6,7,8};
		longestConsecutiveSequence(array);
	}
	 public static int longestConsecutiveSequence(int[] array1){
		    /**This method counts the longest consequtive sequence in an array.
		    * It does not matter where the sequence begins
		    * If there are no consecutive numbers, the method should return '1'
		    * 
		    * Examples:
		    * longestSequence({1,2,3,4,5,8,9}) returns '5', since the sequence '1,2,3,4,5' is 5 integers long 
		    * longestSequence({0,9,10,11,4,3,8,9}) returns '3', since '9,10,11' is 3 integers long
		    * longestSequence({0,9,8,11,4,3,7,9}) returns '1', since there are no consecutive integers
		    * */
		    
		    int counter2 = 1;
		    int counter = 1;
		    
		    for(int i=0;i<array1.length; i++)
		    {
		        int j = i;
		        while (j<=array1.length-1 && array1[j+1]==array1[j]+1)
		        {
		            counter++;
		            j++;
		        }   
		    }
		    if (counter == 0)
		    {
		    return counter2;
		    }
		    else
		    {
		    return counter;
		    }
		    }
	 
	 public static int[] anotherMethod(int [] array)
	 {
		 int[] randArry = new int[array.length-1];
		 int[] arr = array;
		 while(randArry.length< arr.length)
		 {
//			 for(int i=0;i<arr.length;i++)
//			 {	
//				 arr[i]=
//				 if 
//			 }
		 }
		 return randArry;
	 }
		    

}
