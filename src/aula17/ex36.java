package aula17;

import java.util.Scanner;

public class ex36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-----Gerador de tabuada-----");
        System.out.print("Digite o número da tabuada:");
        int num = sc.nextInt();

        System.out.println("O número inicial? ");
        int inicio = sc.nextInt();

        System.out.println("O número final?");
        int fin = sc.nextInt();
        if(fin < inicio) {
            System.out.println("Não pode o ultimo valor ser maior que o primeiro");
        }

        for (int i = inicio; i <= fin; i++) {
            int resp =i +num;
            System.out.println(num + " X " + i + " = " + resp);
        }
    }
}
