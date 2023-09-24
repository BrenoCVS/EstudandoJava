package E_Excecao_Ex01;
import javax.swing.JOptionPane;

public class TabuadaPrincipal {
    public static void main (String[] args){
    try{
        Tabuada tabuada = new Tabuada();
        JOptionPane.showMessageDialog(null,
        tabuada.calcular(
                Integer.parseInt(
                        JOptionPane.showInputDialog("Informe o número")
                )
        ));
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, "Erros 001");
        System.out.print("Erros: " + e.getMessage());
    }
    finally{
        JOptionPane.showMessageDialog(null,"FIm do sistema");
    }
    } 
}

