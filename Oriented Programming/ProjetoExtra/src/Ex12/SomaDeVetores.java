package Ex12;

import javax.swing.JOptionPane;

public class SomaDeVetores {
    public static void main(String[] args) {
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho dos vetores:"));

        // Inserir elementos no primeiro vetor
        int[] vetor1 = new int[tamanho];
        JOptionPane.showMessageDialog(null, "Digite os elementos do primeiro vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor1[i] = Integer.parseInt(JOptionPane.showInputDialog("Elemento " + (i + 1) + ":"));
        }

        // Inserir elementos no segundo vetor
        int[] vetor2 = new int[tamanho];
        JOptionPane.showMessageDialog(null, "Digite os elementos do segundo vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor2[i] = Integer.parseInt(JOptionPane.showInputDialog("Elemento " + (i + 1) + ":"));
        }

        // Calcular a soma dos vetores
        int[] vetorSoma = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetorSoma[i] = vetor1[i] + vetor2[i];
        }

        // Exibir o vetor resultante
        JOptionPane.showMessageDialog(null, "A soma dos vetores é: " + java.util.Arrays.toString(vetorSoma));
    }
}
