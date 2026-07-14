package Aula13;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float metros = 0;
        float centimetros = 0;
        System.out.println("Programar para converter Metros em cm");
        System.out.println("Digite os metros: ");
        metros = sc.nextFloat();

        centimetros = metros * 100;
        System.out.println("A quantidade de "+ metros + " m em cm é " + centimetros);
    }
}
