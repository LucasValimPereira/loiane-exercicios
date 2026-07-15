package Aula13;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Verificador de peso ideal---");
        System.out.print("Digite sua altura:");
        double altura = sc.nextDouble();

        double pesoIdeal =(72.7*altura) - 58;

        System.out.println(pesoIdeal);
    }
}
