package PolimorfismoPt2;

public class Historico {
    private int numeroConta;
    private int tipoConta;

    public Historico(int numero, int tipo) {
        this.numeroConta = numero;
        this.tipoConta = tipo;
    }

    public void gravar() {
        System.out.println("Histórico registrado");
    }

    // Sobrecarga
    public void gravar(String descricao) {
        System.out.println("Histórico: " + descricao);
    }
}

