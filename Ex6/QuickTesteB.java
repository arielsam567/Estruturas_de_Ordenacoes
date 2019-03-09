package Aula0803.Ex6;

import java.util.Random;

public class QuickTesteB {
    public static void main(String[] args) {
        String[] n = new String[100];
        int i = 0;
        String letras = "ABCDEFGHIJKLMNOPQRSTUVYWXZ";
        String letrasb = "qwertyuioplmkjnbhgvcfxdzsa";
        Random random = new Random();

        int index = -1;
        for (int k = 0; k < 100; k++) {
            index = random.nextInt(letras.length());
            n[k] = letras.substring(index, index + 1);
            n[k] += letrasb.substring(index, index + 1);

            System.out.println(n[k]);
        }

        System.out.println("Ordenando com  Quick");
        QuickB.quicksort(n, 0, 99);
        i = 0;
        while (i < 100) {
            System.out.println(n[i]);
            i++;
        }

    }
}