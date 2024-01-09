package Ex05;
import javax.swing.JOptionPane;


public class ConversorIdade {
	
	public static void main(String[] args) {
        int idadeAnos = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade em anos:"));

        // Converter a idade
        int idadeMeses = idadeAnos * 12;
        int idadeDias = idadeAnos * 365;
        int idadeHoras = idadeDias * 24;
        int idadeMinutos = idadeHoras * 60;

        // Exibir o resultado formatado
        JOptionPane.showMessageDialog(null,
                "Idade em meses: " + idadeMeses + "\nIdade em dias: " + idadeDias + "\nIdade em horas: " + idadeHoras
                        + "\nIdade em minutos: " + idadeMinutos);
    }

}
