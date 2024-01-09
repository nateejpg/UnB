package Ex16;

import javax.swing.JOptionPane;

public class MultiplicacaoDeMatrizes {
    public static void main(String[] args) {
        int linhasMatriz1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de linhas da primeira matriz:"));
        int colunasMatriz1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de colunas da primeira matriz:"));

        // Inserir elementos na primeira matriz
        double[][] matriz1 = new double[linhasMatriz1][colunasMatriz1];
        JOptionPane.showMessageDialog(null, "Digite os elementos da primeira matriz:");
        for (int i = 0; i < linhasMatriz1; i++) {
            for (int j = 0; j < colunasMatriz1; j++) {
                matriz1[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Elemento [" + i + "][" + j + "]:"));
            }
        }

        int linhasMatriz2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de linhas da segunda matriz:"));
        int colunasMatriz2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de colunas da segunda matriz:"));

        // Inserir elementos na segunda matriz
        double[][] matriz2 = new double[linhasMatriz2][colunasMatriz2];
        JOptionPane.showMessageDialog(null, "Digite os elementos da segunda matriz:");
        for (int i = 0; i < linhasMatriz2; i++) {
            for (int j = 0; j < colunasMatriz2; j++) {
                matriz2[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Elemento [" + i + "][" + j + "]:"));
            }
        }

        // Verificar se a multiplicação é possível
        if (colunasMatriz1 != linhasMatriz2) {
            JOptionPane.showMessageDialog(null, "Número de colunas da primeira matriz deve ser igual ao número de linhas da segunda matriz.");
            System.exit(0);
        }

        // Calcular a multiplicação das matrizes
        double[][] matrizProduto = new double[linhasMatriz1][colunasMatriz2];
        for (int i = 0; i < linhasMatriz1; i++) {
            for (int j = 0; j < colunasMatriz2; j++) {
                for (int k = 0; k < colunasMatriz1; k++) {
                    matrizProduto[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        // Exibir a matriz resultante
        StringBuilder resultado = new StringBuilder("A multiplicação das matrizes é:\n");
        for (int i = 0; i < linhasMatriz1; i++) {
            for (int j = 0; j < colunasMatriz2; j++) {
                resultado.append(matrizProduto[i][j]).append(" ");
            }
            resultado.append("\n");
        }
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
