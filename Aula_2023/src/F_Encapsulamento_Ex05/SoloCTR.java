package F_Encapsulamento_Ex05;

public class SoloCTR {
    SoloDAO soloDAO = new SoloDAO();
    public String imprimir (SoloDTO soloDTO){
            return soloDAO.imprimir(soloDTO);
}
    
}
