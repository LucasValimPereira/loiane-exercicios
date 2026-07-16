package aula15;

import java.util.Scanner;

public class ex24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double result = 0;
        System.out.println("Informe o primeiro número: ");
        double num1 = sc.nextDouble();
        System.out.println("Informe o segundo número: ");
        double num2 = sc.nextDouble();
        System.out.println("Informe a operação(+|-|*|/): ");
        String op = sc.next();

        String descNum1 = num1 + " é " + (num1 >= 0 ? "positivo" : "negativo") + ", " + (num1 % 2 == 0 ? "par" : "ímpar") + " e " + (num1 % 1 == 0 ? "inteiro" : "decimal") + ".";
        System.out.println(descNum1);

        // Análise do Segundo Número (Sinal, Paridade, Tipo)
        String descNum2 = num2 + " é " + (num2 >= 0 ? "positivo" : "negativo") + ", " + (num2 % 2 == 0 ? "par" : "ímpar") + " e " + (num2 % 1 == 0 ? "inteiro" : "decimal") + ".";
        System.out.println(descNum2);

        switch (op) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Erro: Divisão por zero!");
                    sc.close();
                    return;
                }
                break;
            default:
                System.out.println("Operação inválida!");
                sc.close();
                return;
        }
        System.out.println("resultado "+result);
        sc.close();
    }
}
