package Ex03;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeTarefas {

    public static void main(String[] args) {
        ArrayList<String> tarefas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à Lista de Tarefas!");

        while (true) {
            exibirMenu();
            String comando = scanner.nextLine();

            switch (comando.toLowerCase()) {
                case "adicionar":
                    System.out.println("Digite a descrição da tarefa:");
                    String descricao = scanner.nextLine();
                    adicionarTarefa(tarefas, descricao);
                    break;

                case "listar":
                    listarTarefas(tarefas);
                    break;

                case "concluir":
                    System.out.println("Digite o número da tarefa a ser concluída:");
                    int numeroTarefa = Integer.parseInt(scanner.nextLine());
                    concluirTarefa(tarefas, numeroTarefa);
                    break;

                case "sair":
                    System.out.println("Obrigado por usar a Lista de Tarefas. Até logo!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Comando inválido. Por favor, tente novamente.");
            }
        }
    }

    private static void exibirMenu() {
        System.out.println("\nComandos disponíveis:");
        System.out.println("- \"adicionar\" para adicionar uma nova tarefa");
        System.out.println("- \"listar\" para listar as tarefas");
        System.out.println("- \"concluir\" para marcar uma tarefa como concluída");
        System.out.println("- \"sair\" para sair do programa");
        System.out.print("Digite um comando: ");
    }

    private static void adicionarTarefa(ArrayList<String> tarefas, String descricao) {
        tarefas.add(descricao);
        System.out.println("Tarefa adicionada com sucesso!");
    }

    private static void listarTarefas(ArrayList<String> tarefas) {
        System.out.println("Tarefas pendentes:");
        if (tarefas.isEmpty()) {
            System.out.println("(Nenhuma tarefa pendente)");
        } else {
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.println((i + 1) + ". " + tarefas.get(i));
            }
        }
    }

    private static void concluirTarefa(ArrayList<String> tarefas, int numeroTarefa) {
        if (numeroTarefa > 0 && numeroTarefa <= tarefas.size()) {
            String tarefaConcluida = tarefas.remove(numeroTarefa - 1);
            System.out.println("Tarefa \"" + tarefaConcluida + "\" marcada como concluída.");
        } else {
            System.out.println("Número de tarefa inválido. Por favor, tente novamente.");
        }
    }
}
