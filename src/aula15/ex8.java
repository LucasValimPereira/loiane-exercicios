package aula15;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o preco do produto: ");
        double produto1 = sc.nextDouble();

        System.out.println("Informe o preco do segundo produto: ");
        double produto2 = sc.nextDouble();

        System.out.println("Informe o preco do terceiro produto: ");
        double produto3 = sc.nextDouble();

        if (produto1 <= produto2 && produto1 <= produto3) {
            System.out.println("Compre o Produto 1");
        } else if (produto2 <= produto1 && produto2 <= produto3){
            System.out.println("Compre o Produto 2");
        } else if (produto3 <= produto1 && produto3 <= produto2) {
            System.out.println("Compre o produto 3");
        }
    }
}
