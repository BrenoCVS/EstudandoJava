package A_Introducao_Ex09;
import javax.swing.JOptionPane;

public class PrincipalRacao {
    public static void main (String [] args){
        Racao racao = new Racao();
        
        double gato1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade em gramas do gato 1: "));
        double gato2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade em gramas do gato 2: "));
        double peso_saco = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso do saco de ração em kg: "));
       JOptionPane.showMessageDialog(null,racao.calcularRacao(gato1, gato2, peso_saco));
    }
}
