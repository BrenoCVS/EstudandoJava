package F_Encapsulamento_Ex12;

public class PredioCTR {
     PredioDAO predioDAO = new PredioDAO();
     
     public String calcular(PredioDTO predioDTO){
         
         return predioDAO.calcular(predioDTO);
         
    }
     
     public String imprimir(){
     
         return predioDAO.imprimir();
     }
}
