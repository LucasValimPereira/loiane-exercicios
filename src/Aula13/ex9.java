package Aula13;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Tranforme os graus Farenheit em Celsius---");
        System.out.println("Digite os graus farenheit: ");
        double farenheit = sc.nextDouble();
        double celsius = (5 * (farenheit-32) / 9);

        System.out.printf("Cº %.2f", celsius);
    }
}
