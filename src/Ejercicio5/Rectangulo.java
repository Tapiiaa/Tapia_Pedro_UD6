package Ejercicio5;

public class Rectangulo{
    private char[][] lienzo;
    private int longitudLado;
    private int altura;
    private int base;
    private char caracter;

    public Rectangulo(int longitudLado, int altura, int base, char caracter) {
        this.longitudLado = longitudLado;
        this.altura = altura;
        this.base = base;
        this.caracter = caracter;
        lienzo = new char[altura][base];
    }

    public void dibujarRectangulo() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == altura - 1 || j == 0 || j == base - 1) {
                    lienzo[i][j] = caracter;
                } else {
                    lienzo[i][j] = ' ';
                }
            }
        }
    }

    public void mostrarLienzo() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print(lienzo[i][j]);
            }
            System.out.println();
        }
    }

}
