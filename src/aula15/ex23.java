package aula15;

import java.util.Scanner;

import static java.lang.Math.ceil;

public class ex23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número para ver o tipo: ");
        double num = sc.nextDouble();

        long numArredondado = Math.round(num);
        if(num == numArredondado) {
            System.out.println("É um inteiro");
        } else{
            System.out.println("É um decimal");
        }

        sc.close();
    }
}
