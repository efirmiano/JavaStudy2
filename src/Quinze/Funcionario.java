package Quinze;

public class Funcionario {
    int id;
    String nome;

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    String cargo;
    double salario;
    public Funcionario(int id, String nome, String cargo, double salario){
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.salario=salario;


    }
}
