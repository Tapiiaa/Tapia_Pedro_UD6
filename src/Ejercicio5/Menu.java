package Ejercicio5;
import java.util.Scanner;
import org.w3c.dom.ls.LSOutput;

public class Menu {



        Lienzo lienzo = new Lienzo(5, 5, 5, '*');
//Opcion = mostrarMenu();


        public void seleccionarOpcion ( int opcion) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Elige una opcion");
            System.out.println("1. Dibujar rectangulo");
            System.out.println("2. Salir");
            int eleccion2 = scanner.nextInt();
            if (eleccion2 == 1) {
                lienzo.dibujarRectangulo();
                lienzo.mostrarLienzo();
            }
            if (eleccion2 == 2) {
                System.out.println("Adios");
                scanner.close();
            }
            if (eleccion2 != 1 && eleccion2 != 2) {
                System.out.println("Opcion no valida");
            }


        }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.seleccionarOpcion(1);
    }

    }



