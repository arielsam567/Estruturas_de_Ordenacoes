package Aula0803.Ex4;

public class MergeTest {
    public static void main(String[] args) {
        String[] p = new String[20];
        p[0] = "Ariel";
        p[1] = "Groot";
        p[2] = "Rocket";
        p[3] = "Marvel";
        p[4] = "Batam";
        p[5] = "Mantis";
        p[6] = "Essencial";
        p[7] = "Homem de ferro";
        p[8] = "Coringa";
        p[9] = "Cuba";
        p[10] = "Homem Aranha";
        p[11] = "Capitao";
        p[12] = "Hulk";
        p[13] = "Avengeros";
        p[14] = "Thanos";
        p[15] = "Tony";
        p[16] = "Viuva Negra";
        p[17] = "Ego";
        p[18] = "Drax";
        p[19] = "Flash";

        System.out.println("Ordem Alfabetica");
        Merge.merge(p, 0, 19);
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);
        }

        System.out.println("\n\nPalavras Iniciadas com vogal");
        Merge.encontraVogal(p);
    }

}