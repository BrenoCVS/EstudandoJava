
package C_For_Ex02;


public class Tabuada {
    private int numero;
    private String resposta="";
    public String calcularTabuada(int numero){
        this.numero = numero;
        
        for(int cont=1; cont<=10;cont++){
            this.resposta += this.numero + " X " + cont + " = " + (this.numero*cont) + "\n";
            //this.resposta= this.resposta + this.numero + " X " + cont + " = " + (this.numero*cont) + "\n";
        }
        return this.resposta;
    }
    
}
