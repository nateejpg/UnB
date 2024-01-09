package Ex18;
import javax.swing.JOptionPane;


public class TrocaDeValores {
    public static void main(String[] args) {
        // Criar objetos Ponto com input do usuário
        Ponto ponto1 = criarPontoComInput();
        Ponto ponto2 = criarPontoComInput();

        // Exibir valores antes da troca
        JOptionPane.showMessageDialog(null, "Valores antes da troca:\nPonto 1: (" + ponto1.x + ", " + ponto1.y + ")\nPonto 2: (" + ponto2.x + ", " + ponto2.y + ")");

        // Trocar valores entre os objetos
        trocarValores(ponto1, ponto2);

        // Exibir valores após a troca
        JOptionPane.showMessageDialog(null, "Valores após a troca:\nPonto 1: (" + ponto1.x + ", " + ponto1.y + ")\nPonto 2: (" + ponto2.x + ", " + ponto2.y + ")");
    }

    static Ponto criarPontoComInput() {
        int x = Integer.parseInt(JOptionPane.showInputDialog("Digite a coordenada x do ponto:"));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Digite a coordenada y do ponto:"));
        return new Ponto(x, y);
    }

    static void trocarValores(Ponto pontoA, Ponto pontoB) {
        // Trocar os valores dos objetos
        int tempX = pontoA.x;
        int tempY = pontoA.y;
        pontoA.x = pontoB.x;
        pontoA.y = pontoB.y;
        pontoB.x = tempX;
        pontoB.y = tempY;
    }
}