package questao01;
import javax.swing.JFrame;
import questao01.Painel;

public class Principal {
    public static void main(String[] args){
        JFrame janela  = new JFrame();
        janela.setTitle("Aopa rapaziada!");// titutlo da tela
        janela.setSize(400, 400);// definir tamanho da tela
        janela.setResizable(false); // para definir se a tela poderá ser redimensionada ou não
        
        Painel painel = new Painel();
        janela.add(painel);
        janela.pack();
        janela.setLocationRelativeTo(null);
        

        janela.setVisible(true);// deixar a tela visivel
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // para fazer a execução ser terminada quando a janela fechar
    }
}
