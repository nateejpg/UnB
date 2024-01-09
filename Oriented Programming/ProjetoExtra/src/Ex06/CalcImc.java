
package Ex06;
import javax.swing.JOptionPane;

public class CalcImc {
	
	public static void main(String[] args) {
        double pesoKg = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso em kg:"));
        double alturaMetros = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura em metros:"));

        // Calcular o IMC
        double imc = pesoKg / (alturaMetros * alturaMetros);

        // Exibir o resultado e classificação
        JOptionPane.showMessageDialog(null, "Seu IMC é: " + String.format("%.2f", imc));

        // Classificar o usuário de acordo com a tabela de IMC
        if (imc < 18.5) {
            JOptionPane.showMessageDialog(null, "Classificação de IMC: Abaixo do peso");
        } else if (imc < 24.9) {
            JOptionPane.showMessageDialog(null, "Classificação de IMC: Normal");
        } else if (imc < 29.9) {
            JOptionPane.showMessageDialog(null, "Classificação de IMC: Sobrepeso");
        } else if (imc < 34.9) {
            JOptionPane.showMessageDialog(null, "Classificação de IMC: Obesidade Grau 1");
        } else if (imc < 39.9) {
            JOptionPane.showMessageDialog(null, "Classificação de IMC: Obesidade Grau 2");
        } else {
            JOptionPane.showMessageDialog(null, "Classificação de IMC: Obesidade Grau 3");
        }
    }

}
