import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
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

    // INÍCIO DAS QUESTÕES DE ADIÇÃO!!
    // Função para o exercício de adição 1
    public static int exercicioAdicao01() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int tentativas = 3;
        int danoTomado = 0;

        while (tentativas > 0) {
            System.out.println("\nQUESTÃO 1");
            System.out.println("========================================================");
            System.out.println("TUTORIAL:");
            System.out.println(
                    "Para somar polinômios, basta somar os termos semelhantes. Termos semelhantes são aqueles que têm a mesma parte literal (as variáveis) elevada à mesma potência.\n");
            System.out.println("PASSO 1: ");
            System.out.println("Então, somamos os termos semelhantes de cada polinômio:\r\n"
                    + //
                    "(3x² + 5x + 4) + (2x² - 3x + 1) \r\n"
                    + //
                    "= (3x² + 2x²) + (5x - 3x) + (4 + 1)\r\n"
                    + //
                    "");
            System.out.println("PASSO 2:");
            System.out.println("Agora, somamos cada grupo de termos semelhantes:\r\n"
                    + //
                    "3x² + 2x² = 5x²\r\n"
                    + //
                    "5x - 3x = 2x\r\n"
                    + //
                    "4 + 1 = 5\r\n"
                    + //
                    "");

              System.out.println(
                "Problema: Qual é o resultado da adição dos polinômios (3x² + 5x + 4) e (2x² - 3x + 1)?\n");
            // Lista de opções de resposta
            String[] opcoesResposta = new String[]{
                    "5x² - x + 3",
                    "5x² - x + 5",
                    "5x² + 2x + 5",
                    "5x² + 2x + 3"
            };

            // Embaralha as opções de resposta
            for (int i = 0; i < opcoesResposta.length; i++) {
                // Gera um índice aleatório para trocar a posição das respostas
                int indiceAleatorio = rand.nextInt(opcoesResposta.length);

                // Troca as respostas de posição
                String temp = opcoesResposta[i];
                opcoesResposta[i] = opcoesResposta[indiceAleatorio];
                opcoesResposta[indiceAleatorio] = temp;
            }

            // Exibe as opções de resposta com as letras (a, b, c, d)
            for (int i = 0; i < opcoesResposta.length; i++) {
                System.out.println((char) ('a' + i) + ") " + opcoesResposta[i]);
            }

            System.out.print("\nResposta: ");
            String resposta = "";
            try {
                resposta = sc.next();
            } catch (java.util.NoSuchElementException e) {
                // Se não houver entrada disponível, continue o loop
                continue;
            }

            // Obtém a posição da resposta correta (c)
            int posicaoRespostaCorreta = opcoesResposta[2].equals("5x² + 2x + 5") ? 2 :
                    opcoesResposta[1].equals("5x² + 2x + 5") ? 1 :
                            opcoesResposta[0].equals("5x² + 2x + 5") ? 0 : 3;

            // Converte a resposta do usuário para o índice (0, 1, 2, 3)
            int respostaUsuario = resposta.toLowerCase().charAt(0) - 'a';

            if (respostaUsuario == posicaoRespostaCorreta) {
                System.out.println("Resposta correta! Parabéns!\n");
                break;
            } else {
                System.out.println("Resposta incorreta.\n");
                tentativas--;
                if (tentativas > 0) {
                    System.out.println("Tentativas restantes: " + tentativas + "\n");
                }
            }

            // Se for a última tentativa e ainda errar, exibe a resposta correta
            if (tentativas == 0) {
                System.out.println("Você excedeu o número de tentativas. A resposta correta era: c) 5x² + 2x + 5\n");
                danoTomado = 10;
            }
        }
        
        return danoTomado;
    }

    // Função para o exercício de adição 2
    public static int exercicioAdicao02() {
        Scanner sc = new Scanner(System.in);
        Random rdm = new Random();
        int tentativas = 3;
        int dano = 0;

        while (tentativas > 0) {
            System.out.println("\nQUESTÃO 2");
            System.out.println("========================================================");
            System.out.println("TUTORIAL:");
            System.out.println(
                    "Para somar polinômios, agrupamos os termos semelhantes. Lembre-se de que os termos semelhantes têm a mesma parte literal (as variáveis) com o mesmo expoente.\n");
            System.out.println("PASSO 1: ");
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
            System.out.println("Problema: Calcule a soma dos polinômios (4x³ + 2x² + 7) e (3x³ - 5x² + 1).");
            System.out.println("Qual é o resultado da operação?");
            // Definindo as opções de resposta
            List<String> opcoesResposta = new ArrayList<>();
            opcoesResposta.add("7x³ - 3x² + 8");
            opcoesResposta.add("7x³ - 3x² + 6");
            opcoesResposta.add("7x³ - 5x² + 8");
            opcoesResposta.add("7x³ - 5x² + 6");

            // Embaralhando as opções de resposta
            Collections.shuffle(opcoesResposta);

            // Exibindo as opções de resposta embaralhadas
            for (int i = 0; i < opcoesResposta.size(); i++) {
                System.out.println((char) ('a' + i) + ") " + opcoesResposta.get(i));
            }

            // Selecionando aleatoriamente a letra da resposta correta
            int indiceRespostaCorreta = rdm.nextInt(opcoesResposta.size());
            char letraRespostaCorreta = (char) ('a' + opcoesResposta.indexOf("7x³ - 3x² + 8"));

            System.out.print("\nResposta: ");
            String resposta = sc.next();
            if (resposta.equalsIgnoreCase(String.valueOf(letraRespostaCorreta))) {
                System.out.println("Resposta correta! Parabéns!");
                break;
            } else {
                System.out.println("Resposta incorreta.");
                tentativas--;
                if (tentativas > 0) {
                    System.out.println("Tentativas restantes: " + tentativas);
                    dano = 10;
                }
            }

            // Se for a última tentativa e ainda errar, exibe a resposta correta
            if (tentativas == 0) {
                System.out.println("Você excedeu o número de tentativas. A resposta correta era: " + letraRespostaCorreta + ") 7x³ - 3x² + 8");
            }
        }
        return dano;
    }

    // Função para o exercício de adição 3
    public static void exercicioAdicao03() {
        Scanner sc = new Scanner(System.in);
        int tentativas = 3;

        while (tentativas > 0) {
            System.out.println("\nQUESTÃO 3");
            System.out.println("========================================================");
            System.out.println("Problema: Qual é o resultado da operação (6x^4 - 3x³ + 2x²) + (x^4 + 5x³ - x² + 1)?");
            System.out.println("TUTORIAL: ");
            System.out.println(
                    "Para somar polinômios, agrupamos os termos semelhantes. Lembre-se de que os termos semelhantes têm a mesma parte literal (as variáveis) com o mesmo expoente.\n");
            System.out.println("PASSO 1: ");
            System.out.println("Então, somamos os termos semelhantes de cada polinômio:\r\n" + //
                    "(6x^4 - 3x³ + 2x²) + (x^4 + 5x³ - x² + 1) \r\n" + //
                    "= (6x^4 + x^4) + (-3x³ + 5x³) + (2x² - x²) + (0 + 1)\r\n" + //
                    "");
            System.out.println("PASSO 2: ");
            System.out.println("Agora, somamos cada grupo de termos semelhantes:\r\n" + //
                    "6x^4 + x^4 = 7x^4\r\n" + //
                    "-3x³ + 5x³ = 2x³\r\n" + //
                    "2x² - x² = x²\r\n" + //
                    "0 + 1 = 1\r\n" + //
                    "");

            System.out.println("Qual é o resultado da operação?");
            System.out.println("a) 7x^4 + 2x³ + x² + 1");
            System.out.println("b) 7x^4 - 3x³ + x² + 1");
            System.out.println("c) 7x^4 + 2x³ + x² - 1");
            System.out.println("d) 7x^4 - 3x³ + x² - 1");

            System.out.print("Resposta: ");
            String resposta = sc.next();
            if (resposta.equalsIgnoreCase("a")) {
                System.out.println("Resposta correta! Parabéns!");
                break;
            } else {
                System.out.println("Resposta incorreta.");
                tentativas--;
                if (tentativas > 0) {
                    System.out.println("Tentativas restantes: " + tentativas);
                }
            }

            // Se for a última tentativa e ainda errar, exibe a resposta correta
            if (tentativas == 0) {
                System.out
                        .println("Você excedeu o número de tentativas. A resposta correta era: a) 7x^4 + 2x³ + x² + 1");
            }
        }
    }
    // FIM DAS QUESTÕES DE ADIÇÃO!

    // ----------------------------------------------------------------------------------------------//

    // INÍCIO DAS QUESTÕES DE SUBTRAÇÃO!!
    // Função para a questão de subtração 1
    public static void exercicioSubtracao01() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int tentativas = 3;
    
        while (tentativas > 0) {
            System.out.println("\nQUESTÃO 1");
            System.out.println("========================================================");
            System.out.println("TUTORIAL:");
            System.out.println(
                    "Para subtrair polinômios, é semelhante à adição, mas desta vez subtraímos os termos semelhantes.");
            System.out.println("Então, subtraímos os termos semelhantes de cada polinômio:\n" + //
                    "(5x² + 3x + 8) - (2x² - 4x + 1) \n" + //
                    "= (5x² - 2x²) + (3x + 4x) + (8 - 1)\n");
    
            System.out.println("Agora, subtraímos cada grupo de termos semelhantes:\n" + //
                    "5x² - 2x² = 3x²\n" + //
                    "3x + 4x = 7x\n" + //
                    "8 - 1 = 7\n");
    
            System.out.println("Problema: Subtraia os polinômios (5x² + 3x + 8) e (2x² - 4x + 1).");
    
            // Definindo as opções de resposta
            List<String> opcoesResposta = new ArrayList<>();
            opcoesResposta.add("3x² - 7x - 7");
            opcoesResposta.add("3x² - 7x + 7");
            opcoesResposta.add("3x² + 7x - 7");
            opcoesResposta.add("3x² + 7x + 7");
    
            // Embaralhando as opções de resposta
            Collections.shuffle(opcoesResposta);
    
            // Exibindo as opções de resposta embaralhadas
            for (int i = 0; i < opcoesResposta.size(); i++) {
                System.out.println((char) ('a' + i) + ") " + opcoesResposta.get(i));
            }
    
            // Selecionando aleatoriamente a letra da resposta correta
            char letraRespostaCorreta = (char) ('a' + opcoesResposta.indexOf("3x² + 7x + 7"));
    
            System.out.print("\nResposta: ");
            String resposta = sc.next();
            if (resposta.equalsIgnoreCase(String.valueOf(letraRespostaCorreta))) {
                System.out.println("Resposta correta! Parabéns!");
                break;
            } else {
                System.out.println("Resposta incorreta.");
                tentativas--;
                if (tentativas > 0) {
                    System.out.println("Tentativas restantes: " + tentativas);
                }
            }
    
            // Se for a última tentativa e ainda errar, exibe a resposta correta
            if (tentativas == 0) {
                System.out.println("Você excedeu o número de tentativas. A resposta correta era: " + letraRespostaCorreta + ") 3x² + 7x + 7");
            }
        }
    }

    // Função para a questão de subtração 2
    public static void exercicioSubtracao02() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int tentativas = 3;
    
        while (tentativas > 0) {
            System.out.println("\nQUESTÃO 2");
            System.out.println("========================================================");
            System.out.println("TUTORIAL:");
            System.out.println("Para subtrair polinômios, agrupamos os termos semelhantes e, em seguida, subtraímos.");
            System.out.println("Então, subtraímos os termos semelhantes de cada polinômio:\n" + //
                    "(4x³ + 2x² + 7) - (3x³ - 5x² + 1) \n" + //
                    "= (4x³ - 3x³) + (2x² + 5x²) + (7 - 1)\n");
    
            System.out.println("Agora, subtraímos cada grupo de termos semelhantes:\n" + //
                    "4x³ - 3x³ = x³\n" + //
                    "2x² + 5x² = 7x²\n" + //
                    "7 - 1 = 6\n");

            System.out.println("Problema: Calcule a diferença entre os polinômios (4x³ + 2x² + 7) e (3x³ - 5x² + 1).");
            // Definindo as opções de resposta
            List<String> opcoesResposta = new ArrayList<>();
            opcoesResposta.add("x³ + 7x² + 6");
            opcoesResposta.add("x³ + 7x² - 6");
            opcoesResposta.add("x³ - 7x² + 6");
            opcoesResposta.add("x³ - 7x² - 6");
    
            // Embaralhando as opções de resposta
            Collections.shuffle(opcoesResposta);
    
            // Exibindo as opções de resposta embaralhadas
            for (int i = 0; i < opcoesResposta.size(); i++) {
                System.out.println((char) ('a' + i) + ") " + opcoesResposta.get(i));
            }
    
            // Selecionando aleatoriamente a letra da resposta correta
            char letraRespostaCorreta = (char) ('a' + opcoesResposta.indexOf("x³ - 7x² + 6"));
    
            System.out.print("\nResposta: ");
            String resposta = sc.next();
            if (resposta.equalsIgnoreCase(String.valueOf(letraRespostaCorreta))) {
                System.out.println("Resposta correta! Parabéns!");
                break;
            } else {
                System.out.println("Resposta incorreta.");
                tentativas--;
                if (tentativas > 0) {
                    System.out.println("Tentativas restantes: " + tentativas);
                }
            }
    
            // Se for a última tentativa e ainda errar, exibe a resposta correta
            if (tentativas == 0) {
                System.out.println("Você excedeu o número de tentativas. A resposta correta era: " + letraRespostaCorreta + ") x³ - 7x² + 6");
            }
        }
    }
    // FIM DAS QUESTÕES DE SUBTRAÇÃO

    // -----------------------------------------------------------------------------------------------//

    // INÍCIO DAS QUESTÕES DE MULTIPLICAÇÃO!!
    // Função para a questão de multiplicação 1
    public static void exercicioMultiplicacao01() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int tentativas = 3;
    
        while (tentativas > 0) {
            System.out.println("\nQUESTÃO 1");
            System.out.println("========================================================");
            System.out.println("TUTORIAL:");
            System.out.println("\nPara multiplicar polinômios, usamos a propriedade distributiva.");
            System.out.println("Então, multiplicamos cada termo do primeiro polinômio pelo segundo polinômio:");
            System.out.println("(2x + 3) * (x² - 4x + 5) ");
            System.out.println("= 2x * (x² - 4x + 5) + 3 * (x² - 4x + 5)");
    
            System.out.println(
                    "\nAgora, distribuímos cada termo do primeiro polinômio para cada termo do segundo polinômio:");
            System.out.println("= 2x * x² - 2x * 4x + 2x * 5 + 3 * x² - 3 * 4x + 3 * 5");
            System.out.println("= 2x³ - 8x² + 10x + 3x² - 12x + 15");
    
            System.out.println("\nAgora, combinamos termos semelhantes:");
            System.out.println("= 2x³ + 3x² - 8x² - 8x + 10x + 15");
            System.out.println("= 2x³ - 5x² + 2x + 15");
    
            System.out.println("\nProblema: Multiplique o polinômio (2x + 3) pelo polinômio (x² - 4x + 5).");
        
            // Definindo as opções de resposta
            List<String> opcoesResposta = new ArrayList<>();
            opcoesResposta.add("2x³ + 5x² + 2x + 15");
            opcoesResposta.add("2x³ - 5x² + 2x + 15");
            opcoesResposta.add("2x³ + 5x² - 2x - 15");
            opcoesResposta.add("2x³ - 5x² - 2x - 15");
    
            // Embaralhando as opções de resposta
            Collections.shuffle(opcoesResposta);
    
            // Exibindo as opções de resposta embaralhadas
            for (int i = 0; i < opcoesResposta.size(); i++) {
                System.out.println((char) ('a' + i) + ") " + opcoesResposta.get(i));
            }
    
            // Selecionando aleatoriamente a letra da resposta correta
            char letraRespostaCorreta = (char) ('a' + opcoesResposta.indexOf("2x³ - 5x² + 2x + 15"));
    
            System.out.print("\nResposta: ");
            String resposta = sc.next();
            if (resposta.equalsIgnoreCase(String.valueOf(letraRespostaCorreta))) {
                System.out.println("Resposta correta! Parabéns!");
                break;
            } else {
                System.out.println("Resposta incorreta.");
                tentativas--;
                if (tentativas > 0) {
                    System.out.println("Tentativas restantes: " + tentativas);
                }
            }
    
            // Se for a última tentativa e ainda errar, exibe a resposta correta
            if (tentativas == 0) {
                System.out.println("Você excedeu o número de tentativas. A resposta correta era: " + letraRespostaCorreta + ") 2x³ - 5x² + 2x + 15");
            }
        }
    }

    // Função para a questão de multiplicação 2
    public static void exercicioMultiplicacao02() {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    int tentativas = 3;

    while (tentativas > 0) {
        System.out.println("\nQUESTÃO 2");
        System.out.println("========================================================");
        System.out.println("TUTORIAL:\n");
        System.out.println("Para multiplicar polinômios, usamos a propriedade distributiva.");
        System.out.println("Então, multiplicamos cada termo do primeiro polinômio pelo segundo polinômio:");
        System.out.println("(3x² + 2x - 1) * (4x - 3) ");
        System.out.println("= 3x² * (4x - 3) + 2x * (4x - 3) - 1 * (4x - 3)");

        System.out.println(
                "\nAgora, distribuímos cada termo do primeiro polinômio para cada termo do segundo polinômio:");
        System.out.println("= 12x³ - 9x² + 8x² - 6x - 4x + 3");

        System.out.println("\nAgora, combinamos termos semelhantes:");
        System.out.println("= 12x³ - x² + 2x + 3");
        System.out.println("\nProblema: Multiplique o polinômio (3x² + 2x - 1) pelo polinômio (4x - 3).");

        // Definindo as opções de resposta
        List<String> opcoesResposta = new ArrayList<>();
        opcoesResposta.add("12x³ + x² + 2x + 3");
        opcoesResposta.add("12x³ - x² + 2x + 3");
        opcoesResposta.add("12x³ - x² - 2x + 3");
        opcoesResposta.add("12x³ - x² - 2x - 3");

        // Embaralhando as opções de resposta
        Collections.shuffle(opcoesResposta);

        // Exibindo as opções de resposta embaralhadas
        for (int i = 0; i < opcoesResposta.size(); i++) {
            System.out.println((char) ('a' + i) + ") " + opcoesResposta.get(i));
        }

        // Selecionando aleatoriamente a letra da resposta correta
        char letraRespostaCorreta = (char) ('a' + opcoesResposta.indexOf("12x³ - x² + 2x + 3"));

        System.out.print("\nResposta: ");
        String resposta = sc.next();
        if (resposta.equalsIgnoreCase(String.valueOf(letraRespostaCorreta))) {
            System.out.println("Resposta correta! Parabéns!");
            break;
        } else {
            System.out.println("Resposta incorreta.");
            tentativas--;
            if (tentativas > 0) {
                System.out.println("Tentativas restantes: " + tentativas);
            }
        }

        // Se for a última tentativa e ainda errar, exibe a resposta correta.
        if (tentativas == 0) {
            System.out.println("Você excedeu o número de tentativas. A resposta correta era: " + letraRespostaCorreta + ") 12x³ - x² + 2x + 3");
        }
    }
}
    // FIM DAS QUESTÕES DE MULTIPLICAÇÃO!!

    // ------------------------------------------------------------------------------------------------//

    // INÍCIO DAS QUESTÕES DO BOSS!!
    // Função para a questão BOSS 1
    public static void exercicioBoss01() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int tentativas = 3;
    
        while (tentativas > 0) {
            System.out.println("\nQUESTÃO 1");
            System.out.println("========================================================");
    
            System.out.println("TUTORIAL:");
            System.out.println("\nPara dividir polinômios, usamos a divisão polinomial.");
            System.out.println("1. Organize o polinômio de acordo com as potências decrescentes de x.");
            System.out.println("2. Divida o termo de maior grau do dividendo pelo termo de maior grau do divisor.");
            System.out.println("3. Multiplique o divisor pelo quociente encontrado e subtraia do dividendo.");
            System.out.println("4. Repita o processo até que o grau do resto seja menor que o grau do divisor.");
    
            System.out.println("(6x³ + 5x² - 4x + 8) ÷ (2x - 1)");
            System.out.println("\nPasso 1:");
            System.out.println("Grau do dividendo: 3");
            System.out.println("Grau do divisor: 1");
    
            System.out.println("\nPasso 2:");
            System.out.println("6x³ ÷ 2x = 3x²");
    
            System.out.println("\nPasso 3:");
            System.out.println("(3x²) (2x - 1) = 6x³ - 3x²");
            System.out.println("(6x³ + 5x² - 4x + 8) - (6x³ - 3x²) = 5x² - 4x + 8");
    
            System.out.println("\nPasso 4:");
            System.out.println("Grau do novo dividendo: 2");
            System.out.println("Grau do divisor: 1");
    
            System.out.println("\nPasso 5:");
            System.out.println("5x² ÷ 2x = (5/2) x");
    
            System.out.println("\nPasso 6:");
            System.out.println("((5/2) x) (2x - 1) = (5/2) x² - (5/2) x");
            System.out.println("(5x² - 4x + 8) - ((5/2) x² - (5/2) x) = (5/2) x - 4x + 8");
    
            System.out.println("\nPasso 7:");
            System.out.println("Grau do novo dividendo: 1");
            System.out.println("Grau do divisor: 1");
    
            System.out.println("\nPasso 8:");
            System.out.println("(5/2) x ÷ 2x = 5/4");
    
            System.out.println("\nPasso 9:");
            System.out.println("((5/4)) (2x - 1) = (5/2) x - (5/4)");
            System.out.println("((5/2) x - 4x + 8) - ((5/2) x - (5/4)) = 4x + 8 + (5/4)");
    
            System.out.println(
                    "\nComo o grau do novo dividendo é menor que o grau do divisor, o processo de divisão termina.");
    
            System.out.println("Portanto, o quociente é 3x² + (5/2) x + (5/4) e o resto é 4x + 8 + (5/4).");
            System.out.println("\n\nProblema: Divida o polinômio (6x³ + 5x² - 4x + 8) por (2x - 1).");
    
            // Definindo as opções de resposta
            List<String> opcoesResposta = new ArrayList<>();
            opcoesResposta.add("3x² - 5/2x + 5/4");
            opcoesResposta.add("3x² + 5/2x + 5/4");
            opcoesResposta.add("3x² + 5/2x - 5/4");
            opcoesResposta.add("3x² - 5/2x - 5/4");
    
            // Embaralhando as opções de resposta
            Collections.shuffle(opcoesResposta);
    
            // Exibindo as opções de resposta embaralhadas
            for (int i = 0; i < opcoesResposta.size(); i++) {
                System.out.println((char) ('a' + i) + ") " + opcoesResposta.get(i));
            }
    
            // Selecionando aleatoriamente a letra da resposta correta
            char letraRespostaCorreta = (char) ('a' + opcoesResposta.indexOf("3x² - 5/2x - 5/4"));
    
            System.out.print("\nResposta: ");
            String resposta = sc.next();
            if (resposta.equalsIgnoreCase(String.valueOf(letraRespostaCorreta))) {
                System.out.println("Resposta correta! Parabéns!");
                break;
            } else {
                System.out.println("Resposta incorreta.");
                tentativas--;
                if (tentativas > 0) {
                    System.out.println("Tentativas restantes: " + tentativas);
                }
            }
    
            // Se for a última tentativa e ainda errar, exibe a resposta correta
            if (tentativas == 0) {
                System.out.println("Você excedeu o número de tentativas. A resposta correta era: " + letraRespostaCorreta + ") 3x² - 5/2x - 5/4");
            }
        }
    }

    // Função para a questão BOSS 2
    public static void exercicioBoss02() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int tentativas = 3;
    
        while (tentativas > 0) {
            System.out.println("\nQUESTÃO 2");
            System.out.println("========================================================");
    
            System.out.println("TUTORIAL:");
            System.out.println("Para multiplicar polinômios, usamos a propriedade distributiva.");
            System.out.println("Então, multiplicamos cada termo do primeiro polinômio pelo segundo polinômio:");
            System.out.println("(x² + 3x - 2) * (2x² - 5x + 1) ");
            System.out.println("= x² * (2x² - 5x + 1) + 3x * (2x² - 5x + 1) - 2 * (2x² - 5x + 1)");
    
            System.out.println(
                    "\nAgora, distribuímos cada termo do primeiro polinômio para cada termo do segundo polinômio:");
            System.out.println("= 2x^4 - 5x³ + x² + 6x³ - 15x² + 3x - 4x² + 10x - 2");
    
            System.out.println("\nAgora, combinamos termos semelhantes:");
            System.out.println("= 2x^4 + (6x³ - 5x³) + (-15x² - 4x²) + (3x + 10x) - 2");
            System.out.println("= 2x^4 + x³ - 19x² + 13x - 2");
            System.out.println("\nProblema: Multiplique o polinômio (x² + 3x - 2) por (2x² - 5x + 1).");
    
            // Definindo as opções de resposta
            List<String> opcoesResposta = new ArrayList<>();
            opcoesResposta.add("2x^4 - x³ + 19x² - 13x + 2");
            opcoesResposta.add("2x^4 + x³ - 19x² + 13x - 2");
            opcoesResposta.add("2x^4 + x³ - 19x² - 13x - 2");
            opcoesResposta.add("2x^4 + x³ - 19x² + 13x - 2");
    
            // Embaralhando as opções de resposta
            Collections.shuffle(opcoesResposta);
    
            // Exibindo as opções de resposta embaralhadas
            for (int i = 0; i < opcoesResposta.size(); i++) {
                System.out.println((char) ('a' + i) + ") " + opcoesResposta.get(i));
            }
    
            // Selecionando aleatoriamente a letra da resposta correta
            char letraRespostaCorreta = (char) ('a' + opcoesResposta.indexOf("2x^4 - x³ + 19x² - 13x + 2"));
    
            System.out.print("\nResposta: ");
            String resposta = sc.next();
            if (resposta.equalsIgnoreCase(String.valueOf(letraRespostaCorreta))) {
                System.out.println("Resposta correta! Parabéns!");
                break;
            } else {
                System.out.println("Resposta incorreta.");
                tentativas--;
                if (tentativas > 0) {
                    System.out.println("Tentativas restantes: " + tentativas);
                }
            }
    
            // Se for a última tentativa e ainda errar, exibe a resposta correta
            if (tentativas == 0) {
                System.out.println(
                        "Você excedeu o número de tentativas. A resposta correta era: " + letraRespostaCorreta + ") 2x^4 - x³ + 19x² - 13x + 2");
            }
        }
    }

    // Função para a questão BOSS 3
    public static void exercicioBoss03() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int tentativas = 3;
    
        while (tentativas > 0) {
            System.out.println("\nQUESTÃO 3");
            System.out.println("========================================================");
            System.out.println("\nTUTORIAL:");
            System.out.println("Para multiplicar polinômios, usamos a propriedade distributiva.");
            System.out.println("Então, multiplicamos cada termo do primeiro polinômio pelo segundo polinômio:");
            System.out.println("(3x² - 2x + 5) * (4x - 1) ");
            System.out.println("= 3x² * (4x - 1) - 2x * (4x - 1) + 5 * (4x - 1)");
    
            System.out.println(
                    "\nAgora, distribuímos cada termo do primeiro polinômio para cada termo do segundo polinômio:");
            System.out.println("= 12x³ - 3x² - 8x² + 2x + 20x - 5");
    
            System.out.println("\nAgora, combinamos termos semelhantes:");
            System.out.println("= 12x³ - (3x² + 8x²) + (2x + 20x) - 5");
            System.out.println("= 12x³ - 11x² + 22x - 5");
    
            System.out.println("\nProblema: Multiplique o polinômio (3x² - 2x + 5) por (4x - 1).");
            System.out.println("Qual é o resultado da operação?");
    
            // Definindo as opções de resposta
            List<String> opcoesResposta = new ArrayList<>();
            opcoesResposta.add("12x³ - 11x² + 22x - 5");
            opcoesResposta.add("12x³ + 11x² - 22x + 5");
            opcoesResposta.add("12x³ + 11x² + 22x - 5");
            opcoesResposta.add("12x³ - 11x² - 22x + 5");
    
            // Embaralhando as opções de resposta
            Collections.shuffle(opcoesResposta);
    
            // Exibindo as opções de resposta embaralhadas
            for (int i = 0; i < opcoesResposta.size(); i++) {
                System.out.println((char) ('a' + i) + ") " + opcoesResposta.get(i));
            }
    
            // Selecionando aleatoriamente a letra da resposta correta
            char letraRespostaCorreta = (char) ('a' + opcoesResposta.indexOf("12x³ - 11x² + 22x - 5"));
    
            System.out.print("\nResposta: ");
            String resposta = sc.next();
            if (resposta.equalsIgnoreCase(String.valueOf(letraRespostaCorreta))) {
                System.out.println("Resposta correta! Parabéns!");
                break;
            } else {
                System.out.println("Resposta incorreta.");
                tentativas--;
                if (tentativas > 0) {
                    System.out.println("Tentativas restantes: " + tentativas);
                }
            }
    
            // Se for a última tentativa e ainda errar, exibe a resposta correta
            if (tentativas == 0) {
                System.out.println(
                        "Você excedeu o número de tentativas. A resposta correta era: " + letraRespostaCorreta + ") 12x³ - 11x² + 22x - 5");
            }
        }
    }
    // FIM DAS QUEESTÕES DO BOSS!!
//------------------------------------------- FIM DAS 10 QUESTÕES ------------------------------------------


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
            System.out.println("[1] Jonn\n\nVida: 50\nAgilidade: 60\nDano: 8%\n");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
            System.out.println("[2] Anne\n\nVida: 50\nAgilidade: 80\nDano: 6%\n");

            System.out.print("OPÇÃO DESEJADA: ");
            opcao = sc.nextInt();
            System.out.println("");

            if (opcao == 1) {
                // Colorindo a String no Console
                System.out.println("PERSONAGEM ESCOLHIDO: \u001B[36mJONN\u001B[0m\n");
                vida = 50;
                agilidade = 60;
                dano = 0.8;
            } else if (opcao == 2) {
                // Colorindo a String no Console utilizando \u001B[36m e outros.
                System.out.println("PERSONAGEM ESCOLHIDO: \u001B[36mANNE\u001B[0m\n");
                vida = 50;
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
                "                                                                                                              \n"+
                "                                                                                mm########                    \n"+
                "                                                                            ..@@            ##                \n"+
                "                                                                          @@--                ##              \n"+
                "                                                                        ..--                    ##            \n"+
                "                                                                        @@                        ++          \n"+
                "                                                                      ##                          ##          \n"+
                "                                                                    ##              MMMMM          mm         \n"+
                "                                                                  ++              ##    MM         ++         \n"+
                "                                                                  ++            ##  ##  MM         --         \n"+
                "                                                              ####            MM   ###  MM        ##          \n"+
                "                                                        ####  mm              ##  ##  ##         mm           \n"+
                "                                                      ##@@    ##              ##     ##         ##            \n"+
                "                                                    ##  @@     :               #..##::         ++             \n"+
                "                                      ----####MMm         ::  :      ###                      MM              \n"+
                "                      mm##mm--++++..                      ##  :     ######                   ##               \n"+
                "                    ##                                      --+    ########                ++                 \n"+
                "                  mm                                        MM:   ##################      MM                  \n"+
                "                  ##                                        ##:   #################    ##                     \n"+
                "                                                            ##-   ###############    ++..                     \n"+
                "                mm                                          MM    ############    ####                        \n"+
                "                ##                                          ::     M########      ##    ##                    \n" +
                "              ++                                              ::    @@##      ----        ##..                \n"+
                "              @@                                              ##            @@                ##              \n"+
                "            ::                                                  ##      ::##                    @@::          \n"+
                "            ##                                                    ..mm                              ##        \n"+
                "          ..--                                                                                        ##..    \n"+
                "          mm                                                                                            ##    \n"+
                "          ##                                                                                            @@    \n"+
                "          ::                                                                                            ##    \n"+
                "        --                                                                                              ##    \n"+
                "        ##                                                                                              ##    \n"+
                "        @@                                                                                              ##    \n"+
                "                             m                                                                          ##    \n"+
                "      mm                    ..                                                              m           ##    \n"+
                "      ##                    ++                                                              mm          mm    \n"+
                "      ##                    MM                                                              mm          ..    \n"+
                "      @@                    ##                                                              mm          --    \n"+
                "      @@                    ##                                                              --          ++    \n"+
                "      --                    --                                                              ##          ::    \n"+
                "      mm                    mm                                                              --          ##    \n";

        // System.out.println("\u001B[31m" + primeiroMob + "\u001B[0m");
        // System.out.println(primeiroMob);

        String MobPequeno = "                                                            \n" +
                "                      ::######MM######@@                    \n" +
                "                ..##                        MM##            \n" +
                "              ##                                --++        \n" +
                "            ##                                      ##      \n" +
                "          ##                                          ##    \n" +
                "        ++                                              ##  \n" +
                "                                                        ##  \n" +
                "      @@                                                    \n" +
                "    --                                                    MM\n" +
                "    ::                                                    ##\n" +
                "  ..                                                      ++\n" +
                "  ##                                                        \n" +
                "  ..                                                        \n" +
                "              ####                          ####            \n" +
                "            ########                      ########          \n" +
                "  --        ########                      @@####..          \n" +
                "  mm          mmMM                          ++              \n" +
                "  MM                                                      --\n" +
                "  ##                                                      ++\n" +
                "  ##                                                      ##\n" +
                "  --                                                      ##\n" +
                "    ##                                                      \n" +
                "    mm                                            ..##  MM  \n" +
                "    ..   #                                      ####    MM  \n" +
                "    ..   MM##                                ######    --   \n" +
                "     ##    ####@@                        ####--##      ##   \n" +
                "      mm     ########            ..######  --##..           \n" +
                "              --##  --############      ..##--      ##      \n" +
                "        ##        ####                ####mm                \n" +
                "        --          ####..        --####          ##        \n" +
                "          ##            ####  ++####++          mm          \n" +
                "            mm            @@####::            ++            \n" +
                "              ..                                            \n" +
                "                --                          ##              \n" +
                "                  ##                      ##                \n" +
                "                    --@@                --                  \n" +
                "                        MM##::    ..@@                      \n";

        // System.out.println("\u001B[31m" + MobPequeno + "\u001B[0m");
        // System.out.println(MobPequeno);

        // Começando o jogo e as histórias
        historiaInicial();
        escolherCaminhoPrincipal(input);
        // Escolher arma e definir o dano e o status atual.
        danoArma = primeiraSala(input, agilidadePersonagem);
        if(danoArma == 10){
            agilidadePersonagem -= 10;
        }
        danoGeral = (dano * danoArma) + danoArma;
        clearConsole();
        statusAtual(vidaPersonagem, agilidadePersonagem, danoGeral);
        // FAZER FUNÇÃO DE AO FINALIZAR BUSCA PELA SALA, O PERSONAGEM SE DEPARA COM UM
        // MONSTRO NA PORTA ANTES (SENDO A PRIMEIRA BOSS FIGHT)
        System.out.println("\n\n=-=-=-=-=-=-=-=-= VOCÊ VOLTOU PARA O CORREDOR =-=-=-=-=-=-=-=-=\n\n");
        corredor(input);
        refeitorio(input);
        saidaRefeitorio(input, MobPequeno, danoGeral);

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
            System.out.println("O que eu devo fazer?");
            System.out.println("== [1] Procurar sua casa. [2] Procurar ajuda. [3] Entrar na escola. ==\n");
            System.out.print("== OPÇÃO DESEJADA: ");
            escolhaPrincipal = input.nextInt();

            if (escolhaPrincipal == 1) {
                System.out.println("\nNão é uma boa ideia, imagino que eu não esteja perto de casa\n");
            } else if (escolhaPrincipal == 2) {
                System.out.println(
                        "\nNão é uma boa ideia, não consigo enxergar nada além dessa escola e não acho que teria alguém por perto\n");
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
        System.out.println("== Você se encontra em um corredor imenso e tem duas portas próximas a você. ==");
        System.out.println("== Você precisar entrar em uma dessas salas para procurar algo para se proteger... ==");

        do {
            System.out.println("\n\n== Você deseja entrar na sala a ESQUERDA ou a DIREITA? ==\n");
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
        System.out.println("== Você se encontra em uma sala de aula com as mesas e cadeiras reviradas. ==");

        do {
            System.out.println(" == Você deseja: [1] EXPLORAR a sala [2] VOLTAR? ==\n");
            System.out.print("== OPÇÃO DESEJADA: ");
            primeiraOpcao = input.nextInt();

            if (primeiraOpcao == 1) {
                System.out.println("\nVocê decidiu explorar a sala.");
                System.out.println("\nPROCURANDO...\n");
                Thread.sleep(1500);
                System.out.println("== Você olhou nas mesas e nas cadeiras e não encontrou nada! ==");
                System.out.println("== Você deseja: [1] PROCURAR no armário [2] VOLTAR para o corredor ==\n");
                System.out.print("== OPÇÃO DESEJADA: ");
                segundaOpcao = input.nextInt();

                do {
                    if (segundaOpcao == 1) {
                        System.out.println("\nVocê decidiu olhar o armário.");
                        System.out.println("\nPROCURANDO...\n");
                        Thread.sleep(1000);
                        System.out.println("== Você encontrou uma maçã apodrecida e uns papéis. ==");
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

        System.out.println("\n== Você se encontra em uma sala com poucas mesas. ==");
        System.out.println("== Você acha que viu algo para se proteger perto da mesa do professor. ==");
        System.out.println("== Você deseja ir [1] OLHAR a mesa do professor ou deseja ir [2] EMBORA ==\n");
        System.out.print("== OPÇÃO DESEJADA: ");
        opcaoSala = input.nextInt();
        if (opcaoSala == 1) {
            do {
                System.out.println(
                        "\n== Você encontra uma TESOURA e uma FACA na mesa do professor, qual você deseja pegar? ==\n");
                System.out.println("[1] FACA\n\nDano: 10\nAgilidade: -10\n");
                System.out.println("[2] TESOURA\n\nDano: 7\nAgilidade: 10\n");

                System.out.print("OPÇÃO DESEJADA: ");
                opcaoPrimeiraArma = input.nextInt();

                if (opcaoPrimeiraArma == 1) {
                    System.out.println("== Você pegou a FACA! ==\n");
                    danoArma = 10;
                    agilidadePersonagem -= 10;
                } else if (opcaoPrimeiraArma == 2) {
                    System.out.println("== Você pegou a TESOURA! ==\n");
                    danoArma = 7;
                    agilidadePersonagem += 10;
                } else {
                    System.out.println("== OPÇÃO INVÁLIDA!\n");
                }

            } while (opcaoPrimeiraArma < 1 || opcaoPrimeiraArma > 2);

            return danoArma;
        } else if (opcaoSala == 2) {
            System.out.println("== Você decidiu ir embora... ==");
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
    public static int corredor (Scanner sc){
        int corredor;
        do {
            System.out.println("== Após a escolha da arma, você volta para o corredor \nPorém você escuta alguém abrindo a porta principal da escola ==");
            System.out.println("== Você deseja: [1] Correr até o final do corredor [2] Entrar em uma das salas ==\n");
            System.out.print("== OPÇÃO DESEJADA: ");
            corredor = sc.nextInt();

            if (corredor == 1) {
                System.out.println("\n == Você corre e entra em um armário, você consegue ver um ser andando e passando reto pelo armário, parece que você está salvo ==\n\n- Mas o que é aquilo? eu não sei o que ta acontecendo e não sei que tipo de monstro é aquele, eu tenho que sair daqui\n");
            } else if (corredor == 2) {
                System.out.println(
                        "\nSe eu entrar nessa sala ele poderia me ouvir, eu acabaria morrendo, melhor não\n");
            } else if (corredor > 2 || corredor < 1) {
                System.out.println("OPÇÃO INVÁLIDA!\n");
            }
        } while (corredor != 1);

        return 0;
    }
    public static int refeitorio (Scanner sc) throws InterruptedException{
        int refeitorio;
        do {
            System.out.println("== Você sai do armário, onde deseja entrar? ==");
            System.out.println("== Você deseja: [1] Refeitório [2] Sala 101 [3] Sala 103 ==\n");
            System.out.print("== OPÇÃO DESEJADA: ");
            refeitorio = sc.nextInt();

            if (refeitorio == 1) {
                System.out.println("== Assim que você entra você vê vários papéis espalhados com um idioma que você jamais entenderia \nO que são esses tantos de papéis? ==");
                System.out.println("== Він знає, що ти тут, він іде за тобою, він збирається послати всю свою армію == \nIsso é russo??? Eu realmente não consigo entender isso...");
                Thread.sleep(5000);
                clearConsole();
                System.out.println("\nO que é isso?");
                System.out.println("== Você encontrou um mapa. 1/7 ==");
                Thread.sleep(1000);
                //Colocar o cara pra pegar arma
            } else if (refeitorio == 2) {
                System.out.println("Acabei entrando na sala, parece ser ");
            } else if (refeitorio == 3) {
                        System.out.println("Está trancado.");
            } else if (refeitorio > 3 || refeitorio < 1) {
                System.out.println("OPÇÃO INVÁLIDA!\n");
            }
        } while (refeitorio != 1);

            return 0;
        }
        public static int saidaRefeitorio (Scanner sc, String mob, double dano) throws InterruptedException{

            String voceMorreu = 
            " ██▒   █▓ ▒█████   ▄████▄  ▓█████     ███▄ ▄███▓ ▒█████   ██▀███   ██▀███  ▓█████  █    ██     ▐██▌ \n" +
            "▓██░   █▒▒██▒  ██▒▒██▀ ▀█  ▓█   ▀    ▓██▒▀█▀ ██▒▒██▒  ██▒▓██ ▒ ██▒▓██ ▒ ██▒▓█   ▀  ██  ▓██▒    ▐██▌ \n" +
            " ▓██  █▒░▒██░  ██▒▒▓█    ▄ ▒███      ▓██    ▓██░▒██░  ██▒▓██ ░▄█ ▒▓██ ░▄█ ▒▒███   ▓██  ▒██░    ▐██▌ \n" +
            "  ▒██ █░░▒██   ██░▒▓▓▄ ▄██▒▒▓█  ▄    ▒██    ▒██ ▒██   ██░▒██▀▀█▄  ▒██▀▀█▄  ▒▓█  ▄ ▓▓█  ░██░    ▓██▒ \n" +
            "   ▒▀█░  ░ ████▓▒░▒ ▓███▀ ░░▒████▒   ▒██▒   ░██▒░ ████▓▒░░██▓ ▒██▒░██▓ ▒██▒░▒████▒▒▒█████▓     ▒▄▄  \n" +
            "   ░ ▐░  ░ ▒░▒░▒░ ░ ░▒ ▒  ░░░ ▒░ ░   ░ ▒░   ░  ░░ ▒░▒░▒░ ░ ▒▓ ░▒▓░░ ▒▓ ░▒▓░░░ ▒░ ░░▒▓▒ ▒ ▒     ░▀▀▒ \n" +
            "   ░ ░░    ░ ▒ ▒░   ░  ▒    ░ ░  ░   ░  ░      ░  ░ ▒ ▒░   ░▒ ░ ▒░  ░▒ ░ ▒░ ░ ░  ░░░▒░ ░ ░     ░  ░ \n" +
            "     ░░  ░ ░ ░ ▒  ░           ░      ░      ░   ░ ░ ░ ▒    ░░   ░   ░░   ░    ░    ░░░ ░ ░        ░   \n" +
            "      ░      ░ ░  ░ ░         ░  ░          ░       ░ ░     ░        ░        ░  ░   ░         ░       \n" +
            "     ░            ░                                                                                      \n";
            int mapaUm;
            int opcao;
            do {
                System.out.println("\nUm pedaço de um mapa? Se parece com o mapa que eu sonhei mas...por quê?");
                System.out.println("== Você deseja: [1] Sair do Refeitório [2] Explorar mais ==\n");
                System.out.print("== OPÇÃO DESEJADA: ");
                mapaUm = sc.nextInt();
    
                if (mapaUm == 1) {
                    System.out.println("\n ==  Você começa á sair do refeitório quando de repente aparece 2 monstros na porta ==");
                    System.out.println(mob);
                    Thread.sleep(7000);
                    clearConsole();
                    do {
                        System.out.println("\nO que devo fazer? [1] Usar para tentar ... bater neles  [2] Correr");
                        System.out.print("== Opção desejada: ");
                        opcao = sc.nextInt();
                        if (opcao == 1){
                            System.out.println("\nÉ preciso fazer uma conta para dar dano á eles: \n");
                            //questao1
                            int questao1 = exercicioAdicao01();
                            if(questao1 == 10){
                                Thread.sleep(7000);
                                clearConsole();
                                System.out.println(voceMorreu);
                                Thread.sleep(10000);
                                System.exit(0);
                            } else{
                                System.out.println("\n\n== Você conseguiu derrotar o primeiro monstro, falta apenas mais um. ==\n\n");
                            }
                            //questao2
                            int questao2 = exercicioAdicao02();
                            if(questao2 == 10){
                                Thread.sleep(7000);
                                clearConsole();
                                System.out.println(voceMorreu);
                                Thread.sleep(10000);
                                System.exit(0);
                            } else{
                                System.out.println("\n\n== Você conseguiu derrotar o último monstro. ==\n\n");
                            }

                            //colocar a arma
                            System.out.printf("Você acertou: %.2f de dano em cada monstro.\n\n== Os monstros estao mortos! ==\n", dano);
                            Thread.sleep(3000);
                            System.out.println("CONTA??? MATEMÁTICA??? Isso é muito estranho, eu não sei o que está acontecendo");
                            System.out.println("\n\n==== Você saiu do refeitório ====");
                        }else if (opcao == 2){
                            System.out.println("Eles são muito rápidos, não consigo fugir deles\n");
                        }
                    } while (opcao != 1);
                } else if (mapaUm == 2) {
                    System.out.println("\nSó vejo um monte de papéis, não consigo entender nada\n");
                }
            } while (mapaUm != 1);
    
            return 0;
        }
}
