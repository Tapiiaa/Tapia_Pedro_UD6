package Ejercicio1;

public class ComparadorDeNumerosReales{
    private int a;
    private int b;

    public ComparadorDeNumerosReales(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int comparar(){
        if (a > b){
            return a;
        } else {
            return b;
        }
    }

}
