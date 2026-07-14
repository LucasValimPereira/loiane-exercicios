package Aula13;

import java.util.Scanner;

public class ex3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.println("Informe o segundo números: ");
        int num2 = sc.nextInt();

        int soma = num1 + num2;
        System.out.println(soma);
    }
}
