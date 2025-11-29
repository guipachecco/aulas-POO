package PolimorfismoPt2;

public class Fisica extends Pessoa {
    private int cpf;

    public Fisica(String nome, String endereco, String telefone, int cpf) {
        super(nome, endereco, telefone);
        this.cpf = cpf;
    }

    // Polimorfismo por sobrecarga
    public void gravar() {
        System.out.println("Gravando pessoa física...");
    }

    public void gravar(String mensagem) {
        System.out.println("Gravando PF: " + mensagem);
    }

    @Override
    public String toString() {
        return super.toString() + ", CPF: " + cpf;
    }
}

