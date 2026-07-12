package aula17;

import java.util.Scanner;

public class ex27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalAlunos = 0;
        int alunos;
        boolean valido;
        int qtdTurmas = 0;

        while(true) {
            System.out.println("Digite a quantidade de turmas: ");
            if (sc.hasNextInt()) {
                qtdTurmas = sc.nextInt();
                if (qtdTurmas > 0) {
                    break;
                } else {
                    System.out.println("Por favor, digite um número maior que zero.");
                }
            } else {
                System.out.println("Erro! Digite apenas números inteiros, letras não");
                sc.next();
            }
        }



        for(int i = 1; i <= qtdTurmas; i++) {
            valido = false;
            alunos = 0;

            while (!valido) {
                System.out.println("Digite a quantidade de alunos: ");

                if (sc.hasNextInt()) {
                    alunos = sc.nextInt();
                    if (alunos >= 0 && alunos <= 40) {
                        break;
                    } else {
                        System.out.println("Números de alunos inválido. O máximo permitido é 40.");
                    }
                } else {
                    System.out.println("Erro! Digite apenas números inteiros, letras não");
                    sc.next();
                }
            }

            totalAlunos += alunos;
        }

        double media = (double) totalAlunos / qtdTurmas;

        System.out.println("--- Resultado ---");
        System.out.println("Total de turmas: " + qtdTurmas);
        System.out.println("Total de alunos: " + totalAlunos);
        System.out.println("Média de alunos por turma: " + media);

        sc.close();
    }
}
