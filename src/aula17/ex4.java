package aula17;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double populacaoA, populacaoB;
        double taxaCrescA, taxaCrescB;
        int anos;
        char resp;

        do {
            //reseta a contagem dos anos a cada nova simulação
            anos = 0;
            //validacao da populacaoA
            do {
                System.out.println("Entre com a população da cidade A (maior que 0): ");
                populacaoA = sc.nextDouble();
                if (populacaoA <= 0) {
                    System.out.println("Erro: A população deve ser maior que 0.");
                }
            } while (populacaoA <= 0);
            //validacao da taxaA
            do {
                System.out.print("Entre com a taxa de crescimento da cidade A em % (ex: 3): ");
                taxaCrescA = sc.nextDouble();
                if (taxaCrescA <= 0) {
                    System.out.println("Erro: A taxa deve ser maior que 0.");
                }
            } while (taxaCrescA <= 0);

            do {
                System.out.print("Entre com a população da cidade B (maior que 0): ");
                populacaoB = sc.nextDouble();
                if (populacaoB <= 0) {
                    System.out.println("Erro: A população deve ser maior que 0.");
                }
            } while (populacaoB <= 0);

            // Validação da Taxa B (deve ser maior que 0)
            do {
                System.out.print("Entre com a taxa de crescimento da cidade B em % (ex: 1.5): ");
                taxaCrescB = sc.nextDouble();
                if (taxaCrescB <= 0) {
                    System.out.println("Erro: A taxa deve ser maior que 0.");
                }
            } while (taxaCrescB <= 0);

            while (populacaoA < populacaoB) {
                populacaoA += (populacaoA / 100) * taxaCrescA;
                populacaoB += (populacaoB / 100) * taxaCrescB;
                anos++;
            }
            System.out.println("\n=== RESULTADO ===");
            System.out.println("Serão necessários " + anos + " anos para a cidade A ultrapassar ou igualar a B.");
            System.out.printf("População de A: %.0f habitantes.%n", populacaoA);
            System.out.printf("População de B: %.0f habitantes.%n", populacaoB);
            System.out.println("=================\n");

            System.out.print("Deseja repetir a operação? (S/N): ");
            resp = sc.next().toUpperCase().charAt(0);
        } while (resp == 'S');

        sc.close();
    }
}
