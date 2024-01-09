package Ex10;
import javax.swing.JOptionPane;

public class Contagem {
	
	 public static void main(String[] args) {
	        int numeroInicial = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inicial:"));

	        // Iniciar a contagem regressiva
	        while (numeroInicial >= 1) {
	            System.out.println(numeroInicial);
	            numeroInicial--;
	        }
	    }

}
