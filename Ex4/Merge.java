package Aula0803.Ex4;
public class Merge{
    public static void merge(String[] x, int inicio, int fim) {
        int meio;
        if (inicio < fim) {
            meio = (inicio + fim) / 2;
            merge(x, inicio, meio);
            merge(x, meio + 1, fim);
            intercala(x, inicio, fim, meio);
        }
    }
    public static void intercala(String[] x, int inicio, int fim, int meio) {
        int poslivre = inicio, iniciovetor1 = inicio, iniciovetor2 = meio + 1, i;
        String[] aux = new String[x.length];
        while (iniciovetor1 <= meio && iniciovetor2 <= fim) {
            if (x[iniciovetor1].compareTo(x[iniciovetor2])< 0) {
                aux[poslivre] = x[iniciovetor1];
                iniciovetor1++;
            } else {
                aux[poslivre] = x[iniciovetor2];
                iniciovetor2++;
            }
            poslivre++;
        }
        for (i = iniciovetor1; i <= meio; i++) {
            aux[poslivre] = x[i];
            poslivre++;
        }
        for (i = iniciovetor2; i <= fim; i++) {
            aux[poslivre] = x[i];
            poslivre++;
        }
        for (i = inicio; i <= fim; i++) {
            x[i] = aux[i];
        }
    }

    public static void encontraVogal(String[] x){
        for(int i = 0;i<x.length;i++){
            char b[] = x[i].toCharArray();
            if(b[0] =='A' ||b[0] =='a' ||b[0] =='E' ||b[0] =='e' ||b[0] =='I' ||b[0] =='i' ||b[0] =='O' ||b[0] =='o' ||b[0] =='U' ||b[0] =='u'){
                System.out.print("\n");
                for(int z=0;z<b.length;z++){
                    System.out.print(b[z]);
                }                
            }
        }
    }



}