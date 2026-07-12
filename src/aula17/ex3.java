package aula17;

import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean infoValida = false;
        String nome = "";
        int idade = 0;
        double salario;
        char sexo, estadoCivil;

        do {
            System.out.println("Digite seu nome: ");
            if (sc.hasNext()) {
                nome = sc.next();
                if (nome.length() >= 3) {
                    infoValida = true;
                } else {
                    System.out.println("Nome deve ser maior que 3 letras.");
                }
            } else {
                System.out.println("Nome não contém número.");
            }
        } while (!infoValida);

        infoValida = false;
        do {
            System.out.println("Digite sua idade: ");
            
            if (sc.hasNextInt()) {
                idade = sc.nextInt();
                if (idade > 0 && idade <= 150) {
                    infoValida = true;
                } else {
                    System.out.println("Erro: idade pode ser somente entre 0 e 150");
                }
            } else {
                System.out.println("A idade tem que ser um número");
            }
        } while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Digite o seu salário: ");
            
            if (sc.hasNextBigDecimal()) {
                salario = sc.nextDouble();
                if (salario > 0) {
                    infoValida = true;
                } else {
                    System.out.println("Salário tem que ser maior que zero.");
                }
            } else {
                System.out.println("Salário tem que ser um número.");
            }
        } while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Digite seu sexo(f/m): ");
            sexo = sc.next().charAt(0);

            if (sexo == 'm' || sexo == 'f') {
                infoValida = true;
            } else {
                System.out.println("Sexo precisa ser 'f' ou 'm'.");
            }
        } while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Digite seu estado civil (s/c/v/d): ");
            estadoCivil = sc.next().charAt(0);

            if (estadoCivil == 's' || estadoCivil == 'c' || estadoCivil == 'v' || estadoCivil == 'd') {
                infoValida = true;
            } else {
                System.out.println("estado civil precisa ser 'c', 's', 'v', 'd'.");
            }
        } while (!infoValida);

        System.out.println("Nome : " + nome);
        System.out.println("Idade : " + idade);
        System.out.println("Sexo : " + sexo);
        System.out.println("Estado cívil : " + estadoCivil);

        sc.close();
    }
}
