package Ex17;

import javax.swing.JOptionPane;

public class TransposicaoDeMatriz {
    public static void main(String[] args) {
        int linhas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de linhas:"));
        int colunas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de colunas:"));

        // Inserir elementos na matriz
        int[][] matriz = new int[linhas][colunas];
        JOptionPane.showMessageDialog(null, "Digite os elementos da matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Elemento [" + i + "][" + j + "]:"));
            }
        }

        // Calcular a matriz transposta
        int[][] matrizTransposta = new int[colunas][linhas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matrizTransposta[j][i] = matriz[i][j];
            }
        }

        // Exibir a matriz transposta
        StringBuilder resultado = new StringBuilder("A matriz transposta é:\n");
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < linhas; j++) {
                resultado.append(matrizTransposta[i][j]).append(" ");
            }
            resultado.append("\n");
        }
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
