package arrays;

public class ArraysMain {
	public static void main (String[]args)
	{
		//This is how you time how
		//quickly a computer processes
		long startTime = System.currentTimeMillis();
//		arrayIntroMethod();
		SampleElement sample = new SampleElement(10);
		sample.increase();
		System.out.println("The sample element has " + "a number equal to " + sample.getNumber());
		long endTime = System.currentTimeMillis();
		System.out.println("Complete method in " + (endTime - startTime)+"milliseconds");
//		String[] someStrings = new String[100];
//		populateArray(someStrings);
//		printArray(someStrings);
//		int ten = 10;
//		increase(ten);
//		System.out.println("ten, increased is "+ten);
		//is this method, we pass the ELEMENT 
		//(a variable) not the array so no change will be made
//		System.out.println("Before " +someStrings[99]);
//		changeString(someStrings[99]);
//		System.out.println("After \"changeString\"method" +someStrings[99]);
//		changeArray(someStrings);
//		changeArrayElement(someStrings, 99);
	}
	private static void passByValueDemonstration()
	{
		String[] someStrings = new String[100];
		populateArray(someStrings);
		printArray(someStrings);
		int ten = 10;
		increase(ten);
		System.out.println("ten, increased is "+ten);
		System.out.println("Before " +someStrings[99]);
		changeString(someStrings[99]);
		System.out.println("After \"changeString\"method" +someStrings[99]);
		changeArray(someStrings);
		changeArrayElement(someStrings, 99);
	}
	private static void changeArrayElement(String[] someStrings, int i)
	{
		someStrings[1] = "new item"+(i+1);
		
		
	}
	private static void changeArray(String[] someStrings) 
	{
		someStrings = new String[100];
		for(int i=0; i<someStrings.length; i++)
		{
			someStrings[i]="new item" + (i+1);
		}
		
	}
	private static void increase(int x)
	{
		x=x+1;
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
