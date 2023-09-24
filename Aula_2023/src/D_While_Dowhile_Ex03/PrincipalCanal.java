package D_While_Dowhile_Ex03;
import D_While_Dowhile_Ex02.Letra;
import javax.swing.JOptionPane;

public class PrincipalCanal {
public static void main (String[] args){
   int canais = 1;
    Canal canal = new Canal();
    
    while(canais != 0){
    
    canais = Integer.parseInt(
    JOptionPane.showInputDialog("Informe o canal {9 | 12 | 23 | 40}: "));
    canal.somar(canais);
    }
  
    JOptionPane.showMessageDialog(null, canal.mostrar());
}  
}
