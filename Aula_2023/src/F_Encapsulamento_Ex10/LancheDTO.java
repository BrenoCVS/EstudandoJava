package F_Encapsulamento_Ex10;

public class LancheDTO {
    private int cod;
    private int hamb, cheese, misto, ameri, queijo;
    private double total;

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getHamb() {
        return hamb;
    }

    public void setHamb(int hamb) {
        this.hamb = hamb;
    }

    public int getCheese() {
        return cheese;
    }

    public void setCheese(int cheese) {
        this.cheese = cheese;
    }

    public int getMisto() {
        return misto;
    }

    public void setMisto(int misto) {
        this.misto = misto;
    }

    public int getAmeri() {
        return ameri;
    }

    public void setAmeri(int ameri) {
        this.ameri = ameri;
    }

    public int getQueijo() {
        return queijo;
    }

    public void setQueijo(int queijo) {
        this.queijo = queijo;
    }


    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
    
}
