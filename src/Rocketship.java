import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject{

	Rocketship(int x1, int y1, int width1, int height1){
		x = x1;
		y = y1;
		width = width1;
		height = height1;
	}
	
	public void update(){
		
	}
	
	public void draw(Graphics g){
		g.setColor(Color.BLUE);
		g.fillRect(x, y, width, height);
	}
}
