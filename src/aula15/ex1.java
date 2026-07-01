package aula15;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("O primeiro número é maior que o segundo: " + num1);
        }else {
            System.out.println("O segundo número é maior que o primeiro: " + num2);
        }
    }
}
