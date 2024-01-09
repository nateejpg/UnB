package Ex19;
import javax.swing.JOptionPane;


public class CopiaDeObjetos {
    public static void main(String[] args) {
        // Criar objeto Aluno com input do usuário
        Aluno alunoOriginal = criarAlunoComInput();

        // Exibir valores antes da cópia
        JOptionPane.showMessageDialog(null, "Valores antes da cópia:\nAluno Original: " + alunoOriginal.nome + " - Nota: " + alunoOriginal.nota);

        // Criar cópia do objeto Aluno
        Aluno alunoCopia = copiarAluno(alunoOriginal);

        // Modificar a cópia
        alunoCopia.nome = JOptionPane.showInputDialog("Digite o novo nome do aluno:");
        alunoCopia.nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nova nota do aluno:"));

        // Exibir valores após a cópia e modificação
        JOptionPane.showMessageDialog(null, "Valores após a cópia e modificação:\nAluno Original: " + alunoOriginal.nome + " - Nota: " + alunoOriginal.nota +
                "\nAluno Cópia: " + alunoCopia.nome + " - Nota: " + alunoCopia.nota);
    }

    static Aluno criarAlunoComInput() {
        String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
        double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno:"));
        return new Aluno(nome, nota);
    }

    static Aluno copiarAluno(Aluno original) {
        // Criar e retornar uma cópia do objeto Aluno
        return new Aluno(original.nome, original.nota);
    }
}