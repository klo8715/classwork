package chatBox;

public class Like implements Topic  
{
	private boolean inLikeLoop;
	private String likeResponse;
	
	public void talk() 
	{
		KristyLo.print("What are some things you like?");
		inLikeLoop = true;
		while(inLikeLoop)
		{
			likeResponse = KristyLo.getInput();
			int likePsn = KristyLo.findKeyword(likeResponse,"like",0);
			if (likePsn >=0)
			{
				String thingsLiked = likeResponse.substring(likePsn +5);
				KristyLo.print("you are such an interesting person because you like " +thingsLiked);
				
				if(KristyLo.findKeyword (thingsLiked, "school", 0)>= 0)
				{
					inLikeLoop = false;
					KristyLo.school.talk();
				}
				else
				{
					inLikeLoop = false;
					KristyLo.talkForever();
				}
			}
			else
			{
				KristyLo.print("I don't understand you.");
			}
		}
		
	}
	public boolean isTriggered (String userInput)
	{

		if (KristyLo.findKeyword(userInput, "like", 0)>=0)
		{
			return true;
		}
		return false;
	}

}
