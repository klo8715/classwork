package GUI.Screens;



import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;


import GUI.Screen;
import GUI.Components.Button;
import GUI.Components.Action;
import GUI.Components.TextLabel;
import GUI.Components.TextArea;
import GUI.Components.Visible;
import GUI.Components.Graphics;

public class CoordinateScreen extends Screen 
               implements MouseMotionListener{

	
	//FIELD
	private Button button;
	private TextLabel text;
	private TextArea area;
	private Graphics link;
	public CoordinateScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		button = new Button(20,100,80,40,
				"The Button with a long name",new Color(100,100,250),
				new Action() {
			
			public void act() {
				// TODO Auto-generated method stub
				
			}
		});
		viewObjects.add(button);
		text = 
				new TextLabel(20, 200, 500, 40, "Some text");
		
		viewObjects.add(text);
			area= new TextArea (20,200,500,40, "this is really long test. its prints over");
			viewObjects.add(area);
			
			link = new Graphics(10,20, "resources/sampleImages/toon_link.jpg");
			viewObjects.add(link);
			
	}

	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseMoved(MouseEvent e) {
		int mx = e.getX();//get mouse X coordinate
		int my = e. getY();//get Y coord
		text.setText("Mouse at: "+mx +", "+my);
	}

	public MouseMotionListener getMouseMotionListener(){ 
		return this;
	}
	
	
	
	
	
	
	
	
	
	
	
}
