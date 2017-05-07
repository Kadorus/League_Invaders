import java.awt.Color;
import java.awt.Graphics;

public class Projectile extends GameObject{
	int speed;
	Projectile(int x1, int y1, int width1, int height1){
		speed = 10;
		x = x1;
		y = y1;
		width = width1;
		height = height1;
	}
	
	public void update(){
		y-=speed;
		if(y<0){
			isAlive = false;
		}
	}
	
	public void draw(Graphics g){
		g.setColor(Color.RED);
		g.fillRect(x, y, 2, 2);
	}
}
