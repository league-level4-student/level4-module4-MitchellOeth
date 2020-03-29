package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MousePolymorph extends Polymorph {

	MousePolymorph(int x, int y) {
		super(x, y);
	}

	int mouseX;
	int mouseY;
	
	public void update() {
		x = PolymorphWindow.mouseX - 25;
		y = PolymorphWindow.mouseY - 50;
	}
	
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(x, y, 50, 50);
	}
}
