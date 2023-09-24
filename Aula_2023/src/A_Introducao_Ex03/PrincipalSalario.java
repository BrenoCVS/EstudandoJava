package A_Introducao_Ex03;

import javax.swing.JOptionPane;
  public class PrincipalSalario {
    public static void main (String [] args){
       Salario salario = new Salario(); 
       
       double sal_inicial = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu salário:"));
       double porcentagem = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do aumento:"));
       JOptionPane.showMessageDialog(null,salario.calcularSalario(sal_inicial, porcentagem));
    }
  }
