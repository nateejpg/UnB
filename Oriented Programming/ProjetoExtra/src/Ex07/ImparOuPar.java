package Ex07;
import javax.swing.JOptionPane;


public class ImparOuPar {
	
	 public static void main(String[] args) {
	        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));

	        // Verificar se o número é par ou ímpar
	        if (numero % 2 == 0) {
	            JOptionPane.showMessageDialog(null, "O número " + numero + " é par.");
	        } else {
	            JOptionPane.showMessageDialog(null, "O número " + numero + " é ímpar.");
	        }
	    }

}
