package F_Encapsulamento_Ex05;

public class SoloDAO {
    private String resposta;
    public String imprimir (SoloDTO soloDTO){
        this.resposta = resposta;
        if (soloDTO.getRocha() <= 10) {
            this.resposta = "Rochoso";
        }
        else{
            if(soloDTO.getRocha() <= 40) {
            this.resposta = "Firme";
            }
            else{
                if(soloDTO.getRocha() <= 80) {
                this.resposta = "Pantanosa";
                }
                else{
                    this.resposta = "Quantidade Inválida";
                }
            }
        }
        return this.resposta;
    }
}
