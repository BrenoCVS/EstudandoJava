
package A_Introducao_Ex11;

import javax.swing.JOptionPane ;

public class Principal {

  public static void main(String[]args){
      
    Espetaculo espetaculo = new Espetaculo(); 
    
    double custo = Double.parseDouble(JOptionPane.showInputDialog("Informe o custo:"));
    double precoteatro = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do teatro:"));  
     JOptionPane.showMessageDialog(null,espetaculo.calcular(custo,precoteatro )); 
      
      
      
      
  }   
    
    
    
    
    
}
