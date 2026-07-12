package aula17;

import java.util.Scanner;

public class ex30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean caixaAberto = true;

        while (caixaAberto) {
            System.out.print("Digite o preço do pão:");
            if (sc.hasNextDouble()) {
                double valorBasePao = sc.nextDouble();
                if (valorBasePao <= 0) {
                    System.out.println("Não pode ser número negativo e nem zero para o preço do pão.");
                } else {
                    System.out.println("Panificadora Pão de Ontem - Tabela de preços");
                    System.out.println("Preço do pão: R$ " + valorBasePao);
                    for (int i = 1; i <= 50; i++) {
                        double resultado = i * valorBasePao;
                        System.out.printf("%d - %.2f%n", i, resultado);
                    }
                }
            } else {
                System.out.println("Não pode ser uma letra para o preço do pão.");
                sc.next();
            }
        }
        sc.close();

    }
}
