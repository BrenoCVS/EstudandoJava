/*
Dados 3 valores ladoA, ladoB e ladoC. Estes valores representam ladods de um
triângulo.
Com base nisso verificar:
a) Se podem ser valores dos lados formam um triângulo.
b) Se formar um triângulo, determinar qual:
    equilátero, isósceles ou escaleno.
OBS: só pode ser mostrado o tipo do triângulo se os lados informados formarem um.
Caso contrário deve ser mostrado uma mensagem que os lados informados não formam um triângulo.
 */
package F_Encapsulamento_Ex06;
public class LadoDTO {
    private double ladoA, ladoB, ladoC;

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }
    
}
