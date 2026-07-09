package aula17;

import java.util.Scanner;

public class ex26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int votoCand1 = 0;
        int votoCand2 = 0;
        int votoCand3 = 0;
        int votosNulosInvalidos = 0;

        System.out.println("Digite o número total de eleitores: ");
        int totalEleitores = sc.nextInt();

        for (int i = 1; i <=totalEleitores; i++) {
            System.out.println("\nEleitor nº " + i);
            System.out.println("Vote 1 - Candidato Alex");
            System.out.println("Vote 2 - Candidato Bia");
            System.out.println("VOte 3 - Candidato Carlos");
            System.out.println("Digte sua opção: ");
            int voto = sc.nextInt();

            switch (voto) {
                case 1:
                    votoCand1++;
                    break;
                case 2:
                    votoCand2++;
                    break;
                case 3:
                    votoCand3++;
                    break;
                default:
                    System.out.println("Opção inválida! Voto não aceito");
                    votosNulosInvalidos++;
                    break;
            }
        }

        System.out.println("===== RESULTADO DA ELEIÇÃO =====");
        System.out.println("Candidato Alex: " + votoCand1 + " voto(s)");
        System.out.println("Candidato Bia: " + votoCand2 + " voto(s)");
        System.out.println("Candidato Carlos: " + votoCand3 + " voto(s)");
        System.out.println("Votos nulos/inválidos: " + votosNulosInvalidos + " voto(s)");

        sc.close();
    }
}
