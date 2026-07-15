package Aula13;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double excesso = 0;
        double multa = 0;
        System.out.println("Digite os kg(quilos) de peixes: ");
        double peso = sc.nextDouble();

        if (peso > 50) {
            excesso = peso - 50;
            multa = excesso * 4;
            System.out.println("Excesso");
            System.out.println("Multa de " + multa);
        }
        else{
            System.out.printf("Voçê ainda no limite (%.2f/50)",peso);
        }
    }
}
