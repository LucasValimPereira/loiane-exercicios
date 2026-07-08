package aula17;

import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int maiorValor = Integer.MIN_VALUE;
        int menorValor = Integer.MAX_VALUE;
        int soma = 0;

        for (int i = 0; i <= 5; i++) {

            while (true) {
                System.out.print("Digite o " + i + "º valor: ");
                n = sc.nextInt();

                if (n < 0 || n > 1000) {
                    System.out.println("Valor inválido! Digite um número entre 0 e 1000");
                } else {
                    break;
                }
                soma += n;

                if (n > maiorValor) {
                    maiorValor = n;
                }
                if (n < menorValor) {
                    menorValor = n;
                }
            }

        }
        System.out.println("O maior valor é :" + maiorValor);
        System.out.println("O maior valor é :" + menorValor);
        System.out.println("A soma total é :" + soma);
        sc.close();
    }
}
