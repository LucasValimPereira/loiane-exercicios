package aula17;

import java.util.Scanner;

public class ex35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int limite = sc.nextInt();

        for (int i = 2; i <= limite; i++) {

            for(int j = 2; j < i; j++) {
                System.out.print(i + " ");
                break;
            }
        }

        sc.close();
    }
}
