package Ex01;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Gorjeta {

    public static void main(String[] args) {

        String strValorComida = JOptionPane.showInputDialog("Valor da refeição: \n");
        double inputValorComida = Double.parseDouble(strValorComida);

        String strGorjeta = JOptionPane.showInputDialog("Valor gorjeta: \n");
        double inputGorjeta = Double.parseDouble(strGorjeta);

        double valorGorjeta = inputGorjeta / 100 * inputValorComida;
        double valorTotal = valorGorjeta + inputValorComida;

        DecimalFormat df = new DecimalFormat("#.##");
        String formattedValorGorjeta = df.format(valorGorjeta);
        String formattedValorTotal = df.format(valorTotal);

        String message = "Olá, o total da refeição foi: R$ " + formattedValorTotal + "\n "
                + " O valor da gorjeta foi: R$ " + formattedValorGorjeta;

        JOptionPane.showMessageDialog(null, message);
    }
}
