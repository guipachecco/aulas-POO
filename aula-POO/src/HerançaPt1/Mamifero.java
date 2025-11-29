package HerançaPt1;

class Mamifero extends Animal {
    public Mamifero(String nome, int idade) {
        super(nome, idade);
    }


    public void amamentar() {
        System.out.println(nome + " está amamentando.");
    }
}
