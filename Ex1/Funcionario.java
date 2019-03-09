package Aula0803.Ex1;

public class Funcionario {
    private String nome;
    private double salario;

    Funcionario() {
    }

    Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return this.nome;
    }

    public double getSalario() {
        return this.salario;
    }

    public String toString() {
        return "Nome: " + nome + "Salario: " + salario;
    }
}