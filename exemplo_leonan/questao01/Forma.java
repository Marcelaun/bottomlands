package questao01;
import java.awt.Color;

public class Forma {
    private Ponto2D posicao;
    private Color cor;

    public Forma (Ponto2D posicao, Color corDeFundo) {
        this.posicao = posicao;
        this.cor = corDeFundo;

    }

    public Ponto2D getPosicao() {
        return posicao;
    }
    
    public Color getCorDeFundo() {
        return cor;
    }

    public int getX() {
        return posicao.getX();
    }

    public int getY() {
        return posicao.getY();
    }
    
}
