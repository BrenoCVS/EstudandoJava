/*
foi feita uma pesquisaa de audiência de canal de TV em várias casas
de uma certa cidade num determinado dia.
para cada casa visitad, é fornecido o número do canal (9,12,23,40).
     fazer um algoritmo que:
     -lei um número indetermindao de dados, até que seja digitado
     o canal (zero)
     -caso seja digitado algum canal fora dos apresentados acima,
     informar como outros canais;
     -o número 0 (zero) não pode ser considerado um canal.
 */
package D_While_Dowhile_Ex03;

public class Canal {
private int c9,c23, c12, c40, outros, canais;

    public void somar(int canais){
        this.canais = canais;

        if (this.canais == 9){
            this.c9++;
        }
        else
        if (this.canais == 12){
             this.c12++;
        }
        else
        if (this.canais == 23){
            this.c23++;
        }
        else
        if (this.canais == 40){
            this.c40++;
        }
        else
        if (this.canais != 0){
            this.outros++;
        }
    }
    public String mostrar(){
        return "A audiência do canal 9 é: " + this.c9 +
                "\nA audiência do canal 12 é: " + this.c12 + 
                "\nA audiência do canal 23 é: " + this.c23 +
                "\nA audiência do canal 40 é: " + this.c40 +
                "\nA audiência de outros canais é: " + this.outros; 
    }
}
