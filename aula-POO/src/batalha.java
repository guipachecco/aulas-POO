import java.util.concurrent.ThreadLocalRandom;
public class batalha {
    private Atirador atiradorA;
    private Atirador atiradorB;
    private double poderdeFOgoA;
    private double poderdeFOgoB;

    public batalha(Atirador atiradorA, Atirador atiradorB) {
        this.atiradorA = atiradorA;
        this.atiradorB = atiradorB;
    }

    public Atirador getAtiradorA() {
        return atiradorA;
    }

    public void setAtiradorA(Atirador atiradorA) {
        this.atiradorA = atiradorA;
    }

    public Atirador getAtiradorB() {
        return atiradorB;
    }

    public void setAtiradorB(Atirador atiradorB) {
        this.atiradorB = atiradorB;
    }

    public void batalhar() {
        System.out.println("-----------");


        poderdeFOgoA = atiradorA.getPrecisao() * ThreadLocalRandom.current().nextInt(5, 10);
        poderdeFOgoB = atiradorB.getPrecisao() * ThreadLocalRandom.current().nextInt(5, 10);

        System.out.printf("Poder de fogo %s: %.2f\n", atiradorA.getNome(), poderdeFOgoA);
        System.out.printf("Poder de fogo %s: %.2f\n", atiradorB.getNome(), poderdeFOgoB);

        System.out.println("-----------");

        double diferenca = Math.abs(poderdeFOgoA - poderdeFOgoB);

        if (diferenca < 5){
            System.out.println("Empate contabilizado");
            atiradorA.registrarempate();
            atiradorB.registrarempate();

        }

        if (poderdeFOgoB > poderdeFOgoA){
            System.out.println("O " + getAtiradorB().getNome() + " amassou o " + getAtiradorA().getNome());
            atiradorB.registrodevitorias();
            atiradorA.registrarderrota();
            System.out.println("----------------");
        }
        else if (poderdeFOgoA > poderdeFOgoB){
            System.out.println("O " + atiradorA.getNome() + " amassou o " + atiradorB.getNome());
            atiradorA.registrodevitorias();
            atiradorB.registrarderrota();
            System.out.println("----------------");

        }



    }

}
