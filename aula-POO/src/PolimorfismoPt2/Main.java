package PolimorfismoPt2;

public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Fisica("Guilherme", "Rua A", "9999-0000", 123456);
        Pessoa p2 = new Juridica("Empresa X", "Rua B", "8888-2222", 987654);

        Comum c1 = new Comum(1, 1, p1);
        Especial c2 = new Especial(2, 2, p2, 500);

        c1.depositar(200);
        c1.depositar(100, "PIX");

        c1.sacar(50);
        c1.sacar(50, 2);

        c2.sacar(300, true);

        Historico h = new Historico(1, 1);
        h.gravar();
        h.gravar("Depósito realizado");

        System.out.println("\n" + c1);
        System.out.println(c2);
    }
}
