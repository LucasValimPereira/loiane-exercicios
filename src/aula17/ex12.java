package aula17;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ativo = true;

        while (ativo) {
            System.out.println("Diga o número da tabuada que quer: ");
            int tabuada = sc.nextInt();

            for (int i = 0; i <= 10; i++) {
                int vezes = i * tabuada;
                System.out.println(tabuada + " X " + i + " = " + vezes);
            }
            System.out.println("você quer sair?(Digite 'sim' para sair ou 'não' para continuar) ");
            String resp = sc.next();
            if (!resp.equalsIgnoreCase("sim") && !resp.equalsIgnoreCase("não")) {
                System.out.println("Opção inválida! Continuando por padrão...");
            }

            if (resp.equalsIgnoreCase("sim")) {
                ativo = false;
            }
        }
        System.out.println("tchausinho");
        sc.close();
    }
}
