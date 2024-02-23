package Ejercicio2;
//Tocado y Hundido
import java.util.Scanner;
public class Juego {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tablero tablero = new Tablero(10, 10);
        System.out.println("Jugador 1, coloca 1 barco");
        System.out.println("Indica, en orden: Tamaño del barco, fila a colocar, columna a colocar");
        System.out.println("Indica las posiciones");
        int tamañobarco = sc.nextInt();
        int orientacion = 1;
        int fila = sc.nextInt();
        int columna = sc.nextInt();
        Barco barco1 = new Barco(tamañobarco, orientacion, fila, columna);

        //Marcar con un 1 la posicion de barco1 en el tablero
        for(int i = 0; i < tamañobarco; i++){
            if(orientacion == 1){
                tablero.tablero[fila][columna + i] = 1;
            }else{
                tablero.tablero[fila + i][columna] = 1;
            }
        }
        tablero.imprimirTablero(barco1);


        System.out.println("Jugador 2, intenta hundir los barcos");
        System.out.println("Indica las posiciones");
        int fila2 = sc.nextInt();
        int columna2 = sc.nextInt();
        if(fila2==fila && columna2==columna) {
            System.out.println("Tocado");
        }
        else {
            System.out.println("Agua");
        }
        if(fila2!=fila && columna2!=columna){
            System.out.println("Agua, intentelo de nuevo");
        }









    }
}

