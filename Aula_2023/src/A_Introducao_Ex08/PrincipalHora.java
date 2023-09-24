package A_Introducao_Ex08;
import javax.swing.JOptionPane;

public class PrincipalHora {
     public static void main (String [] args){
        Horas horas = new Horas();
        
        double hora_totais = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de horas trabalhadas: "));
        double sal_min = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do salário mínimo: "));
       JOptionPane.showMessageDialog(null,horas.calcularHoras(hora_totais, sal_min));
    }
}
