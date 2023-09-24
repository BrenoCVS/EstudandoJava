package F_Encapsulamento_Ex10;

public class LancheCTR {
    LancheDAO lancheDAO = new LancheDAO();
    
    public String imprimir (LancheDTO lancheDTO){
            return lancheDAO.mostrar(lancheDTO);
    }
    
    public void pedido (LancheDTO lancheDTO) {
        lancheDAO.pedido(lancheDTO);
    }
}
