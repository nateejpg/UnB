import javax.swing.JOptionPane;

public class displaynot {
	
    public static void main(String[] args) {

        String nome, sobreNome, message;
        float peso;
        float altura;
        float imc;
        int idade;

        nome = JOptionPane.showInputDialog("Informe o seu nome: ");
        sobreNome = JOptionPane.showInputDialog("Informe o seu sobrenome: ");

        String pesoInput = JOptionPane.showInputDialog("Informe o seu peso (em kg): ");
        peso = Float.parseFloat(pesoInput);

        String alturaInput = JOptionPane.showInputDialog("Informe sua altura (em metros): ");
        altura = Float.parseFloat(alturaInput);
        
        String idadeInput = JOptionPane.showInputDialog("Informe sua idade: ");
        idade = Integer.parseInt(idadeInput);

        imc = peso / (altura * altura);
         
        
        message = "Hello " + nome + " " + sobreNome + "\n" + " Sua idade: " + idade + "\n" + " Seu peso: " + peso + "\n"  + " Sua altura: " + altura  + "\n" + "IMC: " + imc;
       

        JOptionPane.showMessageDialog(null, message);
    }


}
