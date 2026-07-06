package aula17;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean programaRodando = true;

        while (programaRodando) {
            System.out.println("entre com a base: ");
            int base = sc.nextInt();

            System.out.println("Entre com o expoente: ");
            int expoente = sc.nextInt();

            int resultado = 1;

            for (int i = 0; i < expoente; i++) {
                resultado *= base;
            }

            System.out.println("Resutado: " + resultado);
            System.out.println("você quer continuar?(sim/não) ");
            String resp = sc.next();
            if (!resp.equalsIgnoreCase("sim") && !resp.equalsIgnoreCase("não")) {
                System.out.println("Opção inválida! Continuando por padrão...");
            }

            if (resp.equalsIgnoreCase("sim")) {
                programaRodando = false;
            }
        }
        System.out.println("Programa fechou");
        sc.close();
    }
}
