package aula15;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite apenas umas letra: ");
        String letra = sc.next();

        /*if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") ||
                letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") ||
                letra.equalsIgnoreCase("u")) {
            System.out.println("É uma letra vogal");
        } else {
            System.out.println("É uma letra consoante");
        }*/

        if (letra.length() > 1) {
            System.out.println("Não é uma letra válida");
        } else {
            switch (letra) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                case "A":
                case "E":
                case "I":
                case "O":
                case "U":
                    System.out.println("vogal");
                    break;
                default:
                    System.out.println("consoante");
            }
        }
    }
}
