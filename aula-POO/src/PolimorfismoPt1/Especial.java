package PolimorfismoPt1;

public class Especial extends ContaComum {
    private int limite;

    public Especial(int numero, int tipo, Pessoa titular, int limite) {
        super(numero, tipo, titular);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo + limite) {
            saldo -= valor;
            System.out.println("Saque especial realizado: R$" + valor);
        } else {
            System.out.println("Limite insuficiente!");
        }
    }
}

