package aula17;

import java.math.BigInteger;
import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        boolean verdadeiro = true;
        while (verdadeiro) {
            System.out.println("Digite um número inteiro para o fatorial: ");
            n = sc.nextInt();

            if (n < 0) {
                System.out.println("ERRO! coloque somente um número inteiro positivo");
            }else if (n >= 16){
                System.out.println("Não coloque números maiores que 16");
            }
            else {
                BigInteger f = BigInteger.ONE;
                for (int i = 1; i <= n; i++) {
                    f = f.multiply(BigInteger.valueOf(i));
                }
                System.out.println("O fatorial de " + n + " é: " + f);
            }

            System.out.println("você quer continuar?(sim/não) ");
            String resp = sc.next();
            if (!resp.equalsIgnoreCase("sim") && !resp.equalsIgnoreCase("não")) {
                System.out.println("Opção inválida! Continuando por padrão...");
            }

            if (resp.equalsIgnoreCase("sim")) {
                verdadeiro = false;
            }
        }

        sc.close();
    }
}
