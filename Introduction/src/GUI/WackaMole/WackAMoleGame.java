package GUI.WackaMole;

import GUI.GUIApplication;

public class WackAMoleGame extends GUIApplication {

	public WackAMoleGame(int width, int height) {
		super(width, height);
	}

	@Override
	public void initScreen() {
		WackAMoleScreen wams = new WackAMoleScreen(getWidth(), getHeight());
		setScreen(wams);
				
	}

	public static void main(String[] args) {
		WackAMoleGame game = new WackAMoleGame(600, 500);
		Thread app = new Thread(game);
		app.start();
	}

}
