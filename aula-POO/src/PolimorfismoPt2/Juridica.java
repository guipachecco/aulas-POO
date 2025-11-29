package PolimorfismoPt2;

public class Juridica extends Pessoa {
    private int cnpj;

    public Juridica(String nome, String endereco, String telefone, int cnpj) {
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
    }

    // Sobrecarga
    public void gravar() {
        System.out.println("Gravando pessoa jurídica...");
    }

    public void gravar(int prioridade) {
        System.out.println("Gravando PJ com prioridade " + prioridade);
    }

    @Override
    public String toString() {
        return super.toString() + ", CNPJ: " + cnpj;
    }
}

