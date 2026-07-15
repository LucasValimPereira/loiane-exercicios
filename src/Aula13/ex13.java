package Aula13;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double peso = 0;
        System.out.println("---Verificador de peso ideal---");
        System.out.print("Digite sua altura:");
        double altura = sc.nextDouble();
        System.out.println("Digite seu genero (F/M)");
        String genero = sc.next();

        if (genero.equalsIgnoreCase("f")) {
            peso = (62.1 * altura) - 44.7;

        } else if (genero.equalsIgnoreCase("m")) {
            peso = (72.7 *altura) - 58;
        }

        System.out.println("Genero : " + genero);
        System.out.println("Altura : " + altura);
        System.out.printf("peso Ideal : %.2f", peso);
    }
}
