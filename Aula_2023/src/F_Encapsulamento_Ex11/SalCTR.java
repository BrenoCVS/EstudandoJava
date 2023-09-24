package F_Encapsulamento_Ex11;

public class SalCTR {
    
     SalDAO salDAO = new SalDAO();
     
     public void calcular(SalDTO salDTO){
         
         salDAO.calcular(salDTO);
         
    }
     
     public String imprimir(){
     
         return salDAO.imprimir();
     }
}
