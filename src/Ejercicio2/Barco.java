package Ejercicio2;

public class Barco implements Disparar{
    int tamanio;
    int orientacion;
    int fila;
    int columna;

    public Barco(int tamanio, int orientacion, int fila, int columna) {
        this.tamanio = tamanio;
        this.orientacion = orientacion;
        this.fila = fila;
        this.columna = columna;
    }


    @Override
    public int disparar(int fila, int columna) {
        return 0;
    }
}
