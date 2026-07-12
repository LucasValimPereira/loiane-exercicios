package aula17;

import java.util.Scanner;

public class ex28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precoCD = 0;
        double valorTotal = 0;
        double qtdCds = 0;
        boolean quantidadeValida = false;

        while (!quantidadeValida) {
            System.out.print("Digite a quantidade de CD's: ");
            if (sc.hasNextInt()) {
                qtdCds = sc.nextInt();
                if(qtdCds > 0) {
                    quantidadeValida = true;
                } else {
                    System.out.println("Erro! A quantidade deve ser maior que zero.");
                }
            } else {
                System.out.println("Erro! Digite apenas número inteiro para a quantidade de CD's");
                sc.next();
            }
        }

        for (int i = 1; i <= qtdCds; i++) {
            boolean valorValido = false;

            while (!valorValido) {
                System.out.print("Digite o preço do "+ i +" CD: ");
                if (sc.hasNextDouble()) {
                    precoCD = sc.nextDouble();
                    valorValido = true;
                } else {
                    System.out.println("Erro! Digite apenas números com vírcula(,) não use ponto(.)");
                    sc.next();
                }
            }

            valorTotal += precoCD;

        }
        double media = valorTotal / qtdCds;

        System.out.println("Número total de CD's: " + qtdCds);
        System.out.println("Valor total investido: R$ " + valorTotal);
        System.out.println("Preço médio por CD: R$ " + media);
        sc.close();
    }
}
