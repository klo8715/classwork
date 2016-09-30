package chatBox;

public class kristyHello implements Topic 
{
	private boolean inHelloLoop;
	private String helloResponse;
	private int helloCount;
	private static String[] calmResponses = {"We have already said our hellos. Remember?", "Yes, hello to you too, let's actually talk"};
	private static String[] angryResponses = {"okay, seriously. This has to stop","You are beginning to annoy me."+"WE'VE SAID HELLO"};
	
	public void KristyHello()
	{
		helloCount = 0;
	}
	public void talk()
	{
		inHelloLoop = true;
		while(inHelloLoop)
		{
			helloCount++;
			printResponse();
			helloResponse = KristyLo.getInput();
			if (isTriggered(helloResponse))
			{
				inHelloLoop = false;
				KristyLo.talkForever();
			}
			
		}
	}
	public void printResponse()
	{
		int responseIndex = 0;
		if (helloCount<5)
		{
			responseIndex = (int)(Math.random()*calmResponses.length);
			KristyLo.print(calmResponses[responseIndex]);
			
		}
		else
		{
			responseIndex = (int)(Math.random()*angryResponses.length);
			KristyLo.print(angryResponses[responseIndex]);
		}
	}
	public boolean isTriggered (String userInput)
	{

		if (KristyLo.findKeyword(userInput, "hi", 0)>=0)
		{
			return true;
		}
		if (KristyLo.findKeyword(userInput, "hello", 0)>=0)
		{
			return true;
		}
		return false;
	}
}
