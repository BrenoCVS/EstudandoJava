package B_IF_Ex03;
import javax.swing.JOptionPane; 

public class PrincipalOrdem {
    public static void main (String [] args){
        Ordem ordem = new Ordem();
        
        JOptionPane.showMessageDialog(null,"A sequência é:  " + 
            ordem.calcularOrdem(
                Double.parseDouble(JOptionPane.showInputDialog("Informe em ordem crescente o primeiro número: ")),
                Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo número: ")),
                Double.parseDouble(JOptionPane.showInputDialog("Informe o terceiro número: ")),
                Double.parseDouble(JOptionPane.showInputDialog("Informe o quarto número aleatoriamente: "))
             ));
        
    }
}
