package Ejercicio3;

import java.util.Random;

public class CreadorTablas {
    private int tamano;
    private int mínimo;
    private int máximo;

    public CreadorTablas(int tamano, int mínimo, int máximo) {
        this.tamano = tamano;
        this.mínimo = mínimo;
        this.máximo = máximo;
    }

    public int[]crearTabla(){
        int[] tabla = new int[tamano];
        Random rnd = new Random();
        for(int i = 0; i < tabla.length; i++){
            tabla[i] = rnd.nextInt(máximo - mínimo + 1) + mínimo;
        }
        return tabla;
    }
    }


