package HerançaPt2;

class Bolsista extends Aluno {
    private double bolsa;


    public Bolsista(String nome, int idade, String sexo, int matricula, String curso, double bolsa) {
        super(nome, idade, sexo, matricula, curso);
        this.bolsa = bolsa;
    }


    public void renovarBolsa() {
        System.out.println(nome + " renovou a bolsa de R$" + bolsa + ".");
    }


    @Override
    public void pagarMensalidade() {
        System.out.println(nome + " pagou mensalidade com desconto de bolsista!");
    }


    @Override
    public String toString() {
        return "Bolsista{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                ", matricula=" + matricula +
                ", curso='" + curso + '\'' +
                ", bolsa=" + bolsa +
                '}';
    }
}