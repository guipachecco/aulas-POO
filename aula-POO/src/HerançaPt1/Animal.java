package HerançaPt1;

public class Animal {
    protected String nome;
    protected int idade;


    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }


    public void fazerSom() {
        System.out.println(nome + " fez um som.");
    }


    public void mover() {
        System.out.println(nome + " está se movendo.");
    }
}

