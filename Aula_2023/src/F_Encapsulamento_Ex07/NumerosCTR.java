package F_Encapsulamento_Ex07;

public class NumerosCTR {
    
    NumerosDAO numerosDAO = new NumerosDAO();
    
    public String imprimir (NumerosDTO numerosDTO){
            return numerosDAO.desc(numerosDTO);
    }
}
