package PolimorfismoPt2;

public class Poupanca extends Comum {
    private int dataAniversario;

    public Poupanca(int numero, int tipo, Pessoa titular, int dataAniversario) {
        super(numero, tipo, titular);
        this.dataAniversario = dataAniversario;
    }
}

