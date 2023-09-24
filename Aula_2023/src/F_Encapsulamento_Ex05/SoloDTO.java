/*
Você está fazendo um trabalho de classificação de solo.
Após colher uma amostra  verificar a pontuação de água presente nela, classificou
a amostra em:
-Rochosa: se menos ou igual a 10 pontos de água
-Firme: se mais de 10 pontos e menos ou igual a 40 pontos
-Pantanosa: se mais do 40 pontos e menos ou igual a 80 pontos.
-caso seja maior que 80 pontos escrever a mensagem "Quantidade de água inválida."
 */
package F_Encapsulamento_Ex05;

public class SoloDTO {
   private double rocha;
    
    public double getRocha() {
        return rocha;
    }

    public void setRocha(double rocha) {
        this.rocha = rocha;
    }
}


