package B_IF_Ex04;

import javax.swing.JOptionPane; 
public class Principalpeso {
    public static void main (String [] args){
        Peso peso = new Peso();
        
        JOptionPane.showMessageDialog(null,"A classificação é:  " + 
            peso.calcularPeso(
                Double.parseDouble(JOptionPane.showInputDialog("Informe a altura: ")),
                Double.parseDouble(JOptionPane.showInputDialog("Informe o peso: "))
             ));
        
    }
}
