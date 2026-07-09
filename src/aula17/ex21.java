package aula17;

import java.util.Scanner;

public class ex21 {

    public static int totalDivisoes = 0;

    public static boolean ehPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            totalDivisoes++;

            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número limite: ");
        int numeroLimite = sc.nextInt();;

        System.out.println("\nNúmeros primos de 1 até " + numeroLimite + ":");

        for (int i = 1; i <= numeroLimite; i++) {

            if(ehPrimo(i)) {
                System.out.println(i + " ");
            }
        }
        System.out.println("\n\n------------------------------------------");
        System.out.println("Total de divisões executadas: " + totalDivisoes);
        System.out.println("--------------------------------------------");

        sc.close();
    }
}
