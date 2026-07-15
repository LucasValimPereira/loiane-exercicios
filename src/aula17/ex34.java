package aula17;

import java.util.Scanner;

public class ex34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("---Verificador de número primo---");
        System.out.println("Digite o número: ");
        int num = sc.nextInt();

        boolean primo = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
                break;
            }
        }

        if (primo && num > 1) {
            System.out.println("É um número primo.");
        } else {
            System.out.println("Não é um número primo");
        }

        sc.close();
    }
}
