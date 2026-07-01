package aula15;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o seu salário Atual por favor: ");
        double salarioAtual = sc.nextDouble();
        int percentual = 0;

        if (salarioAtual <= 280.00) {
            percentual = 20;
        } else if(salarioAtual > 280.00 && salarioAtual <= 700.00) {
            percentual = 15;
        } else if (salarioAtual>= 700.00 && salarioAtual <= 1500.00) {
            percentual = 10;
        } else if(salarioAtual>= 1500.00 ) {
            percentual = 5;
        }

        double aumento = (salarioAtual / 100) * percentual;
        double salarioNovo = salarioAtual+ aumento;

        System.out.println("Salario Antigo: " + salarioAtual);
        System.out.println("Percentual: " + percentual);
        System.out.println("Valor do aumento: " + aumento);
        System.out.println("Novo Salario: " + salarioNovo);
    }
}
