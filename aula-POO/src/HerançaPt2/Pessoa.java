package HerançaPt2;

class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;


    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }


    public void fazerAniversario() {
        idade++;
        System.out.println(nome + " fez aniversário! Agora tem " + idade + " anos.");
    }


    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
