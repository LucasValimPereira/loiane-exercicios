package aula17;

import java.util.Scanner;

public class ex24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qunatas notas você deseja digitar? ");
        int quantidadeNotas = sc.nextInt();

        double somaNotas = 0;

        for (int i = 1; i <= quantidadeNotas; i++) {
            System.out.println("Digite a nota " + i + ": ");
            double nota = sc.nextDouble();

            somaNotas += nota;
        }

        double media = somaNotas / quantidadeNotas;

        System.out.println("\n-----------------------------------------");
        System.out.println("Soma total das notas: " + somaNotas);
        System.out.printf("A média aritmética é: %.2f\n", media);
        System.out.println("--------------------------------------------");

        sc.close();
    }
}
