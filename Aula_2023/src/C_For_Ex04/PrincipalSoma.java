package C_For_Ex04;
import javax.swing.JOptionPane;

public class PrincipalSoma {
    public static void main (String [] args){
        Soma soma = new Soma();
        
        for (int cont=1; cont<=10; cont++){
        Integer n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + cont + " número: "));
        soma.calcularSoma(n1);
        }
        JOptionPane.showMessageDialog(null, soma.mostrarSoma());
    }
}
