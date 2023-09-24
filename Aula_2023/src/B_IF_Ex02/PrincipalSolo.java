package B_IF_Ex02;
import javax.swing.JOptionPane; 

public class PrincipalSolo {
    public static void main (String [] args){
        Solo solo = new Solo();
        
        JOptionPane.showMessageDialog(null,"A situação do solo é:  " + 
            solo.calcularSolo(
                Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade do solo: "))
             ));
        
    }
    
}
