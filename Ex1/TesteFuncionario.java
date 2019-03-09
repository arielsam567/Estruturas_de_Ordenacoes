package Aula0803.Ex1;

import java.util.ArrayList;


public class TesteFuncionario {

    public static void main(String[] args) {
        String[] n = new String[10];
        double[] s = new double[10];
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        int i = 0;
        funcionarios.add(new Funcionario("Ariel", 1000));
        funcionarios.add(new Funcionario("Banara", 5));
        funcionarios.add(new Funcionario("Pera", 1587454));
        funcionarios.add(new Funcionario("Mouse", 320));
        funcionarios.add(new Funcionario("Agua", 5));
        funcionarios.add(new Funcionario("Penal", 8));
        funcionarios.add(new Funcionario("Estojo", 1502));
        funcionarios.add(new Funcionario("Lapis", 1452));
        funcionarios.add(new Funcionario("Caneta", 158745));
        funcionarios.add(new Funcionario("Pc", 881));

        for (Funcionario f : funcionarios) {
            System.out.println("Funcionario " + f.getNome() + ", Salario = " + f.getSalario());
            n[i] = f.getNome();
            s[i] = f.getSalario();
            i++;
        }
        System.out.println("\nOrdem Crescente");
        Bubble.crescente(s, n);
        System.out.println("\nOrdem Descrescente");
        Bubble.decrescente(s, n);
        System.out.println("\nOrdem Alfabetica");
        Bubble.alfabetica(s, n);

    }
}