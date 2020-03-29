package _03_polymorphs;

import java.awt.Graphics;

public class ImagePolymorph extends Polymorph {

	ImagePolymorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.drawImage(PolymorphWindow.Glob, x, y, 220, 270, null);
	}

}
