import javax.swing.JOptionPane;

public class Enquanto {
    public static void main(String[] args) {
        String nome;
        int numAlunos;
        numAlunos = 1;

        while (numAlunos <= 10) {
            nome = JOptionPane.showInputDialog("Entre com o Nome: ");
            JOptionPane.showMessageDialog(null,"Aluno Cadastrado" + nome);
            numAlunos = numAlunos + 1;
        }
        System.exit(0);

    }
}
