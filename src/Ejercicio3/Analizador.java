package Ejercicio3;

public class Analizador {
    public static void main(String[] args) {
        //Creación de la tabla
        CreadorTablas creadorTablas = new CreadorTablas(10, 1, 100);
        int[] tabla = creadorTablas.crearTabla();
        //Análisis de la tabla
        AnalisisMayor analisisMayor = new AnalisisMayor(tabla);
        int mayor = analisisMayor.getMayor();
        for(int valor: tabla){
            System.out.println(valor);
        }
        System.out.println("El número mayor es: " + mayor);
    }
}
