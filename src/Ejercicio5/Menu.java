package Ejercicio5;
import java.util.Scanner;
public class Menu{
    //Clase para solo definir el menú que aparecerá en la clase Aplicación
    private int opcion;
    public void mostrarMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una opción:");
        System.out.println("1. Dibujar un rectángulo. NORMAS: El alto y ancho no pueden ser mayores a 10.");
        System.out.println("2. Salir");
        int eleccion = scanner.nextInt();
        if(eleccion== 1){
            System.out.println("Ingrese el alto del rectángulo");
            int alto = scanner.nextInt();
            if(alto>10){
                System.out.println("El alto no puede ser mayor a 10");
                return;
            }
            System.out.println("Ingrese el ancho del rectángulo");
            int ancho = scanner.nextInt();
            if(ancho>10){
                System.out.println("El ancho no puede ser mayor a 10");
                return;
            }
            System.out.println("Ingrese el caracter con el que se dibujará el rectángulo");
            char caracter = scanner.next().charAt(0)
            ;
            DibujarRectangulo dibujarRectangulo = new DibujarRectangulo(alto, ancho, caracter);
            dibujarRectangulo.dibujarRectangulo();


        }
        if(eleccion == 2){
            System.out.println("2. Salir");
        }
        if(eleccion!= 1 && eleccion != 2){
            System.out.println("Opción no válida");
        }

    }
}
