package aula17;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor Inicial: ");
        int valorInicial = sc.nextInt();

        System.out.println("Digite o valor final: ");
        int valorFinal = sc.nextInt();

        int passo = (valorInicial <= valorFinal) ? 1 : -1;

        for (int i = valorInicial; (passo == 1) ? (i <= valorFinal) : (i >= valorFinal); i += passo) {
            System.out.println(i);
        }

        passo += passo + passo;
        System.out.println("Soma dos passos: " + passo);
        sc.close();
    }
}
