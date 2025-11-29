package HerançaPt2;

class Aluno extends Pessoa {
    protected int matricula;
    protected String curso;


    public Aluno(String nome, int idade, String sexo, int matricula, String curso) {
        super(nome, idade, sexo);
        this.matricula = matricula;
        this.curso = curso;
    }


    public void pagarMensalidade() {
        System.out.println(nome + " pagou a mensalidade do curso de " + curso + ".");
    }


    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                ", matricula=" + matricula +
                ", curso='" + curso + '\'' +
                '}';
    }
}