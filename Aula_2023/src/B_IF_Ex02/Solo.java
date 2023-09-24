/*
Você está fazendo um trabalho de classificação de solo.
Após colher uma amostra e verificar a quantidade de pontos de água
presente nela, classificou a amostra em:
Rochosa: se menos ou igual a 10 pontos de água
Firme: se mais de 10 e menos ou igual a 40 pontos
Pantanosa: se mais do que 40 e menos ou igual a 80 pontos
Quantidade Inválida: se mais do que 80 pontos
 */

package B_IF_Ex02;

public class Solo {
    private double rocha;
    private String resposta;
    public String calcularSolo (double rocha){
        this.rocha = rocha;
        
        if (this.rocha <= 10) {
            this.resposta = "Rochoso";
        }
        else{
            if(this.rocha <= 40) {
            this.resposta = "Firme";
            }
            else{
                if(this.rocha <= 80) {
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
