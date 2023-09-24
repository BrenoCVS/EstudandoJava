
package A_Introducao_Ex12;

import A_Introducao_Ex11.Espetaculo;
import javax.swing.JOptionPane;


public class Principal {
    
    
      public static void main(String[]args){
      
    Combustivel combustivel = new Combustivel(); 
    
    double vm = Double.parseDouble(JOptionPane.showInputDialog(" velocidade media :"));
    double tg = Double.parseDouble(JOptionPane.showInputDialog(" tempo gasto:"));
     double kml = Double.parseDouble(JOptionPane.showInputDialog(" quilometros por litro:")); 
     JOptionPane.showMessageDialog(null,combustivel.calcular(vm, tg, kml )); 
      
      
      
      
  }   
    
    
}
