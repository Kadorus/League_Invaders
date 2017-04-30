import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener{
	
	
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
	
	Font titleFont;
	Font font2;
	Font font3;
	
	Timer timer1;
	

	GamePanel(){
		timer1 = new Timer(1000/60,this);
		titleFont = new Font("Arial", Font.PLAIN, 48);
		font2 = new Font("Arial", Font.PLAIN, 24);
		font3 = new Font("Arial", Font.PLAIN, 16);
	}
	
	public void updateMenuState(){
		
	}
	
	public void updateGameState(){
		
	}

	public void updateEndState(){
	
	}
	
	public void drawMenuState(Graphics g){
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, LeagueInvaders.frame1Width, LeagueInvaders.frame1Height);   
		g.setFont(titleFont);
		g.setColor(Color.GRAY);
		g.drawString("best game NA lul", 100, 125);
		g.drawString("robbie yingling", 29, 540);
	}
	
	public void drawGameState(Graphics g){
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, LeagueInvaders.frame1Width, LeagueInvaders.frame1Height);
	}

	public void drawEndState(Graphics g){
		Random random = new Random();
		g.setColor(Color.RED);
		g.fillRect(0, 0, LeagueInvaders.frame1Width, LeagueInvaders.frame1Height);
		g.setFont(titleFont);
		g.setColor(Color.GREEN);
		g.drawString("u lose", random.nextInt(500), random.nextInt(800));
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
		if(currentState == MENU_STATE){
			updateMenuState();
		}else if(currentState == GAME_STATE){
			updateGameState();
		}else if(currentState == END_STATE){
			updateEndState();
		}
	}
	
	public void startGame(){
		timer1.start();
		
	}
	
	public void paintComponent(Graphics g){
		if(currentState == MENU_STATE){
			drawMenuState(g);
		}else if(currentState == GAME_STATE){
			drawGameState(g);
		}else if(currentState == END_STATE){
			drawEndState(g);
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_ENTER){
			if(currentState == END_STATE){
				currentState = MENU_STATE;
			}
			else if(currentState == MENU_STATE){
				currentState = GAME_STATE;
			}
			else if(currentState == GAME_STATE){
				currentState = END_STATE;
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
