import javax.swing.JOptionPane;

public class Se {
    public static void main(String[] args) {
       
        double nota1, nota2, nota3, media;

        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a Nota 1: "));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a Nota 2: "));
        nota3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a Nota 3: "));

        media = (nota1 + nota2 + nota3) / 3;

        if( media > 7){
            JOptionPane.showMessageDialog(null, "A média é maior que 7.0");
        } else if (media == 7) {
            JOptionPane.showMessageDialog(null,"A média é igual a 7.0");
        } else{
            JOptionPane.showMessageDialog(null,"A média é menor que 7.0");
        }

    }
}
