package Ex12;
import javax.swing.JOptionPane;

public class TabelaMultiplicacao {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para a tabela de multiplicação:"));

        // Exibir a tabela de multiplicação usando for
        StringBuilder tabelaMultiplicacao = new StringBuilder("Tabela de multiplicação para " + numero + ":\n");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            tabelaMultiplicacao.append(i).append(" x ").append(numero).append(" = ").append(resultado).append("\n");
        }

        // Exibir a tabela usando JOptionPane
        JOptionPane.showMessageDialog(null, tabelaMultiplicacao.toString());
    }
}
