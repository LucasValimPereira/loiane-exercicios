package Aula13;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float notas=0;

        for (int i = 1; i <= 4; i++) {
            System.out.println("Digite a " + i + "º nota: ");
            notas = sc.nextFloat();
            notas++;
        }
        float media = notas / 2;
        System.out.println("Sua média foi " + media);
    }
}
