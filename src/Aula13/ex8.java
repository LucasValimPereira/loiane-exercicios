package Aula13;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Quando você ganha por hora: ");
        double salarioHora = sc.nextDouble();

        System.out.println("Quando você trabalhou no mês: ");
        double horasTrabalhadas = sc.nextDouble();

        double salarioBruto = salarioHora * horasTrabalhadas;

        System.out.println("Você vai ganhar " + salarioBruto + " no mês.");
    }
}
