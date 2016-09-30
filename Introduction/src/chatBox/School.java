package chatBox;

public class School implements Topic {
	private boolean inSchoolLoop;
	private String schoolsResponse;
	
	public void talk()
	{
		inSchoolLoop = true;
		while(inSchoolLoop)
		{
			KristyLo.print("Tell me about School");
			schoolsResponse = KristyLo.getInput();
			if(schoolsResponse.indexOf("stop")>=0)
			{
				inSchoolLoop = false;
				KristyLo.talkForever();
			}
			KristyLo.print("That's my favorite " + "part about school too");
		}
	}
	public boolean isTriggered (String userInput)
	{

		if (KristyLo.findKeyword(userInput, "school", 0)>=0)
		{
			return true;
		}
		if (KristyLo.findKeyword(userInput, "class", 0)>=0)
		{
			return true;
		}
		return false;
	}


}
