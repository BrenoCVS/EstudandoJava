/*
Faça um algoritmo que solicite 10 números inteiros.
Ao final o algoritmo deve informar o maior e o menor número digitado.
OBS: Deve ser criado um método para verificar os números e outro somente para
mostrar o resultado.
 */
package C_For_Ex07;

public class Inteiro {
    private int maior, menor, num, cont;
    
     public void calcular (int num, int cont){
         this.num = num;
         this.cont = cont;
  
        if (this.cont == 1){
            this.maior = this.num;
            this.menor = this.num;
        }else{
        if (this.num >= this.maior){
            this.maior = this.num;
        }
        if(this.num <= this.menor){
            this.menor = this.num;
        }
                }
     }
     
     public String mostrar (){
         return "O número maior é: " + this.maior +
                 "\nO número menor é: " + this.menor;
     }
}
