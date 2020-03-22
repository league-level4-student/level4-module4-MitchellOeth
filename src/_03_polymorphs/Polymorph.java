package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    protected int x;
    protected int y;
    
    Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
    }
    
    public int getX() {
    		return x;
    }
    
    public void setX(int x) {
    		this.x = x;
    		if (x < 0) {
    			x = 0;
    		}
    }
    
    public int getY() {
    		return y;
    }
    
    public void setY(int y) {
    		this.y = y;
    		if (y < 0) {
    			y = 0;
    		}
    }
    
    public void update() {
    	
    }
    
    public abstract void draw(Graphics g);
}
