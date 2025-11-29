package HerançaPt1;

public class Main {
    public static void main(String[] args) {
        Mamifero m = new Mamifero("Cachorro", 5);
        Ave a = new Ave("Papagaio", 2);
        Peixe p = new Peixe("Dourado", 1);


        m.fazerSom();
        m.mover();
        m.amamentar();


        System.out.println();


        a.fazerSom();
        a.mover();
        a.voar();


        System.out.println();


        p.fazerSom();
        p.mover();
        p.nadar();
    }
}
