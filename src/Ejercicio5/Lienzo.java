package Ejercicio5;

public class Lienzo {
    private int ancho;
    private int alto;
    //Atributo matriz del estado del lienzo.
    private char[][] matriz;

    public Lienzo(int ancho, int alto){
        this.ancho = ancho;
        this.alto = alto;
        matriz = new char[alto][ancho];
    }


}
