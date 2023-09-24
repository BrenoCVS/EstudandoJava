package F_Encapsulamento_Ex06;
import javax.swing.JOptionPane;
public class LadoVIEW {
    public static void main (String args[]){
        try{
            LadoDTO  ladoDTO = new LadoDTO();
            LadoCTR ladoCTR = new LadoCTR();
            
            ladoDTO.setLadoA(Integer.parseInt(JOptionPane.showInputDialog("Informe a medida do lado A: ")));
            ladoDTO.setLadoB(Integer.parseInt(JOptionPane.showInputDialog("Informe a medida do lado B: ")));
            ladoDTO.setLadoC(Integer.parseInt(JOptionPane.showInputDialog("Informe a medida do lado C: ")));
            
            JOptionPane.showMessageDialog(null, ladoCTR.imprimir(ladoDTO));
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null, "Erro no sistema: " + e.getMessage());
    }
    }
}
