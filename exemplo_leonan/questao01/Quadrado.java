package questao01;
import java.awt.Color;

public class Quadrado extends Forma {
    private int lado;

    public Quadrado(Ponto2D posicao, Color cor, int lado) {
        super(posicao, cor);
        this.lado = lado;

    }

    public int getLado() {
        return lado;
    }
    
}
