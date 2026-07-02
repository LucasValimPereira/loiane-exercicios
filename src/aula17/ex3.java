package aula17;

import java.util.Scanner;

public class ex3 {
    private static boolean salarioValido;
    private static boolean idadeValida;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade = 0;
        double salario;
        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        if(sc.hasNextInt()){
            idade = sc.nextInt();

            if (idade >0 && idade <= idade) {
                idadeValida = true;
            } else {
                System.out.println("Erro: idade pode ser somente entre 0 e 150");
            }
        } else {
            System.out.println("A idade tem que ser um número");
        }
        System.out.println("Digite o seu salário: ");
        if(sc.hasNextBigDecimal()) {
            salario = sc.nextDouble();

            if (salario > 0) {
                salarioValido = true;
            } else {
                System.out.println("Salário tem que ser maior que zero.");
            }
        }else {
            System.out.println("Salário tem que ser um número.");
        }
        System.out.println("Digite seu sexo(f/m): ");
        char sexo = sc.next().charAt(0);

        if (sexo == 'm' || sexo == 'f'){
            System.out.println("Erro: digite apenas f ou m");
        }
        System.out.println("Digite seu estado civil (s/c/v/d): ");
        char estadoCivil = sc.next().charAt(0);

        if (estadoCivil == 's' || estadoCivil == 'c' || estadoCivil == 'v' || estadoCivil == 'd'){
            System.out.println("Erro: estado civil inválido digite apenas c, s, v, d");
        }
        System.out.println("Nome : " + nome);
        System.out.println("Idade : " + idade);
        System.out.println("Sexo : " + sexo);
        System.out.println("Estado cívil : " + estadoCivil);
    }
}
