package Ejercicio3;

public class AnalisisMayor {
    int mayor;
    int menor;

    public AnalisisMayor(int[] tabla) {
        mayor = tabla[0];
        menor = tabla[0];
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] > mayor) {
                mayor = tabla[i];
            }
            if (tabla[i] < menor) {
                menor = tabla[i];
            }
        }
    }
    //Encontrar el numero mayor en la tabla
    public int getMayor() {
        return mayor;
    }

}

