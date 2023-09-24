package C_For_Ex06;

import javax.swing.JOptionPane;

public class PrincipalFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        
        Integer ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano: "));
        JOptionPane.showMessageDialog(null, funcionario.calcularSalario(ano));
        
    }
}
