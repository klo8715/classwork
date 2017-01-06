package GUI.WackaMole;

import GUI.Components.ClickableGraphics;

public class Mole extends ClickableGraphics implements MoleInterface {

	private int appearanceTime;
	public Mole(int x, int y) {
		super(x, y, .9, "resources/sampleImages/mole.jpg");
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getAppearanceTime() {
		// TODO Auto-generated method stub
		return appearanceTime;
	}

	@Override
	public void setAppearanceTime(int ScreenTime) {
		appearanceTime = ScreenTime;
		
	}

}
