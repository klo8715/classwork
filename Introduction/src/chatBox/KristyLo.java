package chatBox;


	import java.util.Scanner;

	public class KristyLo
	{
	
		static Scanner input;
		static String user;
		static boolean inLoop;
		static String response;
		static Topic school;
		static Topic like;
		static Topic hello;

		public static void main(String[] args) 
		{
			createTopic();
			promptName();
			talkForever();
			
			
		}
		public static void promptName()
		{
			print ("hi, your \n name is?"); // \n means </br>
			user = input.nextLine();
			print("hi");
		}
		public static void talkForever()
		{
			inLoop = true;
			while(true)
			{
				print("Greetings, "+user +"How are you?");
				response = getInput();
				if (findKeyword(response,"good", 0)>=0)
				{
					print("I'm so happy you're good.");
				}
				else if(like.isTriggered(response))
				{
					inLoop = false;// wait this Loop
					school.talk();
				}
				else if(school.isTriggered(response))
				{
					inLoop = false;// wait this Loop
					like.talk();
				}
				else if(hello.isTriggered(response))
				{
					inLoop = false;// wait this Loop
					hello.talk();
				}
				else
				{
					print("I'm sorry, I don't understand you.");
				}
				
			}
		}
		public static int findKeyword(String searchString, String key,  int startIndex)
		{
			//delete white space
			String phrase = searchString.trim();
			// set all the letters are lower case
			phrase = phrase.toLowerCase();
			key = key.toLowerCase();
			
			// find position of key
			int psn = phrase.indexOf(key);
			//keep looking for the word until you find the right context
			while (psn >= 0)
			{
				String before = " ";
				String after = " ";
				//if the phrase does not end with this word
				if(psn + key.length()<phrase.length())
				{
					after  = phrase.substring(psn + key.length(), psn +key.length()+1).toLowerCase();
				}
				//if the phrase does not begin with this word
				if (psn>0)
				{
					before = phrase.substring(psn-1,psn);
				}
				if(before.compareTo("a")< 0 && after.compareTo("a") < 0)
				{
					if(noNegations(phrase,psn))
					{
						return psn;
					}
					
				}
				//in case the keyword was not found yet
				//check the rest of the string
				psn = phrase.indexOf(key,psn+1);
			}
			return -1;
		}
		//helper method a method that contributes functionality to another method.
		//Helper method are very common when you need to do the same thing repeatedly. 
		//They also help to make methods more readable. This method is private because 
		//it is only need by the method it is helping. 
		private static boolean noNegations(String phrase, int index)
		{
			//check for word "NO " (3 characters)
			// check to see if there is space for the word
			//"NO " to be in front of the index
			if(index - 3>=0 && phrase.substring(index-3,index).equals("no "))
			{
				return false;
			}
			//check for "not "
			if(index - 4>=0 && phrase.substring(index-4,index).equals("not "))
			{
				return false;
			}
			//check for "never "
			if(index - 6>=0 && phrase.substring(index-6,index).equals("never "))
			{
				return false;
			}
			//check for n't
			if(index - 4>=0 && phrase.substring(index-4,index).equals("n't "))
			{
				return false;
			}
			return true;
		}
		
		public static void promptInput()
		{
			print(user + ",Try putting in a string");
			String userInput = input.nextLine();
			print("you typed: "+userInput);
		}
		public static String getInput()
		{
			return input.nextLine();
		}
		public static void print (String s)
		{
			//create a multi-line string
			String printString = "";
			int cutoff = 35;
			//check to see if there are words to add
			//In the other word is the length of s greater than 0
			while(s.length()>0)
			{
				String currentLine="";
				String nextWord ="";
				//while the current line and next word are 
				//less than the cut off AND there are still words to add 
				//do the following loop
				while (currentLine.length()+nextWord.length()<=cutoff && s.length()>0)
				{
					// add the next word to the line
					currentLine += nextWord;
					//remove that word
					s = s.substring(nextWord.length());
					int endOfWord = s.indexOf(" ");
					if (endOfWord == -1)
					{
						endOfWord = s.length() -1;
					}
					// get the next word and space
					nextWord = s.substring(0,  endOfWord+1);
				}
				printString += currentLine + "\n";
			}
				
			
			System.out.println(printString);

		}
		public static void createTopic()
		{
			input = new Scanner (System.in);
			school = new School();
			like = new Like();
			hello = new kristyHello(); 
			
		}

}
