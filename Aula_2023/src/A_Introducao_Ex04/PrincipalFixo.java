package A_Introducao_Ex04;

import javax.swing.JOptionPane;
public class PrincipalFixo {
     public static void main (String [] args){
        Fixo fixo = new Fixo();
        
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu salário:"));
        double comissao = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor das vendas:"));
       JOptionPane.showMessageDialog(null,fixo.calcularFixo(salario, comissao));
     }
}
