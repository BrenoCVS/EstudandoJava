package A_Introducao_Ex11;
import javax.swing.JOptionPane;

public class PrincipalTeatro {
         public static void main (String [] args){
        Teatro teatro = new Teatro();
        
        double custo_esp = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço final do Espetáculo: "));
        double preco_con = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de cada convite: "));
        
       JOptionPane.showMessageDialog(null,teatro.calcularTeatro(custo_esp,preco_con));
    }
}
