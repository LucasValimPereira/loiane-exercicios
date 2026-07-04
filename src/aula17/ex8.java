package aula17;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int soma = 0;
        int media = 0;

        for (int i = 0; i < 5 ; i++) {
            System.out.println("Informe o número: ");
            numero = sc.nextInt();
            soma += numero;
            media = numero / 2;
        }

        System.out.println("A soma total é " + soma);
        System.out.println("A média da soma é " + media);
        sc.close();
    }
}
