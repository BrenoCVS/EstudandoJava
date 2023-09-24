package D_While_Dowhile_Ex02;

import javax.swing.JOptionPane;

public class PrincipalLetra {
public static void main (String[] args){
    String texto;
    Letra letra = new Letra();
    texto = JOptionPane.showInputDialog("Informe a letra: ");
    
    while (!texto.equalsIgnoreCase("0")){
        letra.somar(texto);
        texto = JOptionPane.showInputDialog("Informar a letra: ");
    }
    JOptionPane.showMessageDialog(null, letra.mostrar());
} 
}
