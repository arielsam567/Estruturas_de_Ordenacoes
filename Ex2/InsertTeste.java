package Aula0803.Ex2;

public class InsertTeste {
    public static void main(String[] args) {
        int[] numero = new int[15];
        for(int i=0;i<15;i++){
            numero[i] = (i+1);
        }
        numero[14] = 25;
        numero[1] = 25;
        numero[7] = 25;
        
        Insert.insert(numero);
        Insert.maiorNumero(numero);



        
    }
}