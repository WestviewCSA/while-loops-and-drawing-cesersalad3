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
        g2.setStroke(new BasicStroke(5));
        
		 
		//1) draw a concentric rectangle that's 10pixels from all sides of the "gray"
		//portion of the GUI
		g2.drawRect(10, 10, 765, 540);
		
		
		//2) Draw a horizontal line to bisect the Rectangle
		g2.drawLine(10, 270, 770, 270);
		
		
		//3) Draw a vertical line to bisect the shape again
		g2.drawLine(765/2, 10, 765/2,550 );
		
		
		//4) small rectangles on top-left
		//g2.drawLine(765/4, 10, 765/4, 550/2-10);
		int var =  1;
		while (var<=100){

			int red = (int)(Math.random()*255); //generate a random red value
		    int gre = (int)(Math.random()*255);
		    int blu = (int)(Math.random()*255);

		    Color newColor = new Color(red, gre, blu);
		    g2.setColor(newColor);

			g2.setStroke(new BasicStroke(1));
			
			g2.drawLine((int)(Math.random()*((765/2)-15+1))+15, (int)(Math.random()*(270-10+1))+10, (int)(Math.random()*((765/2)-15+1))+15, (int)(Math.random()*(270-10+1))+10);
			
			g2.fillRect((int)(Math.random()*(765-(756/2)-50+1))+765/2, (int)(Math.random()*(270-10-50+1))+10, 50, 50);
			
			int ovalSize = (int)(Math.random()*(200-10+1))+10;
			g2.drawOval((int)(Math.random()*((756/2)-ovalSize-10+1))+10, (int) (Math.random()*(540-ovalSize-270+1))+270, ovalSize, ovalSize);
			
			var++;
		}

		for (int i = 0; i <= 650; i+=25) {
			 
			 g2.drawLine(0, i, i, 650);// top left side
			 
			 g2.drawLine(0, 650-i, i, 0);//bottom left side
			 
			
		 }
		 
		 int i2 = 0;
		 
		 while (i<=650) {
			 
			  g2.drawLine(1000, i, 1000-i, 650);//top right 
			 
			 g2.drawLine(1000, 650-i, 1000-i, 0);//bottom right
			 
		 }



		/* 
		 * int var = 0; 						<---- control variable
		 * while(var < 10){ 					<---- condition to run the loop
		 *   
		 *   //any repeating code
		 *   
		 *   var++;								<---- update control variable
		 *   
		 * }
		 */
		
		 

	
	
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
