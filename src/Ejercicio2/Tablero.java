package Ejercicio2;

public class Tablero {
    int[][] tablero;
    private int filas;
    private int columnas;

    public Tablero(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        tablero = new int[filas][columnas];
    }

    public void imprimirTablero(Barco barco1){
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int disparar(int fila, int columna) {
return 0;


    }
}

