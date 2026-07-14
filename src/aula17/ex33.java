package aula17;

import java.util.Scanner;

public class ex33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean sair = false;
        String resp = "";
        double temperaturas = 0;
        double maior = Integer.MIN_VALUE;
        double menor = Integer.MAX_VALUE;
        double media = 0;
        double soma = 0;

        do {
            System.out.println("Sistema de Meteorologia");
            System.out.print("Digite as temperaturas: ");
            temperaturas = sc.nextDouble();

            soma += temperaturas;
            temperaturas++;

            if (temperaturas > maior) {
                maior = temperaturas;
            }
            if (temperaturas < menor) {
                menor = temperaturas;
            }

            System.out.print("deseja sair? (s/n): ");
            resp = sc.next();
            if (resp.equalsIgnoreCase("s")) {
                sair = false;
            } else if (resp.equalsIgnoreCase("n")) {
                sair = true;
            }
        } while(sair);

        media = soma / temperaturas;
        System.out.println("\n--- Resultados ---");
        System.out.println("A maior temperatura: " + maior);
        System.out.println("A menor temperatura: " + menor);
        System.out.println("A temperatura media: " + media);
        sc.close();
    }
}
