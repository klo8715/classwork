package dataTypes;

public class cardDecks {

	public static void main(String[] args) {
		boolean hello;
		String[] types= { "spade","heart","clubs","diamond"};
		int counter;
		hello = true;
		counter = 0;
		while (hello)
		{
			for (int index = 0; index<13; index++)
			{
				if(index <=9)
				{
					System.out.println("card #" + (index+1)+ "card is " + types[counter]);
				}
				else if (index == 10)
				{
					System.out.println("card is Jack " + "card is" + types[counter]);
				}
				else if (index == 11)
				{
					System.out.println("card is Queens " + "card is " + types[counter]);
				}
				else if (index == 12)
				{
					System.out.println("card is Kings " + "card is " + types[counter]);
				}
			}
			
			if (counter<types.length)
			{
				counter++;
			}
		}
	}

}
