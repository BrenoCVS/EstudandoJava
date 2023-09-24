package C_For_EX03;
import javax.swing.JOptionPane;

public class PrincipalIntervalo {
    public static void main (String [] args){
        Intervalo intervalo = new Intervalo();
        Integer n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        Integer n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        JOptionPane.showMessageDialog(null, intervalo.calcularIntervalo(n1, n2));
    }
    
}
