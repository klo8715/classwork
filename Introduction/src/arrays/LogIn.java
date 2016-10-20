package arrays;

import java.util.Scanner;

public class LogIn {
	static Scanner input = new Scanner (System.in);
	
	public static String waitforEntry()
	{
		return input.nextLine();
	}
	//1 point for private
	//1 point for declaration of data type (String)
	private static String username ="test_user";
	private static String password = "test";
	
	public static void main(String[] args)
	{
		//1 point for the user only have one chance to put in info
		if(correctUser())
		{
			askPassword();
			
		}
		else
		{
			System.out.println("Unknown user name,"+"Please contact network administrator");
		}
	}
	private static void askPassword()
	{
		boolean inLoop = true;
		int remainingTime = 3;
		//one point for using a loop
		while(inLoop)
		{
			System.out.println("Enter your password");
			String entry = waitforEntry();
			if (entry.equals(password))
			{
				System.out.println("you are in");
				inLoop = false;
			}
			else
			{
				remainingTime--;
				if(remainingTime ==0)
				{
					System.out.println("invalid password");
					inLoop=false;
				}
				else
				{
					System.out.println("incorrect password and you have "+remainingTime +"left");
					
				}
			}
		}
	}
	private static boolean correctUser()
	{
		//1 point using .equals
		if (waitforEntry().equals(username))
		{
			return true;
		}
		return false;
	}

}
