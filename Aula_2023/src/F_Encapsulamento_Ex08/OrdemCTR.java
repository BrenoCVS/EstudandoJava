package F_Encapsulamento_Ex08;

public class OrdemCTR {
    OrdemDAO ordemDAO = new OrdemDAO();
    
     public String imprimir (OrdemDTO ordemDTO){
            return ordemDAO.cres(ordemDTO);
    }
}
