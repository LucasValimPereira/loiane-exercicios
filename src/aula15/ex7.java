package aula15;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int valor1 = sc.nextInt();

        System.out.println("Digite o segundo valor: ");
        int valor2 = sc.nextInt();

        System.out.println("Digite o terceiro valor: ");
        int valor3 = sc.nextInt();

        //int maior = Math.max(valor1, Math.max(valor2, valor3));
        //int menor = Math.min(valor1, Math.min(valor2, valor3));

        if (valor1 >= valor2 && valor1 >= valor3) {
            System.out.println("num1 é maior: " +valor1);
        } else if (valor2 >= valor1 && valor2 >= valor3) {
            System.out.println("num2 é maior: " + valor2);
        } else if (valor3 >= valor1 && valor3 >= valor2) {
            System.out.println("num3 é maior: " + valor3);
        }

        if (valor1 <= valor2 && valor1 <= valor3) {
            System.out.println("num1 é menor: " +valor1);
        } else if (valor2 <= valor1 && valor2 <= valor3) {
            System.out.println("num2 é menor: " + valor2);
        } else if (valor3 <= valor1 && valor3 <= valor2) {
            System.out.println("num3 é menor: " + valor3);
        }
    }
}
