package Aula13;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num1 = sc.nextInt();
        System.out.println("Digite outro número inteiro: ");
        int num2 = sc.nextInt();
        System.out.println("Digite um números real:");
        float numReal = sc.nextFloat();

        int produto = ((2 * num1) * (num2 / 2));
        float somaDoTriplo = (3 * num1) + numReal;
        float elevadoAoCubo = numReal * numReal * numReal;
        System.out.println("O produto do dobro do primeiro com metade do segundo :" + produto);
        System.out.println("A soma do triplo do primeiro com o terceiro: " + somaDoTriplo);
        System.out.println("O terceiro elevado ao cubo: " + elevadoAoCubo);
    }
}
