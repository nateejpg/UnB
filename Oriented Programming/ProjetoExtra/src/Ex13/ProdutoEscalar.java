package Ex13;

import javax.swing.JOptionPane;

public class ProdutoEscalar {
    public static void main(String[] args) {
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho dos vetores:"));

        // Inserir elementos no primeiro vetor
        double[] vetor1 = new double[tamanho];
        JOptionPane.showMessageDialog(null, "Digite os elementos do primeiro vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor1[i] = Double.parseDouble(JOptionPane.showInputDialog("Elemento " + (i + 1) + ":"));
        }

        // Inserir elementos no segundo vetor
        double[] vetor2 = new double[tamanho];
        JOptionPane.showMessageDialog(null, "Digite os elementos do segundo vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor2[i] = Double.parseDouble(JOptionPane.showInputDialog("Elemento " + (i + 1) + ":"));
        }

        // Calcular o produto escalar
        double produtoEscalar = 0;
        for (int i = 0; i < tamanho; i++) {
            produtoEscalar += vetor1[i] * vetor2[i];
        }

        // Exibir o resultado
        JOptionPane.showMessageDialog(null, "O produto escalar dos vetores é: " + produtoEscalar);
    }
}
