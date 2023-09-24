package B_IF_Ex01;
import javax.swing.JOptionPane;

public class PrincipalMedia {
    public static void main (String [] args){
        Media media = new Media();
        
        JOptionPane.showMessageDialog(null,"A situação do aluno é:  " + 
            media.calcularMedia (
                Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 1: ")),
                Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 2: "))
             ));
        
    }
}
