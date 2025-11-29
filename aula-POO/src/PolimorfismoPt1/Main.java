package PolimorfismoPt1;

public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Fisica("Guilherme", "Rua A", "99999-0000", 123456789);
        ContaComum cc = new ContaComum(1, 1, p1);

        cc.depositar(200);
        cc.sacar(50);

        Historico h = new Historico(1, 1);
        h.gravar();

        System.out.println(cc);
    }
}
