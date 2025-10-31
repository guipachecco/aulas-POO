public class Atirador {
    private int abates;
    private String nome;
    private String Arma;
    private String nacionalidade;
    private int derrotas;
    private int vitorias;
    private int empate;
    private double precisao;

    public Atirador(String nome, String arma, String nacionalidade, double precisao) {
        this.nome = nome;
        Arma = arma;
        this.nacionalidade = nacionalidade;
        this.abates = 0;
        this.empate = 0;
        this.vitorias = 0;
        this.derrotas = 0;
        this.precisao = precisao;
    }
    public double getPrecisao(){
        return precisao;
    }

    public void setPrecisao(double precisao) {
        this.precisao = precisao;
    }

    public int getAbates() {
        return abates;
    }

    public void setAbates(int abates) {
        this.abates = abates;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArma() {
        return Arma;
    }

    public void setArma(String arma) {
        Arma = arma;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }

    public void atirar() {
        System.out.println(nome + "Atirou com sua arma"+  Arma );

    }
    public void registrodevitorias() {
        setVitorias(getVitorias()+ 1);
        System.out.println(nome + " Foi derrotado  total de derrotas: " + derrotas);
    }
    public void registrarderrota() {
        setDerrotas(getDerrotas()+ 1);
        System.out.println(nome + " Foi derrotado  total de derrotas " + derrotas);
    }
    public void registrarempate() {
        setEmpate(getEmpate()+ 1);
        System.out.println("A batalha terminou empatada  total de empates: " + empate);
    }
    public void status() {
        System.out.println("Nome: " + getNome());
        System.out.println("Vitórias: " + getVitorias());
        System.out.println("Derrotas: " + getDerrotas());
        System.out.println("Nacionalidade: " + getNacionalidade());
        System.out.println("Arma: " + getArma());
    }

}
