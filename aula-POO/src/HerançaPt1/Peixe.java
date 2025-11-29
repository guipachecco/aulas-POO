package HerançaPt1;

class Peixe extends Animal {
    public Peixe(String nome, int idade) {
        super(nome, idade);
    }


    public void nadar() {
        System.out.println(nome + " está nadando.");
    }
}
