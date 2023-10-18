import javax.swing.JOptionPane;

public class BasicArrays {

	public static void main(String[] args) {
		

		// Fazer manipulação de Vetores, adicionar zeros em uma variável.
		
		
		// Input do tamanho das arrays;
		
		String strQuantidade1 = JOptionPane.showInputDialog("Enter the size of array 1: \n");
		int quantidade1 = Integer.parseInt(strQuantidade1);
		
		String strQuantidade2 = JOptionPane.showInputDialog("Enter the size of array 2: \n");
		int quantidade2 = Integer.parseInt(strQuantidade2);
		
		
		// Declarar e criar as arrays;
		
		int vetor1[];
		int vetor2[]; 
		
		vetor1 = new int[quantidade1];
		vetor2 = new int[quantidade2];
		
		
		// Pegar os números de cada array
		
		for(int i = 0; i < quantidade1; i++) {
			
			String strValor = JOptionPane.showInputDialog("Enter the values of array 1--["+i+"]");
			vetor1[i] = Integer.parseInt(strValor);
			
		}
		
		for(int i = 0; i < quantidade2; i++) {
			
			String strValor = JOptionPane.showInputDialog("Enter the values of array 2--["+i+"]");
			vetor2[i] = Integer.parseInt(strValor);
		}
		
		// adicionar os zeros;
		
		int qtdZero1 = 0;
		int qtdZero2 = 0;
		int totalZeros = 0;
	
		
		
		for(int i = 0; i < vetor1.length; i++) {
			
			if(vetor1[i] == 0) {
				qtdZero1++;
			}
		
		}
		
		for(int i = 0; i< vetor2.length; i++) {
			
			if(vetor2[i] == 0) {
				qtdZero2++;
			}
		}
		
		totalZeros = qtdZero1 + qtdZero2;

		
		JOptionPane.showInternalMessageDialog(null, "The amount of zeros in array 1 = " + qtdZero1 + "\n" + "The amount of zeros in array 2 = "+ qtdZero2 +"\n"
				+ "The total amount of Zeros is = " + totalZeros + "\n");

	}

}
