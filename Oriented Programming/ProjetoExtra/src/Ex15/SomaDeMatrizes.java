package Ex15;

import javax.swing.JOptionPane;

public class SomaDeMatrizes {
    public static void main(String[] args) {
        int linhas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de linhas:"));
        int colunas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de colunas:"));

        // Inserir elementos na primeira matriz
        int[][] matriz1 = new int[linhas][colunas];
        JOptionPane.showMessageDialog(null, "Digite os elementos da primeira matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz1[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Elemento [" + i + "][" + j + "]:"));
            }
        }

        // Inserir elementos na segunda matriz
        int[][] matriz2 = new int[linhas][colunas];
        JOptionPane.showMessageDialog(null, "Digite os elementos da segunda matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz2[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Elemento [" + i + "][" + j + "]:"));
            }
        }

        // Calcular a soma das matrizes
        int[][] matrizSoma = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matrizSoma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        // Exibir a matriz resultante
        StringBuilder resultado = new StringBuilder("A soma das matrizes é:\n");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                resultado.append(matrizSoma[i][j]).append(" ");
            }
            resultado.append("\n");
        }
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
