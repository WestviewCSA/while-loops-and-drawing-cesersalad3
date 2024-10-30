import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Runner extends JPanel{
	
	// Practice using Loops, random #s and 
	// methods
	public void paint(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(1));
        
		 
//		 
//		 for (int i = 0; i <= 1000; i+=25) {
//			 g2.drawLine(i,0,0,650-i);  //right side
//			 g2.drawLine(0, i, i, 650);
//			 g2.drawLine(i, 0, 1000, i);
//			 g2.drawLine(i, 650, 1000, 650-i);
//			 
//			 g2.drawLine(1000-i, 0, 0, i);//left side
//			 g2.drawLine(1000, i, 1000-i, 650);
//			 g2.drawLine(1000, 650-i, 1000-i, 0);
//			 g2.drawLine(1000-i, 650, 0, 650-i);
//			 
//			 
//		 }
		 
		 for (int i = 0; i <= 650; i+=25) {
			 
			 g2.drawLine(0, i, i, 650);// top left side
			 
			 g2.drawLine(0, 650-i, i, 0);//bottom left side
			 
			 g2.drawLine(1000, i, 1000-i, 650);//top right 
			 
			 g2.drawLine(1000, 650-i, 1000-i, 0);//bottom right
		 }
	
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] arg) {
		Runner m = new Runner();
	}
	
	public Runner() {
		JFrame f = new JFrame("Method Use");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(800,600);
		f.add(this);
		f.setVisible(true);
		
	}
}
