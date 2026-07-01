package aula15;

import java.util.Objects;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma letra para o seu sexo(F/M): ");
        String sexo = sc.next();
        // clase string
        if(sexo.equalsIgnoreCase("f")){
            System.out.println("F - feminino");
        } else if (sexo.equalsIgnoreCase("m")) {
            System.out.println("M - masculino");
        } else {
            System.out.println("Sexo inválido");
        }
    }

}
