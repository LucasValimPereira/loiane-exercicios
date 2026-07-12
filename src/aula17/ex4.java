package aula17;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double populacaoA, populacaoB = 0;
        double taxaCrescA, taxaCrescB = 0;
        String resp;
        boolean promptValido = false;


        do {
            System.out.println("Entre com a população da cidade A: ");
            populacaoA = sc.nextDouble();

            if (populacaoA > 0) {
                promptValido = true;
            } else {
                System.out.println("População A precisa ser maior que zero.");
            }
        } while (!promptValido);

        promptValido = false;

        do {
            System.out.println("Entre com a população da cidade B: ");
            populacaoA = sc.nextDouble();

            if (populacaoA > 0) {
                promptValido = true;
            } else {
                System.out.println("População B precisa ser maior que zero.");
            }
        } while (!promptValido);

        promptValido = false;

        do {
            System.out.println("Entre com a taxa de crecimento da população A: ");
            taxaCrescA = sc.nextDouble();

            if (taxaCrescA > 0) {
                promptValido = true;
            } else {
                System.out.println("Taxa de crescimento precisa ser maior que zero.");
            }
        } while (!promptValido);

        promptValido = false;

        do {
            System.out.println("Entre com a taxa de crecimento da população B: ");
            taxaCrescA = sc.nextDouble();

            if (taxaCrescA > 0) {
                promptValido = true;
            } else {
                System.out.println("Taxa de crescimento precisa ser maior que zero.");
            }
        } while (!promptValido);

        int cont = 0;

        while (populacaoA < populacaoB) {

            populacaoA += (populacaoA / 100) * taxaCrescA;
            populacaoB += (populacaoB / 100) * taxaCrescB;
            cont++;
        }
        System.out.println("População A: " + populacaoA);
        System.out.println("População B: " + populacaoB);
        System.out.println("Quantidade de anos " + cont);

        sc.close();
    }
}
