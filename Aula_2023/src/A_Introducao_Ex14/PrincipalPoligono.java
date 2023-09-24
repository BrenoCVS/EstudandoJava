package A_Introducao_Ex14;
import javax.swing.JOptionPane;

public class PrincipalPoligono {
    public static void main (String [] args){
        Poligono poligono = new Poligono();
        
        double n_diagonais = Double.parseDouble(JOptionPane.showInputDialog("Informe o número de diagonais do polígono: "));

       JOptionPane.showMessageDialog(null,poligono.calcularPoligono(n_diagonais));
    }
}
