package Aula0803.Ex5;

import java.util.Random;

public class QuickTeste {
    public static void main(String[] args) {
        int[] n  = new int[1000];
        int i=0;
        Random gerador = new Random();

        while(i<1000){
            n[i] = gerador.nextInt(50);
            System.out.println( (i+1)+"  " +n[i]);
            i++;
        }

        System.out.println("Ordenando com  Quick");
        Quick.quicksort(n, 0, 999);
        i=0;
        while(i<1000){
            System.out.println(n[i]);
            i++;
        }

  
    }
}