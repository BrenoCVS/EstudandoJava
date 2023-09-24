package F_Encapsulamento_Ex05;
import javax.swing.JOptionPane;
public class SoloVIEW {
    public static void main (String args[]){
        try{
            SoloDTO  soloDTO = new SoloDTO();
            SoloCTR soloCTR = new SoloCTR();
            
            soloDTO.setRocha(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de água: ")));
            
            JOptionPane.showMessageDialog(null, soloCTR.imprimir(soloDTO));
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null, "Erro no sistema: " + e.getMessage());
    }
    }
}
