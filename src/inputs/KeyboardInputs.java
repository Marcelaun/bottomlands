package inputs;
import java.awt.event.KeyEvent;
import static utils.Constants.Directions.*;
import java.awt.event.KeyListener;

import main.GamePanel;



public class KeyboardInputs implements KeyListener {
	
	private GamePanel gamePanel;
	
	public KeyboardInputs(GamePanel gamePanel) {
		this.gamePanel = gamePanel;
	}
	// a diferenca entre extends e implements é que você extende uma classe e implementa uma interface,
	// e você só pode extender uma classe mas implementar mais de uma interface.
	// uma interface é quase uma classe, mas tem muitos métodos, e não muito "código" nela.
	// fazemos isso para ter certeza q pegaremos todo sos metodos necessários para o funcionamento da função q queremos implementar,
	// nesse caso ler inputs de teclado
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		switch(e.getKeyCode()) {
		case KeyEvent.VK_W:
			gamePanel.getGame().getPlayer().setUp(false);
			break;
		case KeyEvent.VK_A:
			gamePanel.getGame().getPlayer().setLeft(false);
			break;
		case KeyEvent.VK_S:
			gamePanel.getGame().getPlayer().setDown(false);
			break;
		case KeyEvent.VK_D:
			gamePanel.getGame().getPlayer().setRight(false);
			break;
		case KeyEvent.VK_J:
			gamePanel.getGame().getPlayer().setAttacking(false);
			break;
			
		}
		
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		
		switch(e.getKeyCode()) {
		case KeyEvent.VK_W:
			gamePanel.getGame().getPlayer().setUp(true);
			break;
		case KeyEvent.VK_A:
			gamePanel.getGame().getPlayer().setLeft(true);
			break;
		case KeyEvent.VK_S:
			gamePanel.getGame().getPlayer().setDown(true);
			break;
		case KeyEvent.VK_D:
			gamePanel.getGame().getPlayer().setRight(true);
			break;
		case KeyEvent.VK_J:
			gamePanel.getGame().getPlayer().setAttacking(true);
			break;
			
		}
		
	}
}
