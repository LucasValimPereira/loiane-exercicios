package aula15;

import java.util.Scanner;

public class ex10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Em que turno você estuda (M-matutino, V=vespertino, N-noturno):");
        String turno = sc.next();

        switch (turno) {
            case "m":
            case "M": System.out.println("Bom dia");break;
            case "v":
            case "V": System.out.println("Boa tarde");break;
            case "n":
            case "N": System.out.println("Boa noite");break;
            default: System.out.println("Valor Invalido");
        }
    }
}
