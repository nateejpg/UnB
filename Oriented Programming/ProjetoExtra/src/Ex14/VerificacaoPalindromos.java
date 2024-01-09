package Ex14;
import javax.swing.JOptionPane;

public class VerificacaoPalindromos {
    public static void main(String[] args) {
        String palavra = JOptionPane.showInputDialog("Digite uma palavra:").toLowerCase();

        // Remover espaços e pontuações
        palavra = palavra.replaceAll("[^a-zA-Z]", "");

        // Armazenar caracteres em um vetor
        char[] vetor = palavra.toCharArray();

        // Verificar se a palavra é um palíndromo
        boolean palindromo = true;
        for (int i = 0, j = vetor.length - 1; i < j; i++, j--) {
            if (vetor[i] != vetor[j]) {
                palindromo = false;
                break;
            }
        }

        // Exibir o resultado
        if (palindromo) {
            JOptionPane.showMessageDialog(null, "A palavra \"" + palavra + "\" é um palíndromo.");
        } else {
            JOptionPane.showMessageDialog(null, "A palavra \"" + palavra + "\" não é um palíndromo.");
        }
    }
}
