package PolimorfismoPt2;

public class Pessoa {
    protected String nome;
    protected String endereco;
    protected String telefone;

    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                ", Endereço: " + endereco +
                ", Telefone: " + telefone;
    }
}

