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
		case KeyEvent.VK_A:
		case KeyEvent.VK_S:
		case KeyEvent.VK_D:
			gamePanel.setMoving(false);
		
			break;
			
		}
		
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		
		switch(e.getKeyCode()) {
		case KeyEvent.VK_W:
			gamePanel.setDirection(UP);
			break;
		case KeyEvent.VK_A:
			gamePanel.setDirection(LEFT);
			break;
		case KeyEvent.VK_S:
			gamePanel.setDirection(DOWN);
			break;
		case KeyEvent.VK_D:
			gamePanel.setDirection(RIGHT);
			break;
			
		}
		
	}
}
