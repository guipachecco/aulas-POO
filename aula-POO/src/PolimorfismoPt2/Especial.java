package PolimorfismoPt2;

public class Especial extends Comum {
    private int limite;

    public Especial(int numero, int tipo, Pessoa titular, int limite) {
        super(numero, tipo, titular);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo + limite) {
            saldo -= valor;
            System.out.println("Saque especial: R$" + valor);
        } else {
            System.out.println("Limite insuficiente!");
        }
    }

    // Sobrecarga
    public void sacar(double valor, boolean usarLimite) {
        if (usarLimite) {
            if (valor <= saldo + limite) {
                saldo -= valor;
                System.out.println("Saque usando limite autorizado: R$" + valor);
            } else {
                System.out.println("Limite insuficiente!");
            }
        } else {
            super.sacar(valor);
        }
    }
}

