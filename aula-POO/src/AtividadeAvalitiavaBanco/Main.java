package AtividadeAvalitiavaBanco;

public class Main {
    public static void main(String[] args) {
        BancoFinanceiro conta = new BancoFinanceiro("Guilherme", 123);


        conta.depositar(150);
        conta.sacar(50);


        System.out.println("Saldo atual: R$ " + conta.consultarSaldo());
    }
}
