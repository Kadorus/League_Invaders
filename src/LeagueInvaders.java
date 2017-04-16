import javax.swing.JFrame;

public class LeagueInvaders {
	
	JFrame frame1;
	public static final int frame1Width = 500;
	public static final int frame1Height = 800;
	GamePanel gamePanel1 = new GamePanel();
	
	public static void main(String args[]){
		LeagueInvaders leagueInvaders = new LeagueInvaders();
	}
	
	LeagueInvaders(){
		frame1 = new JFrame();
		setup();
	}
	
	public void setup(){
		frame1.add(gamePanel1);
		frame1.addKeyListener(gamePanel1);
		frame1.setVisible(true);
		frame1.setSize(frame1Width, frame1Height);
		gamePanel1.startGame();
	}
}
