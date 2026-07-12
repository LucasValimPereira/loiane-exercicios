package aula17;

import java.util.Scanner;

public class ex31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean caixaAtivado = true;

        while (caixaAtivado) {
            boolean novaCompra = true;
            double valorProduto = 0;
            double total = 0;
            int contadorProduto = 0;

            String notaFiscal = "\nLoja Tabajara\n";

            while (novaCompra) {
                System.out.println("Valor do produto: ");
                valorProduto = sc.nextDouble();

                notaFiscal += String.format("Produto %d R$ %.2f%n", contadorProduto, valorProduto);
                if (valorProduto == 0) {
                    novaCompra = false;
                } else if (valorProduto > 0) {
                    total += valorProduto;
                    contadorProduto++;
                } else if (valorProduto < 0) {
                    System.out.println("Valor inválido! Digite apenas números positivos.");
                }
            }

            System.out.println("Digite o valor em dinheiro: R$ ");
            double dinheiro = sc.nextDouble();

            double troco = dinheiro - total;

            notaFiscal += String.format("Total : R$ %.2f%n", total);
            notaFiscal += String.format("Dinheiro : R$ %.2f%n", dinheiro);
            notaFiscal += String.format("Troco : R$ %.2f%n", troco);
            System.out.println(notaFiscal);
        }
        sc.close();
    }
}
