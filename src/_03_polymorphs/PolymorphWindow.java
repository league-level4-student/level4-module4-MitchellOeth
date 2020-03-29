package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.event.MouseInputListener;

public class PolymorphWindow extends JPanel implements ActionListener, MouseInputListener{
    protected static int WIDTH = 900;
    protected static int HEIGHT = 600;
    static int mouseX;
    static int mouseY;
    
    public static Image Glob;
    PolymorphWindow() {
    		try {
    			Glob = ImageIO.read(this.getClass().getResourceAsStream("L4M4_Polymorph_1.png"));
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    }
    private JFrame window;
    private Timer timer;
    ActionListener action;
    
    static ArrayList<Polymorph> polyList = new ArrayList<Polymorph>();

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
   	 window.addMouseMotionListener(this); 
   	 window.addMouseListener(this);
   	 window.pack();
   	 window.setVisible(true);
   	
   	 
   	 polyList.add(new BluePolymorph(0, 0));
   	 polyList.add(new RedPolymorph(50, 0));
   	 polyList.add(new MovingPolymorph(0, 50));
   	 polyList.add(new CirclePolymorph(250, 250));
   	 polyList.add(new MousePolymorph(0, 0));
   	 polyList.add(new ImagePolymorph(0, 240));
   	 polyList.add(new JOptionPanePolymorph(100, 0));

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

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		mouseX = e.getX();
		mouseY = e.getY();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("runs");
		if ((e.getX() > polyList.get(6).getX()) && (e.getX() < (polyList.get(6).getX() + 50)) && (e.getY() > polyList.get(6).getY()) && (e.getY() < polyList.get(6).getY() + 50)) {
			JOptionPane.showMessageDialog(null, "Glob is the best");
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}   	 
}
