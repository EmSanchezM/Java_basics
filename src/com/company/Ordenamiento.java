package com.company;

import java.util.ArrayList;

public class Ordenamiento {
    public int arrayOrdenar[];

    public Ordenamiento(){ }

    protected int[] insertion_sort(int[] list_order){
        int key = 0, i = 0, j = 0;
        for (i=1; i<list_order.length; i++){
            key = list_order[i];
            j = i-1;
            while(j>=0 && list_order[j]>key){
                list_order[j+1] = list_order[j];
                j--; /*j = j-1;*/
            }
            list_order[j+1] = key;
        }
        this.arrayOrdenar = list_order;
        return this.arrayOrdenar;
    }

    protected boolean esMultiplo(int num){
        if(num%10 == 0){
            return true;
        }else{
            return false;
        }
    }

    protected void mostrarArray(int[] list_order){
        String list_show = "";
        for (int i=0; i<=list_order.length-1; i++){
            if(esMultiplo(i)){
                list_show += "\n";
            }
            list_show += list_order[i]+",";
        }
        System.out.print(list_show);
    }

}
