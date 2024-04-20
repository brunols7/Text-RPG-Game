import java.util.Scanner;

public class Menu {

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int opcaoMenu;

    System.out.println("Olá, seja bem-vindo(a) ao Mathmancer!\n");
    System.out.println("Para uma experiência mais imersiva e completa, sugerimos que você deixe a janela do console grande. Assim, você poderá aproveitar ao máximo cada detalhe e ter uma experiência ainda melhor.\n");

    System.out.println("1 - JOGAR");
    System.out.println("2 - INSTRUÇÕES");
    System.out.println("3 - CRÉDITOS");
    System.out.println("4 - SAIR\n");

    do{
      System.out.print("Opção: ");
      opcaoMenu = sc.nextInt();

      switch (opcaoMenu) {
        case 1:
          printBomJogo();
          // Jogo.main(args)
          //Chamar a função do jogo OUTRO ARQUIVO
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

        default:
          System.out.println("Opção Inválida!");
      }
    

    }while(opcaoMenu != 4);


    sc.close();
  }

  public static void printBomJogo() {
    String bomJogo = "    ____   ___  __  __       _  ___   ____  ___    _ \n" +
              "   | __ ) / _ \\|  \\/  |     | |/ _ \\ / ___|/ _ \\  | |\n" +
              "   |  _ \\| | | | |\\/| |  _  | | | | | |  _| | | | | |\n" +
              "   | |_) | |_| | |  | | | |_| | |_| | |_| | |_| | |_|\n" +
              "   |____/ \\___/|_|  |_|  \\___/ \\___/ \\____|\\___/  (_)\n" +
              "                                                     ";
    System.out.println(bomJogo);
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
              "              _                      ____                 _                 _   _     \n" +
              "             | | ___   __ _  ___    / ___|__ ___   ____ _| | ___ __ _ _ __ | |_(_)    \n" +
              "  _____   _  | |/ _ \\ / _` |/ _ \\  | |   / _` \\ \\ / / _` | |/ __/ _` | '_ \\| __| |    \n" +
              " |_____| | |_| | (_) | (_| | (_) | | |__| (_| |\\ V / (_| | | (_| (_| | | | | |_| |    \n" +
              "          \\___/ \\___/ \\__,_|\\___/   \\____\\__,_| \\_/ \\__,_|_|\\___\\__,_|_| |_|\\__|_|    \n" +
              "          __  __            _                    __     ___     _       _             \n" +
              "         |  \\/  | __ _ _ __(_) __ _ _ __   __ _  \\ \\   / (_) __| | __ _| |            \n" +
              "  _____  | |\\/| |/ _` | '__| |/ _` | '_ \\ / _` |  \\ \\ / /| |/ _` |/ _` | |            \n" +
              " |_____| | |  | | (_| | |  | | (_| | | | | (_| |   \\ V / | | (_| | (_| | |            \n" +
              "         |_|  |_|\\__,_|_|  |_|\\__,_|_| |_|\\__,_|    \\_/  |_|\\__,_|\\__,_|_|            \n";
    System.out.println(creditos);
  }
}
