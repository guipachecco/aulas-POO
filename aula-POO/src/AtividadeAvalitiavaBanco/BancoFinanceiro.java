package AtividadeAvalitiavaBanco;

public class BancoFinanceiro implements Interface {

        private String nomeCliente;
        private int numeroConta;
        private double saldo;


        public BancoFinanceiro(String nomeCliente, int numeroConta) {
            this.nomeCliente = nomeCliente;
            this.numeroConta = numeroConta;
            this.saldo = 0.0;
        }


        public String getNomeCliente() {
            return nomeCliente;
        }


        public void setNomeCliente(String nomeCliente) {
            this.nomeCliente = nomeCliente;
        }


        public int getNumeroConta() {
            return numeroConta;
        }


        public void setNumeroConta(int numeroConta) {
            this.numeroConta = numeroConta;
        }


        @Override
        public void depositar(double valor) {
            if (valor > 0) {
                saldo += valor;
                System.out.println("Depósito realizado: R$ " + valor);
            }
        }


        @Override
        public void sacar(double valor) {
            if (valor <= saldo && valor > 0) {
                saldo -= valor;
                System.out.println("Saque realizado: R$ " + valor);
            } else {
                System.out.println("Saldo insuficiente!");
            }
        }


        @Override
        public double consultarSaldo() {
            return saldo;
        }
    }


