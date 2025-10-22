import java.util.Random;
import java.util.Scanner;

public class pedrapapeltesoura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Escolha 1- Pedra, 2- Papel, 3- Tesoura");
        int jogador = entrada.nextInt();

        int maquina = random.nextInt(3) + 1;

        System.out.println("Você escolheu: " + jogador);
        System.out.println("A máquina escolheu : " + maquina);

        if (jogador > 3 || maquina > 3){
            System.out.println("Opção Inválida!");
            System.exit(0);
        }

        if (jogador == maquina){
            System.out.println("Empate! tente novamente");

        } else if ((jogador == 1 && maquina == 2 ||
                jogador == 2 && maquina == 1 ||
                jogador == 3 && maquina == 2)) {
            System.out.println("Você venceu!");
        } else {
            System.out.println("Máquina venceu!");
        }

        entrada.close();


    }
}
