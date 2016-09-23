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
}
