package aula17;

import java.util.Scanner;

public class ex32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        long fatorial = 1;
        String passos = "";
        System.out.println("---Programa para calcular o fatorial---");
        System.out.print("Digite o número para fazer o calculo: ");
        numero = sc.nextInt();

        for (int i = numero; i >= 1; i--) {
            fatorial *= i;

            if (i == 1) {
                passos += i;
            } else {
                passos += i + " x ";
            }
        }

        System.out.println(numero + "! = " + passos + " = " + fatorial);
    }
}
