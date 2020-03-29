package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class JOptionPanePolymorph extends Polymorph {

	JOptionPanePolymorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.yellow);
		g.fillRect(x, y, 50, 50);
	}

}
