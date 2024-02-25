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

    public void inicializarLienzo(){
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                matriz[i][j] = ' ';
            }
        }
    }

    public void dibujarLineaHorizontal(int x, int y, int ancho, char caracter){
        for (int i = 0; i < ancho; i++) {
            matriz[y][x+i] = caracter;
        }
    }


}
