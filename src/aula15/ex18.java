package aula15;

import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um número");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("par");
        } else {
            System.out.println("impar");
        }
    }
}
