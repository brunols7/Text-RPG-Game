import java.util.Scanner;

public class Personagem {
    int vida;
    int agilidade;
    double dano;

    public static Personagem criarPersonagem() {
        Scanner sc = new Scanner(System.in);
        Personagem personagem = new Personagem();
        int opcao;


        do{
            System.out.println("ESCOLHA UM PERSONAGEM:\n ");
            System.out.println("[1] Jonn\n\nVida: 100\nAgilidade: 60\nDano: 8%\n");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
            System.out.println("[2] Anne\n\nVida: 100\nAgilidade: 80\nDano: 6%\n");

            System.out.print("OPCAO DESEJADA: ");
            opcao = sc.nextInt();
            System.out.println("");

            if(opcao == 1) {
                System.out.println("PERSONAGEM ESCOLHIDO: Jonn\n");
                personagem.vida = 100;
                personagem.agilidade = 60;
                personagem.dano = 0.8;
            } else if (opcao == 2) {
                System.out.println("PERSONAGEM ESCOLHIDO: Anne\n");
                personagem.vida = 100;
                personagem.agilidade = 80;
                personagem.dano = 0.6;
            }else{
                System.out.println("\nOPÇÃO INVÁLIDA!\n");
            }
        } while(opcao < 1 || opcao > 2);

        sc.close();

        return personagem;
    }
}
