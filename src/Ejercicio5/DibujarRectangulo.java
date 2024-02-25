package Ejercicio5;

public class DibujarRectangulo {
    int alto;
    int ancho;
    char caracter;

    public DibujarRectangulo(int alto, int ancho, char caracter) {
        this.alto = alto;
        this.ancho = ancho;
        this.caracter = caracter;

    }

    public void dibujarRectangulo(){
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print(caracter);
            }
            System.out.println("");
        }
    }
}
