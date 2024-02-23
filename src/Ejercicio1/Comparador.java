package Ejercicio1;

import java.util.Scanner;
import Ejercicio1.ComparadorDeNumerosReales;

import java.util.Scanner;
    public class Comparador {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            //Pedir al usuario dos números;
            System.out.println("Introduce dos números");
            int a = sc.nextInt();
            int b = sc.nextInt();
            //Comparar los números y mostrar el mayor;
            ComparadorDeNumerosReales comparador = new ComparadorDeNumerosReales(a, b);
            System.out.println("El número mayor es: " + comparador.comparar());

            ComparadorDeNumerosReales igualar = new ComparadorDeNumerosReales(a, b);
            System.out.println(igualar.clasificador());
        }
    }

