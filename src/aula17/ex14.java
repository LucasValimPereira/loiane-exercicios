package aula17;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtdPares = 0;
        int qtdImpares = 0;

        for (int i = 0; i <= 10; i++) {
            System.out.println("Digite " + i +"º número: ");
            int numeros = sc.nextInt();
            if (numeros % 2 == 0) {
                qtdPares++;
            }
            if (numeros % 2 != 0) {
                qtdImpares++;
            }
        }

        System.out.println("quantidades de pares: " + qtdPares);
        System.out.println("quantidades de impares: " + qtdImpares);
        System.out.println();
        sc.close();
    }
}
