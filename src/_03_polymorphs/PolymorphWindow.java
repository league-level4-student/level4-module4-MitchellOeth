package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener {
    protected static int WIDTH = 900;
    protected static int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    
    ArrayList<Polymorph> polyList = new ArrayList<Polymorph>();

    /*   
    Polymorph bluePoly;
    Polymorph redPoly;
    Polymorph movingPoly;
    */    
    
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public int getWidth() {
    		return WIDTH;
    }
    
    public void setWidth(int width) {
    		WIDTH = width;
    		if (WIDTH <= 0) {
    			WIDTH = 1;
    		}
    }
    
    public int getHeight() {
    		return HEIGHT;
    }
    
    public void setHeight(int height) {
    		HEIGHT = height;
    		if (HEIGHT <= 0) {
    			HEIGHT = 1;
    		}
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 
   	 polyList.add(new BluePolymorph(0, 0));
   	 polyList.add(new RedPolymorph(50, 0));
   	 polyList.add(new MovingPolymorph(0, 50));
   	 polyList.add(new CirclePolymorph(250, 250));
   	 polyList.add(new MousePolymorph(0, 0));

   	 /*   	 
   	 bluePoly = new BluePolymorph(50, 50);
   	 redPoly = new RedPolymorph(50, 50);
   	 movingPoly = new MovingPolymorph(50, 50);
   	 */   	 
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	
   	 //draw polymorph
   	for (int i = 0; i < polyList.size(); i++) {
		polyList.get(i).draw(g);
	}
   	/*
   	bluePoly.draw(g);
   	redPoly.draw(g);
   	movingPoly.draw(g);
   	*/   	 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 	repaint();
   	 	
   	 	//update polymorph
   	 	for (int i = 0; i < polyList.size(); i++) {
		polyList.get(i).update();
   	 	}

	}
   	/*
   	bluePoly.update();
   	redPoly.update();
   	movingPoly.update();
   	*/   	 
}
