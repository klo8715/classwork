package sort;

public class RecursionIntro {
	public static void main(String[] args)
	{
		System.out.println("using a for lopp..");
		for (int i=0; i<5; i++)
		{
			System.out.println("Hello everyone");
		}
		System.out.println("using recursion...");
		int numberOfTimes=5;
		forLoop(numberOfTimes, new Action()
		{
			public void act()
			{
				System.out.println("Hello Everyone");
			}
		});
	}
	private static void forLoop(int numberOfTimes, Action action) {
		if (numberOfTimes<2)
		{
			action.act();
			
		}
		else
		{
			action.act();
			forLoop(numberOfTimes-1,action);
		}
		
		
	}
	public static void hanoi(int numberOfdiscs, String form, String mid, String top)
	{
		if (numberOfdiscs<=2)
		{
			print("Move from " + form + "to " + top  );
			
		}
		else
		{
			hanoi(numberOfdiscs-1, form,top,mid);
			hanoi(1, form, mid, top);
			
			hanoi(numberOfdiscs-1, mid,form,top);
		}
	}
	private static int moveCount-1;
	public static void print(String string)
	{
		System.out.println("Move #);
	}
}
