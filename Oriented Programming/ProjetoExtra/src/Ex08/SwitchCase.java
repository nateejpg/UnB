package Ex08;
import javax.swing.JOptionPane;


public class SwitchCase {
	
	public static void main(String[] args) {
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));

        // Apresentar opções para o usuário
        String operacao = JOptionPane.showInputDialog("Escolha a operação:\n1. Adição\n2. Subtração\n3. Multiplicação\n4. Divisão");

        // Converter a escolha para inteiro
        int opcao = Integer.parseInt(operacao);

        // Executar a operação escolhida
        double resultado = 0;
        switch (opcao) {
            case 1:
                resultado = numero1 + numero2;
                break;
            case 2:
                resultado = numero1 - numero2;
                break;
            case 3:
                resultado = numero1 * numero2;
                break;
            case 4:
                // Verificar se o divisor é zero
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    JOptionPane.showMessageDialog(null, "Não é possível dividir por zero.");
                    System.exit(0); // Encerra o programa
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida.");
                System.exit(0); // Encerra o programa
        }

        // Exibir o resultado
        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
    }

}
