package B_IF_Ex06;
import javax.swing.JOptionPane;

public class PrincipalNumero {
    public static void main (String [] args){
        Numero numero = new Numero();
        
        JOptionPane.showMessageDialog(null, 
            numero.operacao(
                Integer.parseInt(JOptionPane.showInputDialog("Informe o número 1: ")),
                Integer.parseInt(JOptionPane.showInputDialog("Informe o número 2: ")),
                JOptionPane.showInputDialog("informe a opção \n"
                        + "A-Adição\n"
                        + "S-Subtração\n"
                        + "D-Divisão\n"
                        + "M-Multiplicação"))
             );
        
    }
}
