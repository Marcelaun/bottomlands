package inputs;
import java.awt.event.KeyEvent;
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
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		
		switch(e.getKeyCode()) {
		case KeyEvent.VK_W:
			gamePanel.changeYDelta(-5);
			break;
		case KeyEvent.VK_A:
			gamePanel.changeXDelta(-5);
			break;
		case KeyEvent.VK_S:
			gamePanel.changeYDelta(5);
			break;
		case KeyEvent.VK_D:
			gamePanel.changeXDelta(5);
			break;
			
		}
		
	}
}
