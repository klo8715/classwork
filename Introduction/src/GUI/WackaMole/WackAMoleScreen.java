package GUI.WackaMole;

import java.util.ArrayList;
import java.util.List;

import GUI.ClickableScreen;
import GUI.Components.TextLabel;
import GUI.Components.Visible;

public class WackAMoleScreen extends ClickableScreen{

	private ArrayList<MoleInterface> moles;
	private PlayerInterface player;
	private TextLabel label;
	private TextLabel timeLabel;
	private double timeLeft;
	
	public WackAMoleScreen(int width, int height) {
			super(width, height);
			timeLeft = 30.0;
			Thread play = new Thread();
			play.start();
	}
	@Override
		public void initAllObjects(List<Visible> viewObjects) {
			moles = new ArrayList<MoleInterface>();
			player = getPlayer();
			label = new TextLabel(350,220,100,40,"");
			timeLabel= new TextLabel(360,40,80,40,"30.0");
			//viewObjects.add(player);
			viewObjects.add(timeLabel);
			viewObjects.add(label);

			
		}
		
	public PlayerInterface getPlayer()
	{
		return null;
	}
	public MoleInterface getMole()
	{
		return null;
	}
	public void run()
	{
		changeText("Ready...");
		changeText("Set...");
		changeText("Go");
		while (timeLeft>0)
		{
			updateTimer();
			updateAllMoles();
//			appearNewMole();
		}
		
	}
	private void appearNewMole() {
		double chance = .2*(60-timeLeft)/60;
		if (Math.random()< chance)
		{
			MoleInterface mole = getMole();
			mole.setAppearanceTime((int)(500+ Math.random()*2000));
			mole.setAction(new Action()){
				public void act()
				{
					player.increaseScore();
					remove(mole);
					moles.remove(moles);
					
				}}
		}
		addObject(getMole());
		moles.add(getMole());
		
	}
	private void updateAllMoles() {
		for(int i = 0; i< moles.size(); i++)
		{
			MoleInterface m = moles.get(i);
			int screenTime = m.getAppearanceTime() -100;
			m.setAppearanceTime(screenTime);
			if(m.setAppearanceTime()<=0)
			{
				remove(m);//remove from screen
				moles.remove(m);
				i--; //remove from removal
			}
		}
	}
	private void updateTimer() {
		
		try{
			Thread.sleep(100);
		}catch(Exception e){
			e.printStackTrace();
		}
		timeLeft-=.1;
		//.1 is not a clean number for binary
		// use this formula to round it to the nearest 10
		timeLabel.setText(""+(int)(timeLeft*10)/10.0);
	}
	public void changeText(String string)
	{
		try{
			Thread.sleep(1000);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
