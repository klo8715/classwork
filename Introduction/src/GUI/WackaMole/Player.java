package GUI.WackaMole;

import java.awt.Color;
import java.awt.Graphics2D;

import GUI.Components.Components;

public class Player extends Components implements PlayerInterface{

private int score;
	
	public Player() {
		super(20, 20, 100, 100);
		score = 0;
	}
	public void increaseScore(int i) {
		score += i;
		update();
	}

	@Override
	public void update(Graphics2D g) {
		g.setColor(new Color(200,220,255));
		g.fillOval(0, 0, 99, 99);
		g.setColor(Color.black);
		g.drawOval(0, 0, 99, 99);
		g.drawString("Score = "+score, 40, 55);
	}

	

}
