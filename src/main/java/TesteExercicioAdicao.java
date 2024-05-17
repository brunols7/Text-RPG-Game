import java.util.Random;

public class TesteExercicioAdicao {

    // Função para o exercício de adição 1 modificada para aceitar uma resposta simulada
    public static int exercicioAdicao01(String respostaSimulada) {
        Random rand = new Random();

        int tentativas = 3;
        int danoTomado = 0;

        while (tentativas > 0) {
            System.out.println("\nQUESTÃO 1");
            System.out.println("========================================================");
            pause(2000); // Pausa de 2 segundos

            System.out.println("TUTORIAL:");
            pause(2000); // Pausa de 2 segundos

            System.out.println(
                    "Para somar polinômios, basta somar os termos semelhantes. Termos semelhantes são aqueles que têm a mesma parte literal (as variáveis) elevada à mesma potência.\n");
            pause(2000); // Pausa de 3 segundos

            System.out.println("PASSO 1: ");
            pause(1000); // Pausa de 1 segundo

            System.out.println("Então, somamos os termos semelhantes de cada polinômio:\r\n"
                    + "(3x² + 5x + 4) + (2x² - 3x + 1) \r\n"
                    + "= (3x² + 2x²) + (5x - 3x) + (4 + 1)\r\n");
            pause(2000); // Pausa de 3 segundos

            System.out.println("PASSO 2:");
            pause(1000); // Pausa de 1 segundo

            System.out.println("Agora, somamos cada grupo de termos semelhantes:\r\n"
                    + "3x² + 2x² = 5x²\r\n"
                    + "5x - 3x = 2x\r\n"
                    + "4 + 1 = 5\r\n");
            pause(2000); // Pausa de 3 segundos

            System.out.println(
                "Problema: Qual é o resultado da adição dos polinômios (3x² + 5x + 4) e (2x² - 3x + 1)?\n");
            pause(2000); // Pausa de 2 segundos

            // Lista de opções de resposta
            String[] opcoesResposta = new String[]{
                    "5x² - x + 3",
                    "5x² - x + 5",
                    "5x² + 2x + 5",
                    "5x² + 2x + 3"
            };

            // Embaralha as opções de resposta
            for (int i = 0; i < opcoesResposta.length; i++) {
                int indiceAleatorio = rand.nextInt(opcoesResposta.length);
                String temp = opcoesResposta[i];
                opcoesResposta[i] = opcoesResposta[indiceAleatorio];
                opcoesResposta[indiceAleatorio] = temp;
            }

            // Exibe as opções de resposta com as letras (a, b, c, d)
            for (int i = 0; i < opcoesResposta.length; i++) {
                System.out.println((char) ('a' + i) + ") " + opcoesResposta[i]);
            }
            pause(3000); // Pausa de 3 segundos

            String resposta = respostaSimulada;
            System.out.println("\nResposta: " + resposta);
            pause(2000); // Pausa de 2 segundos

            int posicaoRespostaCorreta = opcoesResposta[2].equals("5x² + 2x + 5") ? 2 :
                    opcoesResposta[1].equals("5x² + 2x + 5") ? 1 :
                            opcoesResposta[0].equals("5x² + 2x + 5") ? 0 : 3;

            int respostaUsuario = resposta.toLowerCase().charAt(0) - 'a';

            if (respostaUsuario == posicaoRespostaCorreta) {
                System.out.println("Resposta correta! Parabéns!\n");
                break;
            } else {
                System.out.println("Resposta incorreta.\n");
                tentativas--;
                if (tentativas > 0) {
                    System.out.println("Tentativas restantes: " + tentativas + "\n");
                    pause(2000); // Pausa de 2 segundos
                }
            }

            if (tentativas == 0) {
                System.out.println("Você excedeu o número de tentativas. A resposta correta era: c) 5x² + 2x + 5\n");
                danoTomado = 10;
            }
        }
        
        return danoTomado;
    }

    // Função para pausar a execução por um tempo específico (em milissegundos)
    public static void pause(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            System.err.println("Erro durante a pausa: " + e.getMessage());
        }
    }

    // Função principal para testar o exercício
    public static void main(String[] args) {
        // Teste com a resposta correta simulada (aqui, ajustamos a letra conforme necessário)
        int resultadoTeste1 = exercicioAdicao01("c");
        System.out.println("Resultado do teste com a resposta 'c': " + resultadoTeste1);
        
        // Teste com uma resposta incorreta simulada
        int resultadoTeste2 = exercicioAdicao01("a");
        System.out.println("Resultado do teste com a resposta 'a': " + resultadoTeste2);
        
        int resultadoTeste3 = exercicioAdicao01("b");
        System.out.println("Resultado do teste com a resposta 'b': " + resultadoTeste3);
        
        // Teste com outra resposta simulada "d"
        int resultadoTeste4 = exercicioAdicao01("d");
        System.out.println("Resultado do teste com a resposta 'd': " + resultadoTeste4);
    
    }
}
