package aula15;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        if (num >= 0 ){
            System.out.println("É um valor positivo.");
        }else {
            System.out.println("É um valor negativo.");
        }
    }
}
