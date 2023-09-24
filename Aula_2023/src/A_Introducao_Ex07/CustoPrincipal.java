package A_Introducao_Ex07;
import javax.swing.JOptionPane;

public class CustoPrincipal {
    public static void main (String [] args){
        Custo custo = new Custo();
        
        double preco_fabrica = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço de fábrica: "));
        double imposto = Double.parseDouble(JOptionPane.showInputDialog("Informe a % de imposto: "));
        double lucro = Double.parseDouble(JOptionPane.showInputDialog("Informe a % de lucro: "));
       JOptionPane.showMessageDialog(null,custo.CalcularCusto(lucro, imposto, preco_fabrica));
    }
 
}
