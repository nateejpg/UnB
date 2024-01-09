package Ex02;

import javax.swing.JOptionPane;

public class ConvTemp {

	public static void main(String[] args) {
		
		int escolha;
		double Celsius;
		double Fahrenheit;
		double valorConvC;
		double valorConvF;
		String message;
		
		String strEscolha = JOptionPane.showInputDialog("Escolha o tipo de conversao: \n Celsius para Fahrenheit(1)  \n Fahrenheit para Celsius (2)");
		escolha = Integer.parseInt(strEscolha);
		
		if(escolha == 1) {
			
			String strCelsius = JOptionPane.showInputDialog("Quantos Graus Celsius vc quer converter: \n");
			Celsius = Double.parseDouble(strCelsius);
			
			valorConvC = (Celsius * 9/5) + 32;
			
			message = "O valor em Fahrenheit final = " + valorConvC;
			
			JOptionPane.showMessageDialog(null, message);
			
			
		}else if(escolha == 2){
			
			String strFahrenheit = JOptionPane.showInputDialog("Quantos Graus Fahrenheit vc quer conveter: \n");
			Fahrenheit = Double.parseDouble(strFahrenheit);
			
			 valorConvF = (Fahrenheit - 32) * 5/9;
			 
			 message = "O valor em Celsius final = " + valorConvF;
			 
		     JOptionPane.showMessageDialog(null, message);
			
		}else {
			
			message = "Entre uma escolha aceitável!";
			
			JOptionPane.showMessageDialog(null, message);
			
		}

	}

}
