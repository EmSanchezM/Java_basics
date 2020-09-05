package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    // Algoritmo de insercion - Insertion Sort
        int arrayOrdenar[] = {5,2,4,6,1,3,8,10,11,15,9,13,21,26,30};
        int[] ordenado, ordenado_random, ordenado_shell, ordenado_shell_random;
        int arrayAleatorio[] = new int[101];
        int numAleatorios;
        Ordenamiento ordenador = new Ordenamiento();

        for(int j=0; j<=100; j++){
            numAleatorios = (int) (Math.random()*50)+(j+1);
            arrayAleatorio[j] = numAleatorios;
        }
        /*Pocos datos*/
        System.out.println("-----------------ORDENAMIENTO INSERTION SORT (NUM MINIMOS)--------------------");
        ordenado = ordenador.insertion_sort(arrayOrdenar);
        ordenador.mostrarArray(ordenado);
        System.out.println();
        System.out.println("-----------------ORDENAMIENTO INSERTION SORT (RANDOM)--------------------");
        /*10000 datos aleatorios*/
        ordenado_random = ordenador.insertion_sort(arrayAleatorio);
        ordenador.mostrarArray(ordenado_random);
        System.out.println();
        System.out.println("-----------------ORDENAMIENTO SHELL (NUM MINIMOS)--------------------");
        ordenado_shell = ordenador.ordering_shell(arrayOrdenar);
        ordenador.mostrarArray(ordenado_shell);
        System.out.println();
        System.out.println("-----------------ORDENAMIENTO SHELL (RANDOOM)--------------------");
        ordenado_shell_random = ordenador.ordering_shell(arrayAleatorio);
        ordenador.mostrarArray(ordenado_shell_random);
    }
}
