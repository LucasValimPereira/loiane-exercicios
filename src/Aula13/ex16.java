package Aula13;

import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite quantos metros de parede: ");
        double parede = sc.nextDouble();

        double litros =parede / 3;
        double latas = Math.ceil(litros / 18);
        double precoTotal = latas * 80;

        System.out.println("quantidade de latas: "+ latas);
        System.out.println("preço total: " + precoTotal);
    }
}
