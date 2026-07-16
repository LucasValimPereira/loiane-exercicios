package Aula13;

import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o tamanho do download? ");
        double tamanhoDownload = sc.nextDouble();

        System.out.println("Qual a velocidade da internet? ");
        double velcidadeInternet = sc.nextDouble();

        double tempo = tamanhoDownload / velcidadeInternet;

        System.out.printf("tempo estimado %.2f", tempo);
    }
}
