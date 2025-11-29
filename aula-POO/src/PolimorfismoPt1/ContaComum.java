package PolimorfismoPt1;

public class ContaComum {
    protected int numero;
    protected double saldo;
    protected int tipo;
    protected Pessoa titular;

    public ContaComum(int numero, int tipo, Pessoa titular) {
        this.numero = numero;
        this.tipo = tipo;
        this.saldo = 0;
        this.titular = titular;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado: R$" + valor);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado: R$" + valor);
    }

    @Override
    public String toString() {
        return "Conta nº " + numero + " | Saldo: R$" + saldo +
                " | Tipo: " + tipo + " | Titular: " + titular.nome;
    }
}
