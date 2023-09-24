package B_IF_Ex05;
import javax.swing.JOptionPane; 

public class PrincipalLado {
    public static void main (String [] args){
        Lado lado = new Lado();
        
        JOptionPane.showMessageDialog(null,"O triângulo é:  " + 
            lado.calcularLado(
                Double.parseDouble(JOptionPane.showInputDialog("Informe o lado A: ")),
                Double.parseDouble(JOptionPane.showInputDialog("Informe o lado B: ")),
                Double.parseDouble(JOptionPane.showInputDialog("Informe o lado C: "))
             ));
        
    }
}
