package Aula0803.Ex6;
public class QuickB{
    public static void quicksort(String[] vet, int ini, int fim) {
        int meio;

        if (ini < fim) {
            meio = partition(vet, ini, fim);
            quicksort(vet, ini, meio);
            quicksort(vet, meio + 1, fim);
        }
    }

    public static int partition(String[] vet, int ini, int fim) {
        int  topo, i;
        String pivo;
        pivo = vet[ini];
        topo = ini;

        for (i = ini + 1; i <= fim; i++) {
            if (vet[i].compareTo(pivo)< 0) {
                vet[topo] = vet[i];
                vet[i] = vet[topo + 1];
                topo++;
            }
        }
        vet[topo] = pivo;
        return topo;
    }


    
}