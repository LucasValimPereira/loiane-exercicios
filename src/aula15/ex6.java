package aula15;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int valor1 = sc.nextInt();

        System.out.println("Digite o segundo valor: ");
        int valor2 = sc.nextInt();

        System.out.println("Digite o terceiro valor: ");
        int valor3 = sc.nextInt();

        if (valor3 > valor1 && valor3 > valor2) {
            System.out.println("O terceiro valor é maior.");
        } else if (valor2 > valor3 && valor2 > valor1) {
            System.out.println("O segundo valor é maior.");
        } else {
            System.out.println("O primeiro valor é maior.");
        }
    }
}
