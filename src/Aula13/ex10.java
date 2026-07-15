package Aula13;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Tranforme os graus Celsius em Farenheit---");
        System.out.print("Digite os graus celsius: ");
        double  celsius = sc.nextDouble();
        double farenheit = (celsius * 1.8) + 32;

        System.out.printf("Fº %.2f", farenheit);
    }
}
