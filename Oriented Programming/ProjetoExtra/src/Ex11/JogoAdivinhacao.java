package Ex11;

import javax.swing.JOptionPane;
import java.util.Random;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(10) + 1; // Número aleatório entre 1 e 10
        int tentativas = 0;
        int tentativa;

        // Jogo de adivinhação
        do {
            tentativa = Integer.parseInt(JOptionPane.showInputDialog("Adivinhe o número entre 1 e 10.\nTentativa " + (tentativas + 1) + ":"));
            tentativas++;

            if (tentativa < numeroAleatorio) {
                JOptionPane.showMessageDialog(null, "Tente novamente. O número é maior.");
            } else if (tentativa > numeroAleatorio) {
                JOptionPane.showMessageDialog(null, "Tente novamente. O número é menor.");
            } else {
                JOptionPane.showMessageDialog(null, "Parabéns! Você acertou o número " + numeroAleatorio + " em " + tentativas + " tentativa(s).");
            }
        } while (tentativa != numeroAleatorio);
    }
}
