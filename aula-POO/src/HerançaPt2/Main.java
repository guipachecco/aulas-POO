package HerançaPt2;

public class Main {
    public static void main(String[] args) {
        Visitante v = new Visitante("Carlos", 22, "M");
        Professor p = new Professor("Marcos", 45, "M", "Matemática", 5000);
        Aluno a = new Aluno("Julia", 19, "F", 123, "Informática");
        Bolsista b = new Bolsista("Igor", 20, "M", 321, "ADS", 800);
        Tecnico t = new Tecnico("Rafa", 25, "F", 456, "Redes", 9087);


        System.out.println(v);
        System.out.println(p);
        System.out.println(a);
        System.out.println(b);
        System.out.println(t);


        System.out.println();
        p.receberAumento(500);
        a.pagarMensalidade();
        b.renovarBolsa();
        t.praticar();
        v.fazerAniversario();
    }
}
