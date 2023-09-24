package F_Encapsulamento_Ex06;

public class LadoCTR {
   LadoDAO ladoDAO = new LadoDAO();
   public String imprimir (LadoDTO ladoDTO){
            return ladoDAO.verifica(ladoDTO);
}
}
