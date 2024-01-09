package Ex20;
import javax.swing.JOptionPane;


public class ModificacaoDeObjetos {
    public static void main(String[] args) {
        // Criar objeto ContaBancaria com input do usuário
        ContaBancaria conta = criarContaBancariaComInput();

        // Exibir saldo antes da modificação
        JOptionPane.showMessageDialog(null, "Saldo antes da modificação: " + conta.saldo);

        // Realizar operação de depósito
        depositarNaConta(conta);

        // Exibir saldo após a modificação
        JOptionPane.showMessageDialog(null, "Saldo após a modificação: " + conta.saldo);
    }

    static ContaBancaria criarContaBancariaComInput() {
        double saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo inicial da conta:"));
        return new ContaBancaria(saldo);
    }

    static void depositarNaConta(ContaBancaria conta) {
        // Realizar operação de depósito na conta
        double valorDeposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser depositado:"));
        conta.saldo += valorDeposito;
    }
}