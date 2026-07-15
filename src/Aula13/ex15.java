package Aula13;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quando você ganha por hora: ");
        double salarioHora = sc.nextDouble();

        System.out.print("Quando você trabalhou no mês: ");
        double horasTrabalhadas = sc.nextDouble();

        double salarioBruto = salarioHora * horasTrabalhadas;
        double inss = (salarioBruto/100) * 8;
        double sindicato = (salarioBruto/100) * 5;
        double ir = (salarioBruto/100) * 11;
        double totalDescontos = inss + sindicato + ir;
        double salarioLiquido = salarioBruto - totalDescontos;
        System.out.println("Salario Bruto: " + salarioBruto);
        System.out.println("INSS :" + inss);
        System.out.println("Sindicato :" + sindicato);
        System.out.println("IR: " + ir);
        System.out.println("Total de descontos: " + totalDescontos);
        System.out.println("Salário Líquido: " + salarioLiquido);

    }
}
