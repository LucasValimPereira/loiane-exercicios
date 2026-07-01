package aula17;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean valorValido = false;

        int num = 0;
        while (!valorValido) {

            System.out.println("digite um número entre 0 e 10:");

            if (sc.hasNextInt()) {
                num = sc.nextInt();

                if (num > 0 && num <= 10) {
                    valorValido = true;
                } else {
                    System.out.println("Erro: o número tem que ser entre 0 e 10");
                }
            } else {
                System.out.println("Erro: entrada inválida tem que digitar um número");
            }
            sc.nextLine();
        }
        System.out.println("O valor que você digitou foi ," + num);
        sc.close();
    }
}
