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
				String[] strings2 = new String[0];
				
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
