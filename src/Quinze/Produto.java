package Quinze;

public class Produto {
    public String getNome() {
        return nome;
    }
    public String gettipo() {
        return tipo;
    }
    public double getvalor() {
        return valor;
    }
    String nome,tipo;
    double valor;
    public Produto(String nome, String tipo, double valor){
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;




    }
}
