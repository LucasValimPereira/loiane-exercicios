package Aula13;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double raio = 0;
        double area = 0;
        double dobro_area;
        System.out.println("Área do círculo");
        System.out.print("Digite o raio: ");
        raio = sc.nextFloat();

        area = Math.PI * (raio * raio);
        dobro_area = area * 2;
        System.out.printf("A área do círculo é : %.2f", area);
        System.out.println();
        System.out.printf("O dobro é : %.2f", dobro_area);
    }
}
