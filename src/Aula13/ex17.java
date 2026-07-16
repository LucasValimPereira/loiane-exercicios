package Aula13;

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite quantos metros de parede: ");
        double areaParede = sc.nextDouble();

        double litrosNecessarios = areaParede / 6;

        double totalLitrosComFolga = litrosNecessarios * 1.1;

        double quantidadeLatasApenas = Math.ceil(totalLitrosComFolga / 18);
        double precoTotalLatasApenas = quantidadeLatasApenas * 80;

        double quantidadeGaloesApenas = Math.ceil(totalLitrosComFolga / 3.6);
        double precoTotalGaloesApenas = quantidadeGaloesApenas * 25;

        int quantidadeLatasMistura = (int) (totalLitrosComFolga / 18);

        double litrosRestantesMistura = totalLitrosComFolga % 18;

        int quantidadeGaloesMistura = (int) Math.ceil(litrosRestantesMistura / 3.6);

        if ((quantidadeGaloesMistura * 25) > 80) {
            quantidadeGaloesMistura = quantidadeLatasMistura + 1;
            quantidadeGaloesMistura = 0;
        }

        double precoTotalMistura = (quantidadeLatasMistura * 80) + (quantidadeGaloesMistura * 25);

        System.out.printf("Total de litros necessários com folga: %.2f L\n\n", totalLitrosComFolga);

        System.out.println("Comprar apenas latas de 18 litros");
        System.out.printf("Quantidade: %.0f lata(s)\n", quantidadeLatasApenas);
        System.out.printf("Preço: R$ %.2f\n\n", precoTotalLatasApenas);

        System.out.println("Comprar apenas galões de 3,6 litros");
        System.out.printf("Quantidade: %.0f galão(ões)\n", quantidadeGaloesApenas);
        System.out.printf("Preço: R$ %.2f\n\n", precoTotalGaloesApenas);

        System.out.println("Mistura otimizada (Menor Preço)");
        System.out.printf("Quantidade: %d lata(s) e %d galão(ões)\n", quantidadeLatasMistura, quantidadeGaloesMistura);
        System.out.printf("Preço: R$ %.2f\n", precoTotalMistura);
        sc.close();
    }
}
