package Ejercicio3;

public class CrearTablas {
    public static void main(String[] args) {
        CreadorTablas creadorTablas = new CreadorTablas(10, 1, 100);
        int[] tabla = creadorTablas.crearTabla();

        AnalisisMayor analisisMayor = new AnalisisMayor(tabla);
        int mayor = analisisMayor.getMayor();

        System.out.println("El número mayor es: " + mayor);


    }
}
