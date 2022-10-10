package main;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
//import java.awt.Color;
import java.awt.Dimension;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import inputs.KeyboardInputs;
import inputs.MouseInputs;

import static utils.Constants.PlayerConstants.*;
import static utils.Constants.Directions.*;

public class GamePanel extends JPanel {
	
	private MouseInputs mouseInputs;
	
	
	public GamePanel() {
		
		mouseInputs = new MouseInputs(this);
		
		
		setPanelSize();
		addKeyListener(new KeyboardInputs(this));
		addMouseListener(mouseInputs);
		addMouseMotionListener(mouseInputs);
		
		
	}
	
	

	private void setPanelSize() {
		Dimension size = new Dimension(1280, 800);
		setMinimumSize(size);
		setPreferredSize(size);
		
	}

    
    public void updateGame() {
    	
		
    }

	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//g.setColor(Color.decode("#B4392B"));
		
		
		
	}

	
	

	
	
}
