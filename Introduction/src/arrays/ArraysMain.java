package arrays;

public class ArraysMain {
	public static void main (String[]args)
	{
		//This is how you time how
		//quickly a computer processes
		long startTime = System.currentTimeMillis();
		arrayIntroMethod();
		long endTime = System.currentTimeMillis();
		System.out.println("Complete method in " + (endTime - startTime)+"milliseconds");
		String[] someStrings = new String[100];
		populateArray(someStrings);
		changeString(someStrings[99]);
		printArray(someStrings);
	}
	private static void changeString(String s)
	{
		s="This string has been changed";
	}
	public static void printArray(String[] a)
	{
		for (String s:a)
		{
			System.out.println(s);
		}
	}
	public static void populateArray(String[] a)
	{
		for (int index= 0; index<a.length; index++)
		{
			a[index]="value"+(index+1);
		}
	}
	public static void arrayIntroMethod()
	{
		//construct 2 arrays
				// these two methods do the same thing
				//primitive type arrays fill with ZEROS 0,0,0 false
				int [] zeros1 = {0,0,0};
				int [] zeros2 = new int[3];
				//int, type, boolean
				//example
				boolean[] booleans = new boolean [3];
				//iterate (2 ways)
				//WHEN TO US THIS FOR LOOP
				// - the index of the data is important to reference
				// - you need to customize how you iterate
				// increase by 2, backwards, etc..
				for (int index= 0; index<booleans.length; index++)
				{
					System.out.println(index+")" + booleans[index]);
				}
				
				// second method:
				// always goes in order, does not keep track of index
				for (boolean b:booleans)
				{
					System.out.println(""+b);
				}
				
				String[] strings1 = {"","",""};
				String[] strings2 = new String[3];
				for(int index=0; index <strings2.length; index++)
				{
					strings2[index] = "value"+(index+1);
				}
				
				//these are constructors are different
				for (String s: strings1)
				{
					System.out.println(s);
					
				}
				for (String s: strings2)
				{
					System.out.println(s);
				}
	}

}
