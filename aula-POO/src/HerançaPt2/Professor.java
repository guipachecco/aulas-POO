package HerançaPt2;

class Professor extends Pessoa {
    private String especialidade;
    private double salario;


    public Professor(String nome, int idade, String sexo, String especialidade, double salario) {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }


    public void receberAumento(double aumento) {
        salario += aumento;
        System.out.println(nome + " recebeu aumento! Novo salário: R$" + salario);
    }


    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                ", especialidade='" + especialidade + '\'' +
                ", salario=" + salario +
                '}';
    }
}