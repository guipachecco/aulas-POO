//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // atividade 1
        Scanner caixadeTexto = new Scanner(System.in);
        int idade;
        String nome;
        double altura = 1.74;
        boolean vivo = true;
        System.out.println("insira sua idade: ");

        idade = caixadeTexto.nextInt();

        System.out.println("Sua idade é: " + idade);

        caixadeTexto.nextLine();

        System.out.println("Insira seu nome: ");

        nome = caixadeTexto.nextLine();

        System.out.println("Seu nome é: " + nome);

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Guilherme");
        nomes.add("Vinivius");
        nomes.add("Ricardo");

        System.out.println("nomes são: " + nomes);
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println("nome = " + nomes.get(i));
        }

        // referente a objetos

        Objetos_n1 janela = new Objetos_n1();
        janela.material = "Inox";
        janela.tamanhoAlturaemCM = 50;
        janela.tamaLarguraemCM = 43.5;





    }
}