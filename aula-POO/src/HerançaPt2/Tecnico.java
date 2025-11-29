package HerançaPt2;

class Tecnico extends Aluno {
    private int registroProfissional;


    public Tecnico(String nome, int idade, String sexo, int matricula, String curso, int registroProfissional) {
        super(nome, idade, sexo, matricula, curso);
        this.registroProfissional = registroProfissional;
    }


    public void praticar() {
        System.out.println(nome + " está praticando sua especialidade!");
    }


    @Override
    public String toString() {
        return "Tecnico{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                ", matricula=" + matricula +
                ", curso='" + curso + '\'' +
                ", registroProfissional=" + registroProfissional +
                '}';
    }
}
