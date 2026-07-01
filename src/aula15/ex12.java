package aula15;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor da sua hora: ");
        double valorHora = sc.nextDouble();

        System.out.println("Informe as horas trabalhadas no mês: ");
        double horaTrabalhadas = sc.nextDouble();

        double salarioBruto = valorHora * horaTrabalhadas;

        double percentualIR = 0;
        if (salarioBruto < 900) {
            percentualIR = 0;
        } else if (salarioBruto > 900 && salarioBruto <= 1500) {
            percentualIR = 5;
        } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
            percentualIR = 10;
        } else if (salarioBruto > 2500) {
            percentualIR = 20;
        }

        double valorIR = (salarioBruto / 100) * percentualIR;
        double valorSindicato = salarioBruto * 3;
        double valorFGTS = salarioBruto * 11;
        double valorINSS = salarioBruto * 10;
        double totalDescontos = valorIR +  valorINSS;
        double salarioLiquido = salarioBruto - totalDescontos;


        System.out.printf("Salário Bruto: (%.0f * %.0f)     : R$ %.2f\n",valorHora, horaTrabalhadas, salarioBruto);
        System.out.printf("(-) IR (%.0f%%)                  : R$ %.2f\n", percentualIR, valorIR);
        System.out.println("(-) INSS (20%)                  : R$ " + valorINSS);
        System.out.printf("FGTS (11%%)                      : R$ %.2f\n", valorFGTS);
        System.out.printf("Total de descontos               : R$ %.2f\n", totalDescontos);
        System.out.printf("salario liquido                  : R$ %.2f\n", salarioLiquido);

        sc.close();
    }
}
