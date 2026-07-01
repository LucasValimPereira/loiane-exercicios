package aula15;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args){
        // o resutado do if sempre vai ser um booleano
        //letra tem um valor na tablea ascii
        //Até java 7 a condicao podia ser byte, short,int, char ou Enum
        //switch também aceita string
        Scanner scan = new Scanner(System.in);

        int diaSemana = scan.nextInt();

        /*switch (diaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");break;
            case 3:
                System.out.println("terça");break;
            case 4:
                System.out.println("Quarta");break;
            case 5:
                System.out.println("Quinta");break;
            case 6:
                System.out.println("Sexta");break;
            case 7:
                System.out.println("Sábado");break;
            default:
                System.out.println("Não é um dia da semana válido");
        }*/

        /*switch (diaSemana) {
            case 1:
                System.out.println("Domingo");
            case 2:
                System.out.println("Segunda");
            case 3:
                System.out.println("terça");
            case 4:
                System.out.println("Quarta");
            case 5:
                System.out.println("Quinta");
            case 6:
                System.out.println("Sexta");
            case 7:
                System.out.println("Sábado");
            default:
                System.out.println("Não é um dia da semana válido");
        }*/

        switch (diaSemana) {

            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia util");
                break;
            case 1:
            case 7:
                System.out.println("Fim de semana");
                break;
            default:
                System.out.println("Não é um dia da semana válido");
        }
    }
}
