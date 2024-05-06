import java.util.Scanner;

public class Jogo {

    // Função principal onde é o Menu e onde vai chamar as outras funções que o jogo
    // possue.
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int opcaoMenu;

        clearConsole();
        System.out.println("Olá, seja bem-vindo(a) ao Mathmancer!\n");
        System.out.println(
                "Para uma experiência mais imersiva e completa, sugerimos que você deixe a janela do console grande. Assim, você poderá aproveitar ao máximo cada detalhe e ter uma experiência ainda melhor.\n");

        do {
            System.out.println("1 - JOGAR");
            System.out.println("2 - INSTRUÇÕES");
            System.out.println("3 - CRÉDITOS");
            System.out.println("4 - SAIR\n");

            System.out.print("Opção: ");
            opcaoMenu = sc.nextInt();

            switch (opcaoMenu) {
                // se escolher jogo
                case 1:
                    clearConsole();
                    System.out.println("\n=-=-=-=-=-= INICIANDO JOGO =-=-=-=-=-=");
                    Thread.sleep(1000);
                    criarPersonagem();
                    opcaoMenu = 4;
                    break;
                // se escolher instrução
                case 2:
                    instrucoes();
                    break;
                // se escolher créditos
                case 3:
                    printCreditos();
                    break;
                // se escolher sair
                case 4:
                    System.out.println("\nSaindo do Jogo. Volte Logo!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nOpção Inválida!\n");
            }
        } while (opcaoMenu != 4);

        System.out.println("\n\nAcabou!");

    }

    // Função para o exercício de adição 1
    public static void exercicioAdicao01() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Questão 1");
        System.out.println("Problema: Qual é o resultado da adição dos polinômios (3x² + 5x + 4) e (2x² - 3x + 1)?");
        System.out.println("Tutorial:");
        System.out.println("Para somar polinômios, basta somar os termos semelhantes. Termos semelhantes são aqueles que têm a mesma parte literal (as variáveis) elevada à mesma potência.");
        System.out.println("PASSO 1: ");
        System.out.println("Então, somamos os termos semelhantes de cada polinômio:\r\n" + //
                "(3x² + 5x + 4) + (2x² - 3x + 1) \r\n" + //
                "= (3x² + 2x²) + (5x - 3x) + (4 + 1)\r\n" + //
                "");
        System.out.println("PASSO 2:");
        System.out.println("Agora, somamos cada grupo de termos semelhantes:\r\n" + //
                        "3x² + 2x² = 5x²\r\n" + //
                        "5x - 3x = 2x\r\n" + //
                        "4 + 1 = 5\r\n" + //
                        "");
        System.out.println("Qual é o resultado da operação?");

        System.out.println("a) 5x² - x + 5");
        System.out.println("b) 5x² - x + 3");
        System.out.println("c) 5x² + 2x + 5");
        System.out.println("d) 5x² + 2x + 3");
        System.out.print("Resposta: ");
        String resposta = sc.next();
        if (resposta.equalsIgnoreCase("a")) {
            System.out.println("Resposta correta! Parabéns!");
        } else {
            System.out.println("Resposta incorreta. Tente novamente!");
        }
    }

    // Função para o exercício de adição 2
    public static void exercicioAdicao02() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Questão 2");
        System.out.println("Problema: Calcule a soma dos polinômios (4x³ + 2x² + 7) e (3x³ - 5x² + 1).");
        System.out.println("Tutorial:");
        System.out.println("Para somar polinômios, agrupamos os termos semelhantes. Lembre-se de que os termos semelhantes têm a mesma parte literal (as variáveis) com o mesmo expoente.");
        System.out.println("PASSO 1:");
        System.out.println("Então, somamos os termos semelhantes de cada polinômio:\r\n" + //
                        "(4x³ + 2x² + 7) + (3x³ - 5x² + 1) \r\n" + //
                        "= (4x³ + 3x³) + (2x² - 5x²) + (7 + 1)\r\n" + //
                        "");
        System.out.println("PASSO 2: ");
        System.out.println("Agora, somamos cada grupo de termos semelhantes:\r\n" + //
                        "4x³ + 3x³ = 7x³\r\n" + //
                        "2x² - 5x² = -3x²\r\n" + //
                        "7 + 1 = 8\r\n" + //
                        "");
        System.out.println("Qual é o resultado da operação?");
        System.out.println("a) 7x³ - 3x² + 8");
        System.out.println("b) 7x³ - 3x² + 6");
        System.out.println("c) 7x³ - 5x² + 8");
        System.out.println("d) 7x³ - 5x² + 6");
        System.out.print("Resposta: ");
        String resposta = sc.next();
        if (resposta.equalsIgnoreCase("a")) {
            System.out.println("Resposta correta! Parabéns!");
        } else {
            System.out.println("Resposta incorreta. Tente novamente!");
        }
    }

    // Função para o exercício de adição 3
    public static void exercicioAdicao03() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Questão 3");
        System.out.println("Problema: Qual é o resultado da operação (6x⁴ - 3x³ + 2x²) + (x⁴ + 5x³ - x² + 1)?");
        System.out.println("Tutorial:");
        System.out.println("Para somar polinômios, agrupamos os termos semelhantes...");
        // Restante do tutorial omitido
        System.out.println("Qual é o resultado da operação?");
        System.out.println("a) 7x⁴ + 2x³ + x² + 1");
        System.out.println("b) 7x⁴ - 3x³ + x² + 1");
        System.out.println("c) 7x⁴ + 2x³ + x² - 1");
        System.out.println("d) 7x⁴ - 3x³ + x² - 1");
        System.out.print("Resposta: ");
        String resposta = sc.next();
        if (resposta.equalsIgnoreCase("a")) {
            System.out.println("Resposta correta! Parabéns!");
        } else {
            System.out.println("Resposta incorreta. Tente novamente!");
        }
    }

    // Classe de personagem que define a vida, agilidade e dano do personagem.
    static class Personagem {
        int vida;
        int agilidade;
        double dano;
    }

    // Função usada para usuário escolher qual personagem ele vai querer jogar,
    // podendo escolher pelos pontos de dano, vida e agilidade.
    public static void criarPersonagem() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int opcao;
        int vida = 0;
        int agilidade = 0;
        double dano = 0;

        do {
            System.out.println("ESCOLHA UM PERSONAGEM:\n ");
            System.out.println("[1] Jonn\n\nVida: 100\nAgilidade: 60\nDano: 8%\n");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
            System.out.println("[2] Anne\n\nVida: 100\nAgilidade: 80\nDano: 6%\n");

            System.out.print("OPÇÃO DESEJADA: ");
            opcao = sc.nextInt();
            System.out.println("");

            if (opcao == 1) {
                // Colorindo a String no Console
                System.out.println("PERSONAGEM ESCOLHIDO: \u001B[36mJONN\u001B[0m\n");
                vida = 100;
                agilidade = 60;
                dano = 0.8;
            } else if (opcao == 2) {
                // Colorindo a String no Console utilizando \u001B[36m e outros.
                System.out.println("PERSONAGEM ESCOLHIDO: \u001B[36mANNE\u001B[0m\n");
                vida = 100;
                agilidade = 80;
                dano = 0.6;
            } else {
                System.out.println("\nOPÇÃO INVÁLIDA!\n");
            }

            Thread.sleep(2500);
            System.out.println("\n=-=-=-=-=-= INICIANDO JOGO =-=-=-=-=-=");
            Thread.sleep(2000);
            System.out.println("\n\n\n\n\n");
        } while (opcao < 1 || opcao > 2);

        jogar(vida, agilidade, dano);
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
    public static void jogar(int vida, int agilidade, double dano) throws InterruptedException {

        Scanner input = new Scanner(System.in);

        // Variáveis que vão ser usadas para controla a vida, dano e agilidade do
        // personagem.
        int vidaPersonagem = vida;
        int agilidadePersonagem = agilidade;
        double danoPersonagem = dano;
        double danoArma = 0;
        double danoGeral = 0;

        clearConsole();

        /*
         * Variáveis de textos em ASCII para o jogo.
         */

        String primeiroMob = "\n\n" +
                "                                        ::::::::                                           \n" +
                "                                      :.        .:                                         \n" +
                "                                     -     ==-    =                                       \n" +
                "                                    -     #::=-   -.                                      \n" +
                "                                    =     #.:+:    =                                      \n" +
                "                                    =     .==-    .-                                      \n" +
                "                                     -            .-                                      \n" +
                "                                     =  .        .::                                      \n" +
                "                                     .= +#+-::-+%--                                       \n" +
                "                                      -. %@@@@@@+ -                                       \n" +
                "                                       - .#@@@@* -                                        \n" +
                "                                        -. =##+ -.                                        \n" +
                "                                         .::...:                                            " +
                "\n\n";

        // Começando o jogo e as histórias
        historiaInicial();
        escolherCaminhoPrincipal(input);
        // Escolher arma e definir o dano e o status atual.
        danoArma = primeiraSala(input, agilidadePersonagem);
        danoGeral = (dano * danoArma) + danoArma;
        System.out.println("\n\n=-=-=-=-=-=-=-=-= VOCÊ VOLTOU PARA O CORREDOR =-=-=-=-=-=-=-=-=\n\n");
        // Mostrar status atual do personagem.
        statusAtual(vidaPersonagem, agilidadePersonagem, danoGeral);

    }

    // Função que mostra as instruções do jogo, ele contem um sleep onde vai segurar
    // o texto por mais tempo na tela para o usuário ler.
    public static void instrucoes() throws InterruptedException {

        // Tempo em segundos para deixar o texto na tela e depois prosseguir o jogo
        long tempoEmSegundos = 3500;

        System.out.println("\n=-=-=-=-=-= INSTRUÇÕES =-=-=-=-=-=\n");
        System.out.println("- Leia as explicações e a história para aprender e responder as questões de matemática.");
        System.out.println(
                "- Seu personagem terá uma VIDA, onde ela vai servir de base para as suas tentivas de responder as questões.");
        System.out.println("- Leia com atenção as questões!");
        System.out.println("- Itens de Dano irão ajudar a finalizar mais rápido os Monstros.");
        System.out.println("- Itens de Agilidade irão ajudar a desviar de ataques. Caso você tenha baixa");
        System.out.println(
                "- Para uma experiência mais imersiva e completa, sugerimos que você deixe a janela do console grande. Assim, você poderá aproveitar ao máximo cada detalhe e ter uma experiência ainda melhor.");
        System.out.println("- Aproveite o jogo e se divirta!\n");
        System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");

        Thread.sleep(tempoEmSegundos);

    }

    // Função para limpar o console. Ele não limpa literalmente, mas sobe. Estamos
    // utilizando para melhorar a imersão e a visualização do usuário.
    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void historiaInicial() throws InterruptedException {

        /*
         * Variáveis de textos em ASCII para a história do jogo.
         */

        String historiaString = " ██░ ██  ██▓  ██████ ▄▄▄█████▓ ▒█████   ██▀███   ██▓ ▄▄▄      \n" +
                "▓██░ ██▒▓██▒▒██    ▒ ▓  ██▒ ▓▒▒██▒  ██▒▓██ ▒ ██▒▓██▒▒████▄    \n" +
                "▒██▀▀██░▒██▒░ ▓██▄   ▒ ▓██░ ▒░▒██░  ██▒▓██ ░▄█ ▒▒██▒▒██  ▀█▄  \n" +
                "░▓█ ░██ ░██░  ▒   ██▒░ ▓██▓ ░ ▒██   ██░▒██▀▀█▄  ░██░░██▄▄▄▄██ \n" +
                "░▓█▒░██▓░██░▒██████▒▒  ▒██▒ ░ ░ ████▓▒░░██▓ ▒██▒░██░ ▓█   ▓██▒\n" +
                " ▒ ░░▒░▒░▓  ▒ ▒▓▒ ▒ ░  ▒ ░░   ░ ▒░▒░▒░ ░ ▒▓ ░▒▓░░▓   ▒▒   ▓▒█░\n" +
                " ▒ ░▒░ ░ ▒ ░░ ░▒  ░ ░    ░      ░ ▒ ▒░   ░▒ ░ ▒░ ▒ ░  ▒   ▒▒ ░\n" +
                " ░  ░░ ░ ▒ ░░  ░  ░    ░      ░ ░ ░ ▒    ░░   ░  ▒ ░  ░   ▒   \n" +
                " ░  ░  ░ ░        ░               ░ ░     ░      ░        ░  ░ \n\n\n\n";

        String boaSorteString = "______                              _       \n" +
                "| ___ \\                            | |      \n" +
                "| |_/ / ___   __ _   ___  ___  _ __| |_ ___ \n" +
                "| ___ \\/ _ \\ / _` | / __|/ _ \\| '__| __/ _ \\\n" +
                "| |_/ / (_) | (_| | \\__ \\ (_) | |  | ||  __/\n" +
                "\\____/ \\___/ \\__,_| |___/\\___/|_|   \\__\\___|";

        // Começando o jogo e as histórias
        System.out.println("\u001B[31m" + historiaString + "\u001B[0m");

        Thread.sleep(2000);
        System.out.println(
                "Após a perda recente de seu pai, um mestre da matemática, você se encontra em um estado de luto e confusão. Em uma noite, você decide tentar entrar em contato com ele,\nna esperança de sentir sua presença de alguma forma. ");
        Thread.sleep(7000);
        System.out.println("Porém você acaba encontrando um outro ser...");
        Thread.sleep(6000);
        System.out.println(
                "\nAcreditando ser apenas algo da sua imaginação, você apenas ignora e decide dormir... \nMas essa nem sempre é a melhor opção, certo?\n");
        System.out.println(
                "Você começa a ter um pesadelo e nele você vê partes de um mapa antigo e esse mapa parece familiar para você...\n\n");
        Thread.sleep(10000);
        System.out.println("\u001B[31m " + boaSorteString + "\u001B[0m\n\n\n");
        Thread.sleep(8000);
        clearConsole();
        System.out.println(
                "\n\nAo acordar, você se encontra no meio do nada em frente a uma escola, muito confuso você percebe que não está sozinho, escutando barulhos de passos se aproximando, mas você não consegue enxergar nada com a neblina e as enormes árvores.\n\n");
    }

    public static int escolherCaminhoPrincipal(Scanner input) {
        int escolhaPrincipal;

        do {
            System.out.println("*O que eu devo fazer?*");
            System.out.println("[1] Procurar sua casa. [2] Procurar ajuda. [3] Entrar na escola.\n");
            System.out.print("OPÇÃO DESEJADA: ");
            escolhaPrincipal = input.nextInt();

            if (escolhaPrincipal == 1) {
                System.out.println("\n*Não é uma boa ideia, imagino que eu não esteja perto de casa*\n");
            } else if (escolhaPrincipal == 2) {
                System.out.println(
                        "\n*Não é uma boa ideia, não consigo enxergar nada além dessa escola e não acho que teria alguém por perto*\n");
            } else if (escolhaPrincipal == 3) {
                System.out.println("\nAcho que é a única opção que eu tenho, mesmo que essa escola seja medonha\n");
            } else if (escolhaPrincipal > 3 || escolhaPrincipal < 1) {
                System.out.println("OPÇÃO INVÁLIDA!\n");
            }
        } while (escolhaPrincipal != 3);

        return 0;
    }

    // Escolha da primeira da Sala
    public static int primeiraSala(Scanner input, int agilidadePersonagem) throws InterruptedException {

        int opcaoSala;
        int danoArma = 0;

        Thread.sleep(2500);
        clearConsole();
        System.out.println("\n =-=-=-=-=-=-=-=-= VOCÊ ENTROU NA ESCOLA =-=-=-=-=-=-=-=-=\n\n");
        System.out.println("Você se encontra em um corredor imenso e tem duas portas próximas a você.");
        System.out.println("Você precisar entrar em uma dessas salas para procurar algo para se proteger...");

        do {
            System.out.println("\n\nVocê deseja entrar na sala a ESQUERDA ou a DIREITA?\n");
            System.out.println("[1] SALA A ESQUERDA");
            System.out.println("[2] SALA A DIREITA\n");
            System.out.print("\nOPÇÃO DESEJADA: ");
            opcaoSala = input.nextInt();

            if (opcaoSala == 1) {
                danoArma = salaEsquerda(input, agilidadePersonagem);
                return danoArma;
            } else if (opcaoSala == 2) {
                salaDireita(input);
            }

        } while (opcaoSala != 1);

        return danoArma;
    }

    public static void salaDireita(Scanner input) throws InterruptedException {
        int primeiraOpcao;
        int segundaOpcao;

        System.out.println("\n=-=-=-=-=-=-=-=-= VOCÊ ENTROU NA SALA À DIREITA =-=-=-=-=-=-=-=-=\n");
        System.out.println("Você se encontra em uma sala de aula com as mesas e cadeiras reviradas.");

        do {
            System.out.println("Você deseja [1] EXPLORAR a sala ou deseja [2] VOLTAR?\n");
            System.out.print("OPÇÃO DESEJADA: ");
            primeiraOpcao = input.nextInt();

            if (primeiraOpcao == 1) {
                System.out.println("\nVocê decidiu explorar a sala.");
                System.out.println("\nPROCURANDO...\n");
                Thread.sleep(1500);
                System.out.println("Você olhou nas mesas e nas cadeiras e não encontrou nada!");
                System.out.println("Você deseja [1] PROCURAR no armário ou deseja [2] VOLTAR para o corredor\n");
                System.out.print("OPÇÃO DESEJADA: ");
                segundaOpcao = input.nextInt();

                do {
                    if (segundaOpcao == 1) {
                        System.out.println("\nVocê decidiu olhar o armário.");
                        System.out.println("\nPROCURANDO...\n");
                        Thread.sleep(1000);
                        System.out.println("Você encontrou uma maçã apodrecida e uns papéis.");
                        System.out.println("Melhor voltar para a corredor e ir explorar a outra sala...");
                        Thread.sleep(4000);
                        break;
                    } else if (segundaOpcao == 2) {
                        break;
                    } else if (segundaOpcao < 1 || segundaOpcao > 2) {
                        System.out.println("\nOPÇÃO INVÁLIDA!\n");
                    }

                } while (segundaOpcao < 1 || segundaOpcao > 2);
            } else if (primeiraOpcao == 2) {
                System.out.println("Você decidiu ir embora...");
                Thread.sleep(1500);
            } else if (primeiraOpcao < 1 || primeiraOpcao > 2) {
                System.out.println("\nOPÇÃO INVÁLIDA!\n");
            }

        } while (primeiraOpcao < 1 || primeiraOpcao > 2);
    }

    // Jogador entrou na sala à esquerda e vai encontrar sua arma
    public static int salaEsquerda(Scanner input, int agilidadePersonagem) throws InterruptedException {
        int danoArma = 0;
        int opcaoPrimeiraArma;
        int opcaoSala;

        System.out.println("\n=-=-=-=-=-=-=-=-= VOCÊ ENTROU NA SALA À ESQUERDA =-=-=-=-=-=-=-=-=\n");

        System.out.println("\nVocê se encontra em uma sala com poucas mesas.");
        System.out.println("Você acha que viu algo para se proteger perto da mesa do professor.");
        System.out.println("Você deseja ir [1] OLHAR a mesa do professor ou deseja ir [2] EMBORA\n");
        System.out.print("OPÇÃO DESEJADA: ");
        opcaoSala = input.nextInt();
        if (opcaoSala == 1) {
            do {
                System.out.println(
                        "\nVocê encontra uma TESOURA e uma FACA na mesa do professor, qual você deseja pegar?\n");
                System.out.println("[1] FACA\n\nDano: 10\nAgilidade: -10\n");
                System.out.println("[2] TESOURA\n\nDano: 7\nAgilidade: 10\n");

                System.out.print("OPÇÃO DESEJADA: ");
                opcaoPrimeiraArma = input.nextInt();

                if (opcaoPrimeiraArma == 1) {
                    System.out.println("Você pegou a FACA!\n");
                    danoArma = 10;
                    agilidadePersonagem -= 10;
                } else if (opcaoPrimeiraArma == 2) {
                    System.out.println("Você pegou a TESOURA!\n");
                    danoArma = 7;
                    agilidadePersonagem += 10;
                } else {
                    System.out.println("OPÇÃO INVÁLIDA!\n");
                }

            } while (opcaoPrimeiraArma < 1 || opcaoPrimeiraArma > 2);

            return danoArma;
        } else if (opcaoSala == 2) {
            System.out.println("Você decidiu ir embora...");
            Thread.sleep(1500);
            primeiraSala(input, agilidadePersonagem);
        }
        return danoArma;
    }

    public static void statusAtual(int vida, int agilidade, double dano) {
        System.out.println("=-=-=-=-=-= STATUS ATUAL =-=-=-=-=-=");
        System.out.println("\nVida: " + vida);
        System.out.println("Agilidade: " + agilidade);
        System.out.println("Dano: " + dano + "\n");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");

    }
}