package aula15;

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o ano");

        int ano =sc.nextInt();

        if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
            System.out.println("é bissexto");
        } else {
            System.out.println("não é bissexto");
        }
    }
}
