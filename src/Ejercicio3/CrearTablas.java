package Ejercicio3;

public class CrearTablas {
    public static void main(String[] args) {
        CreadorTablas tabla[] = new CreadorTablas[]{new CreadorTablas(10, 1, 100)};
        tabla.add(Random(10, 1, 100));

        AnalisisMayor mayor = new AnalisisMayor(tabla);
        mayor = tabla[0];
        for(int i = 0; i < tabla.length; i++){
            if(tabla[i] > mayor){
                mayor = tabla[i];
            }
        }

        tabla=Random(10, 1, 100);
        mayor=getMayor(tabla);
        System.out.println("El mayor es: " + mayor);


    }
}
