
package A_Introducao_Ex06;
import javax.swing.JOptionPane;

public class PrincipalConversao {
    public static void main (String [] args){
        Conversao conversao = new Conversao();
        
        
        double pes = Double.parseDouble(JOptionPane.showInputDialog("Informe a medida em pés: "));
       JOptionPane.showMessageDialog(null,conversao.calcularConversao(pes));
    }
}
