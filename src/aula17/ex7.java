package aula17;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //a variavel começa com o menor número possível
        int maior = Integer.MIN_VALUE;
        int numero=0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite o numero:" );
            numero = sc.nextInt();
        }

        if (numero > maior) {
            maior = numero;
        }

        System.out.println("O maior número digitado foi: " + maior);
        sc.close();
    }
}
