package aula15;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o Primeiro lado: ");
        int l1 = sc.nextInt();

        System.out.println("Informe o Segundo lado: ");
        int l2 = sc.nextInt();

        System.out.println("Informe o Terceiro lado: ");
        int l3 = sc.nextInt();


        if (((l1 + l2) > l3) || ((l1 + l3) > l2) || ((l2 + l3) > l1)) {
            if (l1 == l2 && l1 == l3 && l2 == l3) {
                System.out.println("Triâmgulo Equilátero");
            } else if (l1 != l2 && l1 != l3 && l3 != l2) {
                System.out.println("Triângulo Escaleno");
            } else if (l1 == l2 || l1 ==l3 || l2 == l3) {
                System.out.println("Triângulo Isóceles");
            }

        } else {
            System.out.println("Não forma um triângulo");
        }
    }
}
