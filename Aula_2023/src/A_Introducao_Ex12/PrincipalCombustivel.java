package A_Introducao_Ex12;
import javax.swing.JOptionPane;

public class PrincipalCombustivel {
    public static void main (String [] args){
        Combustivel combustivel = new Combustivel();
        
        double tempo_gasto = Double.parseDouble(JOptionPane.showInputDialog("Informe o tempo gasto: "));
        double kml = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de kml: "));
        double vm = Double.parseDouble(JOptionPane.showInputDialog("Informe a velocidade média: "));

       JOptionPane.showMessageDialog(null,combustivel.calcularCombustivel(tempo_gasto,kml,vm));
    }
}
         