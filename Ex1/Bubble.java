package Aula0803.Ex1;

public class Bubble {

    public static void crescente(double[] x,String[] nome) {
        int qtd = x.length;
        int n, i,troca;
        double aux;
        String auxNome;
        n = 1;
        troca = 1;
        while (n <=qtd && troca == 1) {
            troca = 0;
            for (i = 0; i <qtd-1; i++) {
                if (x[i] > x[i + 1]) {
                    troca = 1;
                    aux = x[i];
                    auxNome = nome[i];
                    x[i] = x[i + 1];
                    nome[i] = nome[i + 1];
                    x[i + 1] = aux;
                    nome[i + 1] = auxNome;
                }
            }
            n = n + 1;
        }
        for (i = 0; i <qtd; i++) {
            System.out.println((i + 1) + "° número: " + x[i] + ", Nome : " + nome[i]);
        }
    }

    public static void decrescente(double[] x,String[] nome) {
        int qtd = x.length;
        int n, i,troca;
        double aux;
        String auxNome;
        n = 1;
        troca = 1;
        while (n <=qtd && troca == 1) {
            troca = 0;
            for (i = 0; i <qtd-1; i++) {
                if (x[i] < x[i + 1]) {
                    troca = 1;
                    aux = x[i];
                    auxNome = nome[i];
                    x[i] = x[i + 1];
                    nome[i] = nome[i + 1];
                    x[i + 1] = aux;
                    nome[i + 1] = auxNome;
                }
            }
            n = n + 1;
        }
        for (i = 0; i <qtd; i++) {
            System.out.println((i + 1) + "° número: " + x[i] + ", Nome : " + nome[i]);
        }
    }

    public static void alfabetica(double[] x, String[] n){
        double aux;    

                  for (int i=0; i<n.length-1; i++){
                    for (int t = 0; t <=n.length-2; t++) {   
                        if ((n[t+1].compareTo(n[t]) < 0 )){   
                            String temp = n[t];  
                            n [t] = n[t+1];
                            n[t+1] = temp;
                            aux = x[t];                   
                            x[t] = x[t + 1];                    
                            x[t + 1] = aux;
                        }
                    }    
                }
         
		for (int i = 0; i < n.length-1; i++) {
			System.out.println("Nome: " + n[i]+ " , Salario: " + x[i]);
		}
    }

}