package chatBox;


	import java.util.Scanner;

	public class KristyLo
	{
	
		static Scanner input;
		static String user;
		static boolean inLoop;
		static String response;
		static Topic school;

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
			print("bye");
		}
		public static void talkForever()
		{
			inLoop = true;
			while(true)
			{
				print("Greetings, "+user +"How are you?");
				response = getInput();
				if (response.indexOf("good") >=0)
				{
					print("I'm so happy you're good.");
				}
				else if(response.indexOf("school") >= 0)
				{
					inLoop = false;// wait this Loop
					school.talk();
				}
				else
				{
					print("I'm sorry, I don't understand you.");
				}
				
			}
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
			
		}

}
