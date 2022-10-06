package questao01;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Painel extends JPanel {

    public Painel() {
        this.setPreferredSize(new Dimension(500, 500)); 
        this.setBackground(Color.blue);
        
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        Quadrado forma = new Quadrado(new Ponto2D(150, 150), Color.decode("#070707"), 50);


        //g2d.setColor(Color.ORANGE);
        //g2d.fillOval(100, 100, 70, 70);
        g2d.setColor(forma.getCorDeFundo()); // passar cor hexadecimal
        g2d.fillRect(forma.getX(), forma.getY(), forma.getLado(), forma.getLado());

    }

}
