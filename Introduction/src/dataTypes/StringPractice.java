package dataTypes;

import java.util.Scanner;

public class StringPractice 
{
	static Scanner input;
	static String user;
	static int lineCount;

	public static void main(String[] args) 
	{
		createAScanner();
		lineCount=0;
		demonstrateStringMethods();
		promptName();
		talkForever();
		
		
	}
	public static void promptName()
	{
		print ("hi, your \n name is?"); // \n means </br>
		user = input.nextLine();
		print("bye");
	}
	public static void talkForever()
	{
		while(true)
		{
			promptInput();
		}
	}
	public static void promptInput()
	{
		print(user + ",Try putting in a string");
		String userInput = input.nextLine();
		print("you typed: "+userInput);
	}
	public static void print (String s)
	{
		lineCount++;
		System.out.println("Line#"+lineCount+":"+s);
	}
	public static void createAScanner()
	{
		input = new Scanner (System.in);
		
	}
	public static void demonstrateStringMethods()
	{
//		String text = new String("Hello World");
		String text1 = "Hello World"; // same as above
		String text2 = "Hello "; // same as above
		String text3 = "World";
		if(text1.equals (text2+text3)) // .equals is more accurate to ==
		{
			System.out.println("These strings are equal."); // doesn't work
		}
        System.out.println(text1);
        System.out.println(text2+text3);
        
        String word1 = "Aardvark";
        String word2 = "Zyzzyva";
        if(word1.compareTo(word2)<0)
        {
        	System.out.println("word1 is before word2." + "lexicongraphically.");
        }
	}

}
