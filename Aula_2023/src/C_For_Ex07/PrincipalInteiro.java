package C_For_Ex07;

import javax.swing.JOptionPane;

public class PrincipalInteiro {
    public static void main (String[] args){
    Inteiro inteiro = new Inteiro();
        
        for(int cont=1; cont<=10; cont++){
            Integer num = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));
            inteiro.calcular(num, cont);
        }
        
        JOptionPane.showMessageDialog(null, inteiro.mostrar());
        
    }
}