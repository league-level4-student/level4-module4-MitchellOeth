package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingPolymorph extends Polymorph{

	MovingPolymorph(int x, int y) {
		super(x, y);
	}

	public void update() {
		if (x < PolymorphWindow.WIDTH) {
			x++;
		} if (x > PolymorphWindow.WIDTH) {
			x--;
		}
	}
	
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(x, y, 50, 50);
	}
	
}
