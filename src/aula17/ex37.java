package aula17;

import java.util.Scanner;

public class ex37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean rodando = true;
        int cod = 0;
        float alt = 0, peso = 0;
        float mediaAltura = 0, mediaPesos = 0;
        float maisAlto = Float.MAX_VALUE, maisBaixo = Float.MAX_VALUE;
        float maisGordo = Float.MAX_VALUE, maisMagro = Float.MAX_VALUE;
        float somaAlturas = 0, somaPesos = 0;
        int codMaisAlto = 0, codMaisBaixo = 0, codMaisGordo = 0, codMaisMagro = 0;
        int contador = 0;
        while (rodando) {
            System.out.println("Digite seu código(sair=0): ");
            cod = sc.nextInt();

            if (cod == 0) {
                rodando = false;
                continue;
            }
            contador++;

            System.out.println("Sua altura (ex: 1,75): ");
            alt = sc.nextFloat();
            somaAlturas += alt;
            System.out.println("Seu peso (ex: 60,5):");
            peso = sc.nextFloat();
            somaPesos += peso;

            if (contador == 1) {
                maisAlto = maisBaixo = alt;
                maisGordo = maisMagro = peso;

                codMaisAlto = codMaisBaixo = cod;
                codMaisGordo = codMaisMagro = cod;
            } else {
                // Atualização para as próximas pessoas do laço
                if (alt > maisAlto) {
                    maisAlto = alt;
                    codMaisAlto = cod;
                }
                if (alt < maisBaixo) {
                    maisBaixo = alt;
                    codMaisBaixo = cod;
                }
                if (peso > maisGordo) {
                    maisGordo = peso;
                    codMaisGordo = cod;
                }
                if (peso < maisMagro) {
                    maisMagro = peso;
                    codMaisMagro = cod;
                }

            }
            if (contador > 0) {
                mediaAltura = somaAlturas / contador;
                mediaPesos = somaPesos / contador;

                System.out.printf("O mais alto: Código %d, %.2f \n", codMaisAlto, maisAlto);
                System.out.printf("O mais baixo: Código %d, %.2f \n", codMaisBaixo, maisBaixo);
                System.out.printf("O mais gordo: Código %d, %.2f \n", codMaisGordo, maisGordo);
                System.out.printf("O mais magro: Código %d, %.2f \n", codMaisMagro, maisMagro);
                System.out.printf("Média de altura da turma: %.2f \n", mediaAltura);
                System.out.printf("Média de peso da turma: %.2f \n", mediaPesos);
            } else {
                System.out.println("nenhum dado foi inserido");
            }

            sc.close();

        }
    }
}
