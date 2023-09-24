/*
Construa um algoritmo que solicite uma letra até que o número 0 (zero) seja 
digitado.
Ao final o algoritmo deve informar a quantidade de cada vogal digoitado e o  
número total de consoantes que foram digitadas, possíveis números deve, ser considerados
como consoantes.
OBS: o numero 0  não pode ser computado
 */
package D_While_Dowhile_Ex02;

public class Letra {
private String texto;
int a, e, i , o, u, cons;

public void somar(String texto){
    this.texto = texto;
    this.cons = cons;
  
        if (this.texto.equalsIgnoreCase("a")){
            this.a++;
        }
        else
        if (this.texto.equalsIgnoreCase("e")){
           this.e++;
        }
        else
        if (this.texto.equalsIgnoreCase("i")){
            this.i++;
        }
        else
        if (this.texto.equalsIgnoreCase("o")){
              this.o++;
        }
        else
        if (this.texto.equalsIgnoreCase("u")){
            this.u++;
        }
        else
        if (!this.texto.equalsIgnoreCase("0")){
            this.cons++;
        }
            
}
        public String mostrar(){
        return "A quantidade de a é: " + this.a +
                "\nA quantidade de e é: " + this.e +
                "\nA quantidade de i é: " + this.i +
                "\nA quantidade de o é: " + this.o +
                "\nA quantidade de u é: " + this.u +
                "\nA quantidade de consoantes foi: " + this.cons; 
                
        }
        
    
}
