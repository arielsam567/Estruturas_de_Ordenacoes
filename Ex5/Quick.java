package Aula0803.Ex5;
public class Quick{
    public static void quicksort(int[] vet, int ini, int fim) {
        int meio;

        if (ini < fim) {
            meio = partition(vet, ini, fim);
            quicksort(vet, ini, meio);
            quicksort(vet, meio + 1, fim);
        }
    }

    public static int partition(int[] vet, int ini, int fim) {
        int pivo, topo, i;
        pivo = vet[ini];
        topo = ini;

        for (i = ini + 1; i <= fim; i++) {
            if (vet[i] < pivo) {
                vet[topo] = vet[i];
                vet[i] = vet[topo + 1];
                topo++;
            }
        }
        vet[topo] = pivo;
        return topo;
    }


    
}