package PolimorfismoPt1;

public class Fisica extends Pessoa {
    private int cpf;

    public Fisica(String nome, String endereco, String telefone, int cpf) {
        super(nome, endereco, telefone);
        this.cpf = cpf;
    }

    public void gravar() {
        System.out.println("Gravando pessoa física...");
    }

    @Override
    public String toString() {
        return super.toString() + ", CPF: " + cpf;
    }
}

