package D_While_DoWhile_Ex01;
import javax.swing.JOptionPane;

public class PrincipalExemplowhile1 {
public static void main (String[] args){
    String letra;
    Exemplowhile1 exemplowhile1 = new Exemplowhile1();
    letra = JOptionPane.showInputDialog("Informe a letra");
    
    while(letra.equalsIgnoreCase("x")){
        exemplowhile1.verificar(letra);
        letra = JOptionPane.showInputDialog("Informe a letra");
    }
    JOptionPane.showMessageDialog(null, exemplowhile1.mostra());
}
}
