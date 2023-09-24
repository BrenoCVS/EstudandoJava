package A_Introducao_Ex13;
import javax.swing.JOptionPane;


public class PrincipalIluminar {
    public static void main (String [] args){
        Iluminar iluminar = new Iluminar();
        
        double area = Double.parseDouble(JOptionPane.showInputDialog("Informe a área total: "));
        double potencia = Double.parseDouble(JOptionPane.showInputDialog("Informe a potência de iluminarção: "));

       JOptionPane.showMessageDialog(null,iluminar.calcularIluminar(area,potencia));
    }
}
