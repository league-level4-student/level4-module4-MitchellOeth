package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CirclePolymorph extends Polymorph {

	CirclePolymorph(int x, int y) {
		super(x, y);
	}
	double deg = 0;
	public void update() {
		x = (int) (50*Math.cos(deg));
		y = (int) (50*Math.sin(deg));
		
		deg += .1;
		if (deg > 360) {
			deg = 1;
		}		
	}
	
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(x + 50, y + 150, 50, 50);
	}

}
