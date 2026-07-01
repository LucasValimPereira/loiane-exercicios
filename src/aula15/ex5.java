package aula15;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media == 10) {
            System.out.printf("Aprovado com Distinção\nnota: %.1f", media);
        } else if (media >= 7){
            System.out.printf("Aprovado\nNota: %.1f", media);
        } else{
            System.out.printf("Reprovado\nnota: %.1f", media);
        }
    }
}
