package GUI.WackaMole;

import java.util.List;

import GUI.Components.Action;
import GUI.Components.Clickable;
import GUI.Components.ClickableGraphics;
import GUI.Components.Visible;

public interface MoleInterface extends Clickable{
	public double getAppearanceTime();
	public void setAppearanceTime(int ScreenTime);
	public void setAction(Action action);
	

}
