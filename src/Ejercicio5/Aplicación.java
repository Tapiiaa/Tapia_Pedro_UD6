package Ejercicio5;

public class Aplicación {
    private Lienzo lienzo = new Lienzo(10, 10);

    Menu menu = new Menu();
    //Esta es la clase que va a tener el main
    public static void main(String[] args) {
        Lienzo lienzo = new Lienzo(10, 10);

        Menu menu = new Menu();
        menu.mostrarMenu();
    }
}
