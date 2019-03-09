package Aula0803.Ex3;
public class Select{

    public static void select(int[] x){
        int qtd = x.length;
        int  j, eleito, menor, pos;

        for (int i = 0; i <qtd-1; i++) {
            eleito = x[i];
            menor = x[i + 1];
            pos = i + 1;
            for (j = i + 2; j <qtd; j++) {
                if (x[j] < menor) {
                    menor = x[j];
                    pos = j;
                }
            }
            if (menor < eleito) {
                x[i] = x[pos];
                x[pos] = eleito;
            }
        }

 
        for (int i = 0; i < qtd; i++) {
            System.out.println((i + 1) + "° número: " + x[i]);
        }
    }

    public static void maiorNumero(int[] x){
        int maior = x[0];
        int freq = 0;
        for(int i =0;i<x.length;i++){
            if(x[i]>maior){
                maior = x[i];
            }
        }
        for(int i =0;i<x.length;i++){
            if(maior == x[i]){
                freq++;
            }
        }
        
        System.out.println("Maior numero : " + maior + " ,Frenquencia: " + freq);
    }

}