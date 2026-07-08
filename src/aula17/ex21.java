package aula17;

import java.util.Scanner;

public class ex21 {
    public static boolean ehPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para dizer se ele é primo?");
        int numero = sc.nextInt();

        if (ehPrimo(numero)) {
            System.out.println(numero + " é um número primo!");
        }else {
            System.out.println(numero + " não é um número primo.");
            for (int i = 1; i < numero;i++) {
                if (numero % i == 0) {
                    System.out.print(i + " ");
                }
            }
        }

        sc.close();
    }
}
