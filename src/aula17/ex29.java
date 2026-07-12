package aula17;

import java.util.Scanner;

public class ex29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor base da tabela: ");
        double valorBase = (sc.nextDouble());

        for (int i = 1; i <= 50; i++) {
            double resultado = i * valorBase;
            System.out.printf("%d - %.2f%n", i, resultado);
        }

    }
}
