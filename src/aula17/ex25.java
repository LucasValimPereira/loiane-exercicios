package aula17;

import java.util.Scanner;

public class ex25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas? ");
        int quantidadePessoas = sc.nextInt();

        int somaIdade = 0;

        for(int i = 1; i <= quantidadePessoas; i++) {
            System.out.println("Digite a idade da " + i + "º pessoas: ");
            double idade = sc.nextDouble();

            somaIdade += idade;
        }

        double media = somaIdade /quantidadePessoas;

        if (media <= 25) {
            System.out.println("É jovem.");
            System.out.println("Média: " + media);
        } else if (media >= 26 && media <= 59) {
            System.out.println("É adulto.");
            System.out.println("Média: " + media);
        } else {
            System.out.println("É idosa.");
            System.out.println("Média: " + media);
        }
    }
}
