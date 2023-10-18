import javax.swing.JOptionPane;

public class Vetores {

	public static void main(String[] args) {
		
		// Fazer manipulação de Vetores (Zeros, positives, negatives, Odds, Even);
		
		
		// Input do tamanho da array;
		
		String strQuantidade = JOptionPane.showInputDialog("Enter the size of array: \n");
		int quantidade = Integer.parseInt(strQuantidade);
		
		
		// Declarar e criar o vetor;
		
		int vetor[];
		
		vetor = new int[quantidade];
		
		
		// Pegar os números de cada array;
		
		for(int i = 0; i < quantidade; i++) {
			
			String strValor = JOptionPane.showInputDialog("Enter the values of array["+i+"]");
			vetor[i] = Integer.parseInt(strValor);
			
		}
		
		// adicionar os zeros;
		
		int qtdZero = 0;
	
		
		for(int i = 0; i < vetor.length; i++) {
			
			if(vetor[i] == 0) {
				qtdZero++;
			}
		
		}
		
		// Positive and negative
		
		int posNumbers = 0;
		int negNumbers = 0;
		int sum = 0;
			
		
		// To count them;
		
		for(int i = 0; i < vetor.length; i++) {
			
			if(vetor[i] > 0 && vetor[i] != 0) {
				
				posNumbers++;
				
			}else {
				
				negNumbers++;
			}
		}
		
		// To sum them to the variable SUM;
		
		for(int i = 0; i < vetor.length; i++) {
			
		
			if(vetor[i] > 0) {
				
				sum += vetor[i];
				
			}else {
				
				sum += vetor[i];
			}
		}
		
		
		// Odd and Even numbers;
		
		int oddNum = 0;
		int evenNum = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			
			if(vetor[i] % 2 == 0) {
				
				evenNum++;
				
			}else {
				
				oddNum++;
			}
		}

		
		JOptionPane.showInternalMessageDialog(null, 
		"The amount of zeros in the array is: " + qtdZero + "\n" 
		+ "The amount of positive numbers is: "+ posNumbers + "\n" 
		+ "The amount of negative numbers is: " + negNumbers + "\n" 
		+ "The amount of Odd numbers is: " + oddNum + "\n"
		+ "The amount of Even numbers is: " + evenNum + "\n"
		+ "The sum is: " + sum +"\n"
		
		);
		
	}

}
