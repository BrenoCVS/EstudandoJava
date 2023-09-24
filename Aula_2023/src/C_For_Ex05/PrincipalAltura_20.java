
package C_For_Ex05;

import javax.swing.JOptionPane;
public class PrincipalAltura_20 {
    public static void main(String[] args) {
        Altura_20 altura_20 = new Altura_20();
        
        for(int cont=1; cont<=20; cont++){
            altura_20.recebe_dados(Double.parseDouble(JOptionPane.showInputDialog("Informe a altura")));   
        }
        
        JOptionPane.showMessageDialog(null, "A média é: " + altura_20.mostra_media());
        JOptionPane.showMessageDialog(null, "A quantidade é: " + altura_20.mostra_qtd());
        
    }
}
