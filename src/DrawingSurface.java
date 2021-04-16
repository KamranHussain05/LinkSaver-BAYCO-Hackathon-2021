import java.awt.event.KeyEvent;

import processing.core.PApplet;
import processing.event.MouseEvent;

public class DrawingSurface extends PApplet {
	
	private String s;
	
	public void setup() {
		s = "test";
	}
	public void draw() { 
		background(255);   // Clear the screen with a white background
		
		textSize(12);
		fill(0);
		text(s,width/2,height/2);
	}
	public void keyPressed()
	{
		if(key != ENTER)
		{
			System.out.println(key);
			s += key;
		}
	}
	
}
