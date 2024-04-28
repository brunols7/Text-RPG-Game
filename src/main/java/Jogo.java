import java.util.Scanner;
 
// Classe usada para criar o personagem
class Personagem {
  int vida;
  int agilidade;
  double dano;
 
  // Classe usada para usuário escolher qual personagem ele vai querer jogar, podendo escolher pelos pontos de dano, vida e agilidade.
  public static Personagem criarPersonagem() throws InterruptedException {
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
              System.out.println("PERSONAGEM ESCOLHIDO: \u001B[36mJONN\u001B[0m\n");
              personagem.vida = 100;
              personagem.agilidade = 60;
              personagem.dano = 0.8;
          } else if (opcao == 2) {
            // Colorindo a String no Console utilizando \u001B[36m e outros.
            System.out.println("PERSONAGEM ESCOLHIDO: \u001B[36mANNE\u001B[0m\n");
            personagem.vida = 100;
            personagem.agilidade = 80;
            personagem.dano = 0.6;
          } else {
              System.out.println("\nOPÇÃO INVÁLIDA!\n");
          }
          Thread.sleep(2500);
          System.out.println("\n=-=-=-=-=-= INICIANDO JOGO =-=-=-=-=-=");
          Thread.sleep(2000);
          System.out.println("\n\n\n\n\n");
      } while (opcao < 1 || opcao > 2);
 
      sc.close();
 
      return personagem;
  }
 
}
 
public class Jogo {
   
    // Função principal onde é o Menu e onde vai chamar as outras funções que o jogo possue.
    public static void main(String[] args) throws InterruptedException {
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
                    clearConsole();
                    System.out.println("\n=-=-=-=-=-= INICIANDO JOGO =-=-=-=-=-=");
                    Thread.sleep(1000);
                    Personagem personagem = Personagem.criarPersonagem();
                    jogar(personagem);
                    opcaoMenu = 4;
                    break;
                case 2:
                    instrucoes();
                    break;
                case 3:
                    printCreditos();
                    break;
                case 4:
                    System.out.println("\nSaindo do Jogo. Volte Logo!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nOpção Inválida!\n");
            }
        } while (opcaoMenu != 4);
       
        System.out.println("\n\nAcabou!");
 
        sc.close();
    }
 
    // Função onde mostra os créditos, utilizamos uma String com texto em ASCII.
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
                "         |_|  |_|\\__,_|_|  |_|\\__,_|_| |_|\\__,_|    \\_/  |_|\\__,_|\\__,_|_|            \n" +
                "              _                      ____                 _                 _   _    \n"
                + "             | | ___   __ _  ___    / ___|__ ___   ____ _| | ___ __ _ _ __ | |_(_)   \n"
                + "  _____   _  | |/ _ \\ / _` |/ _ \\  | |   / _` \\ \\ / / _` | |/ __/ _` | '_ \\| __| |   \n"
                + " |_____| | |_| | (_) | (_| | (_) | | |__| (_| |\\ V / (_| | | (_| (_| | | | | |_| |   \n"
                + "          \\___/ \\___/ \\__,_|\\___/   \\____\\__,_| \\_/ \\__,_|_|\\___\\__,_|_| |_|\\__|_|   \n\n\n\n";
        System.out.println(creditos);
    }
   
    // Função onde ocorre o jogo.
    public static void jogar(Personagem personagem) throws InterruptedException{
 
        Scanner input = new Scanner(System.in);
 
        int vida = personagem.vida;
        int agilidade = personagem.agilidade;
        double dano = personagem.dano;
       
        clearConsole();
        String historiaString =
                " ██░ ██  ██▓  ██████ ▄▄▄█████▓ ▒█████   ██▀███   ██▓ ▄▄▄      \n" +
                "▓██░ ██▒▓██▒▒██    ▒ ▓  ██▒ ▓▒▒██▒  ██▒▓██ ▒ ██▒▓██▒▒████▄    \n" +
                "▒██▀▀██░▒██▒░ ▓██▄   ▒ ▓██░ ▒░▒██░  ██▒▓██ ░▄█ ▒▒██▒▒██  ▀█▄  \n" +
                "░▓█ ░██ ░██░  ▒   ██▒░ ▓██▓ ░ ▒██   ██░▒██▀▀█▄  ░██░░██▄▄▄▄██ \n" +
                "░▓█▒░██▓░██░▒██████▒▒  ▒██▒ ░ ░ ████▓▒░░██▓ ▒██▒░██░ ▓█   ▓██▒\n" +
                " ▒ ░░▒░▒░▓  ▒ ▒▓▒ ▒ ░  ▒ ░░   ░ ▒░▒░▒░ ░ ▒▓ ░▒▓░░▓   ▒▒   ▓▒█░\n" +
                " ▒ ░▒░ ░ ▒ ░░ ░▒  ░ ░    ░      ░ ▒ ▒░   ░▒ ░ ▒░ ▒ ░  ▒   ▒▒ ░\n" +
                " ░  ░░ ░ ▒ ░░  ░  ░    ░      ░ ░ ░ ▒    ░░   ░  ▒ ░  ░   ▒   \n" +
                " ░  ░  ░ ░        ░               ░ ░     ░      ░        ░  ░ \n\n\n\n";
       
        String boaSorteString =
        "______                              _       \n" +
        "| ___ \\                            | |      \n" +
        "| |_/ / ___   __ _   ___  ___  _ __| |_ ___ \n" +
        "| ___ \\/ _ \\ / _` | / __|/ _ \\| '__| __/ _ \\\n" +
        "| |_/ / (_) | (_| | \\__ \\ (_) | |  | ||  __/\n" +
        "\\____/ \\___/ \\__,_| |___/\\___/|_|   \\__\\___|";
   
       
 
        System.out.println("\u001B[31m" + historiaString + "\u001B[0m");
        System.out.println("Após a perda recente de seu pai, um mestre da matemática, você se encontra em um estado de luto e confusão. Em uma noite, você decide tentar entrar em contato com ele, na esperança de sentir sua presença de alguma forma. ");
        Thread.sleep(1000);
        System.out.println("Porém você acaba encontrando um outro ser.");
        System.out.println("\n\n");
        Thread.sleep(10000);
        System.out.println("\u001B[31m " + boaSorteString + "\u001B[0m");
        Thread.sleep(5000);
 
       
    }
 
    // Função que mostra as instruções do jogo, ele contem um sleep onde vai segurar o texto por mais tempo na tela para o usuário ler.
    public static void instrucoes() throws InterruptedException{
 
        // Tempo em segundos para deixar o texto na tela e depois prosseguir o jogo
        long tempoEmSegundos = 3500;
 
        System.out.println("\n=-=-=-=-=-= INSTRUÇÕES =-=-=-=-=-=\n");
        System.out.println("- Leia as explicações e a história para aprender e responder as questões de matemática.");
        System.out.println("- Seu personagem terá uma VIDA, onde ela vai servir de base para as suas tentivas de responder as questões.");
        System.out.println("- Leia com atenção as questões!");
        System.out.println("- Para uma experiência mais imersiva e completa, sugerimos que você deixe a janela do console grande. Assim, você poderá aproveitar ao máximo cada detalhe e ter uma experiência ainda melhor.");
        System.out.println("- Aproveite o jogo e se divirta!\n");
        System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
       
        Thread.sleep(tempoEmSegundos);
 
    }
 
    // Função para limpar o console. Ele não limpa literalmente, mas sobe. Estamos utilizando para melhorar a imersão e a visualização do usuário.
    public static void clearConsole() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
}