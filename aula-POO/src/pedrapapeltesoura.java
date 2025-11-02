import java.util.Random;
import java.util.Scanner;

public class pedrapapeltesoura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        String gestoJogador = "";
        String gestoMaquina = "";
        boolean verifica = false;
        int maquina = random.nextInt(3) + 1;
        int jogador = 1;

        while(true) {
            while(!verifica) {
                System.out.println("Escolha 1- Pedra, 2- Papel, 3- Tesoura");
                jogador = entrada.nextInt();
                entrada.nextLine();

                switch(jogador) {
                    case 1 -> {
                        gestoJogador = "Pedra";
                        verifica = true;
                    }

                    case 2 -> {
                        gestoJogador = "Papel";
                        verifica = true;
                    }

                    case 3 -> {
                        gestoJogador = "Tesoura";
                        verifica = true;
                    }

                    default -> System.out.println("OPÇÃO INVÁLIDA");
                }
            }

            verifica = false;

            while(!verifica) {
                System.out.println("Escolha 1- Pedra, 2- Papel, 3- Tesoura");
                switch(maquina) {
                    case 1 -> {
                        gestoMaquina = "Pedra";
                        verifica = true;
                    }

                    case 2 -> {
                        gestoMaquina = "Papel";
                        verifica = true;
                    }

                    case 3 -> {
                        gestoMaquina = "Tesoura";
                        verifica = true;
                    }

                    default -> System.out.println("OPÇÃO INVÁLIDA");
                }
            }

            verifica = false;

            System.out.println("Você escolheu: " + gestoJogador);
            System.out.println("A máquina escolheu : " + gestoMaquina);

            if (jogador == maquina){
                System.out.println("Empate! tente novamente");

            } else if ((jogador == 1 && maquina == 3 ||
                    jogador == 3 && maquina == 2 ||
                    jogador == 2 && maquina == 1)) {
                System.out.println("Você venceu!");
                System.exit(0);
            } else {
                System.out.println("Máquina venceu!");
                System.exit(0);
            }
        }
    }
}
