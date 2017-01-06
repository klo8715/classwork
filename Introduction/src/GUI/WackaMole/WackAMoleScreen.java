package GUI.WackaMole;

import java.util.ArrayList;
import java.util.List;

import GUI.Components.Action;

import GUI.ClickableScreen;
import GUI.Components.TextLabel;
import GUI.Components.Visible;

public class WackAMoleScreen extends ClickableScreen implements Runnable{

	private ArrayList<MoleInterface> moles;
	private PlayerInterface player;
	private TextLabel label;
	private TextLabel timeLabel;
	private double timeLeft;
	
	public WackAMoleScreen(int width, int height) {
			super(width, height);
			timeLeft = 30.0;
			// when making simon, creating a thread like this is necessary since simon screen changes
			Thread play = new Thread(this);
			play.start();
	}
	@Override
		public void initAllObjects(List<Visible> viewObjects) {
			moles = new ArrayList<MoleInterface>();
			player = getPlayer();
			label = new TextLabel(350,220,100,40,"Sample Text");
			timeLabel= new TextLabel(360,40,80,40,"30.0");
			viewObjects.add(player);
			viewObjects.add(timeLabel);
			viewObjects.add(label);

			
		}
	/**
	 * This method is a placeholder until our "partner"
	 * finishes the design of Players. For the time being,
	 * it returns "null". This means our code won't work until
	 * our partner is done, BUT at least our code will compile
	 * 
	 * DON'T FORGET TO CHANGE THIS ONCE YOUR PARTNER IS DONE!
	 * @return a PlayerInterface for the Screen
	 */
	public PlayerInterface getPlayer()
	{
		return new Player();
	}
	public MoleInterface getMole()
	{
		return new Mole ((int)(Math.random()*getWidth()) ,(int)(Math.random()*getHeight()));
	}
	public void run()
	{
		changeText("Ready...");
		changeText("Set...");
		changeText("Go");
		//since this is a timed game, we will use a while 
		//loop. This is not necessary for games that 
		//aren't timed
		while (timeLeft>0)
		{
			updateTimer();
			updateAllMoles();
			appearNewMole();
		}
		
	}
	private void appearNewMole() {
		double chance = .1*(60-timeLeft)/60; // more frequently or less requently
		if(Math.random() < chance){
			//create a mole
			final MoleInterface mole = getMole();
			mole.setAppearanceTime(
					(int)(500+Math.random()*2000));
			//tell the mole what to do when clicked
			mole.setAction(new Action(){
				public void act(){
					
					
					player.increaseScore(1);
					remove(mole);
					moles.remove(mole);
				}
			});
			addObject(mole);
			moles.add(mole);
		}
	}
	private void updateAllMoles() {
		for(int i = 0; i < moles.size(); i++){
			MoleInterface m = moles.get(i);
			int screenTime = (int)(m.getAppearanceTime()-100);
			m.setAppearanceTime(screenTime);
			if(m.getAppearanceTime() <=0){
				remove(m);//remove from screen
				moles.remove(m);
				i--;//compensate for removal
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
	//use this in simon
	public void changeText(String string)
	{
		label.setText(string);
		try{
			Thread.sleep(1000);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
