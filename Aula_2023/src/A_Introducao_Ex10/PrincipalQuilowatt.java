package A_Introducao_Ex10;
import javax.swing.JOptionPane;

public class PrincipalQuilowatt {
     public static void main (String [] args){
        Quilowatt quilowatt = new Quilowatt();
        
        double sal_min = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do salário mínimo: "));
        double quilowatts = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de quilowatts usados: "));
        
       JOptionPane.showMessageDialog(null,quilowatt.calcularQuilowatt(sal_min,quilowatts));
    }
}
