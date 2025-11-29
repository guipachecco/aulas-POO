package PolimorfismoPt2;

public class Comum {
    protected int numero;
    protected double saldo;
    protected int tipo;
    protected Pessoa titular;

    public Comum(int numero, int tipo, Pessoa titular) {
        this.numero = numero;
        this.tipo = tipo;
        this.titular = titular;
        this.saldo = 0;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado.");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    // Sobrecarga (polimorfismo)
    public void sacar(double valor, double taxa) {
        double total = valor + taxa;
        if (total <= saldo) {
            saldo -= total;
            System.out.println("Saque com taxa realizado. Total: R$" + total);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor);
    }

    // Sobrecarga
    public void depositar(double valor, String origem) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " recebido de " + origem);
    }

    @Override
    public String toString() {
        return "Conta nº " + numero + " | Saldo: R$" + saldo +
                " | Tipo: " + tipo + " | Titular: " + titular.nome;
    }
}
