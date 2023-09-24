package F_Encapsulamento_Ex09;

public class AlturaCTR {
    AlturaDAO alturaDAO = new AlturaDAO();
    public String imprimir (AlturaDTO alturaDTO){
            return alturaDAO.classi(alturaDTO);
    }
}
