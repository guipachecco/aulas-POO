package PolimorfismoPt1;

public class Juridica extends Pessoa {
    private int cnpj;

    public Juridica(String nome, String endereco, String telefone, int cnpj) {
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
    }

    public void gravar() {
        System.out.println("Gravando pessoa jurídica...");
    }

    @Override
    public String toString() {
        return super.toString() + ", CNPJ: " + cnpj;
    }
}
