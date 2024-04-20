import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcaoMenu;

        System.out.println("Olá, seja bem-vindo(a) ao Mathmancer!\n");
        System.out.println("Para uma experiência mais imersiva e completa, sugerimos que você deixe a janela do console grande. Assim, você poderá aproveitar ao máximo cada detalhe e ter uma experiência ainda melhor.\n");

        do {
            System.out.println("1 - JOGAR");
            System.out.println("2 - INSTRUÇÕES");
            System.out.println("3 - CRÉDITOS");
            System.out.println("4 - SAIR\n");

            System.out.print("Opção: ");
            opcaoMenu = sc.nextInt();

            switch (opcaoMenu) {
                case 1:
                    Personagem personagem = Personagem.criarPersonagem();
                    jogar(personagem);
                    opcaoMenu = 4;
                    break;
                case 2:
                    //fazer função de mostrar as intruções
                    break;
                case 3:
                    printCreditos();
                    break;
                case 4:
                    System.out.println("Saindo do Jogo. Volte Logo!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        } while (opcaoMenu != 4);
        
        System.out.println("Acabou!");

        sc.close();
    }

    public static void printCreditos() {
        String creditos = " _____    _ _                                                                       \n" +
                " |  ___|__(_) |_ ___    _ __   ___  _ __ _                                           \n" +
                " | |_ / _ \\ | __/ _ \\  | '_ \\ / _ \\| '__(_)                                          \n" +
                " |  _|  __/ | || (_) | | |_) | (_) | |   _                                           \n" +
                " |_|  \\___|_|\\__\\___/  | .__/ \\___/|_|  (_)                                          \n" +
                "          ____         |_|               _                                   _        \n" +
                "         | __ ) _ __ _   _ _ __   ___   | |    ___  ___  _ __   __ _ _ __ __| | ___   \n" +
                "  _____  |  _ \\| '__| | | | '_ \\ / _ \\  | |   / _ \\/ _ \\| '_ \\ / _` | '__/ _` |/ _ \\  \n" +
                " |_____| | |_) | |  | |_| | | | | (_) | | |__|  __/ (_) | | | | (_| | | | (_| | (_) | \n" +
                "         |____/|_|   \\__,_|_| |_|\\___/  |_____\\___|\\___/|_| |_|\\__,_|_|  \\__,_|\\___/  \n" +
                "          __  __            _                    __     ___     _       _             \n" +
                "         |  \\/  | __ _ _ __(_) __ _ _ __   __ _  \\ \\   / (_) __| | __ _| |            \n" +
                "  _____  | |\\/| |/ _` | '__| |/ _` | '_ \\ / _` |  \\ \\ / /| |/ _` |/ _` | |            \n" +
                " |_____| | |  | | (_| | |  | | (_| | | | | (_| |   \\ V / | | (_| | (_| | |            \n" +
                "         |_|  |_|\\__,_|_|  |_|\\__,_|_| |_|\\__,_|    \\_/  |_|\\__,_|\\__,_|_|            \n";
        System.out.println(creditos);
    }
    
    public static void jogar(Personagem personagem){
        int vida = personagem.vida;
        int agilidade = personagem.agilidade;
        double dano = personagem.dano;
        
    }
}

class Personagem {
    int vida;
    int agilidade;
    double dano;

    public static Personagem criarPersonagem() {
        Scanner sc = new Scanner(System.in);
        Personagem personagem = new Personagem();
        int opcao;

        do {
            System.out.println("ESCOLHA UM PERSONAGEM:\n ");
            System.out.println("[1] Jonn\n\nVida: 100\nAgilidade: 60\nDano: 8%\n");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
            System.out.println("[2] Anne\n\nVida: 100\nAgilidade: 80\nDano: 6%\n");

            System.out.print("OPÇÃO DESEJADA: ");
            opcao = sc.nextInt();
            System.out.println("");

            if (opcao == 1) {
                System.out.println("PERSONAGEM ESCOLHIDO: Jonn\n");
                personagem.vida = 100;
                personagem.agilidade = 60;
                personagem.dano = 0.8;
            } else if (opcao == 2) {
                System.out.println("PERSONAGEM ESCOLHIDO: Anne\n");
                personagem.vida = 100;
                personagem.agilidade = 80;
                personagem.dano = 0.6;
            } else {
                System.out.println("\nOPÇÃO INVÁLIDA!\n");
            }
        } while (opcao < 1 || opcao > 2);

        sc.close();

        return personagem;
    }

}
