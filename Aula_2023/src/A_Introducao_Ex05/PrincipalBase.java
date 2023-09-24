
package A_Introducao_Ex05;
import javax.swing.JOptionPane;

public class PrincipalBase {
     public static void main (String [] args){
        Base base = new Base();
        
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu salário:"));
       JOptionPane.showMessageDialog(null,base.calcularBase(salario));
     }
}
