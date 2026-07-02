package aula17;

public class ex4 {
    public static void main(String[] args) {
        double populacaoA = 80000;
        double populacaoB = 200000;
        int anos = 0;

        while (populacaoA < populacaoB) {
            populacaoA += populacaoB * 0.03;
            populacaoB += populacaoA * 0.015;

            anos++;

            System.out.println("Serão necessários " + anos + " anos para que a cidade A ultrapasse a B.");
            System.out.printf("População final da cidade A: %.0f habitantes%n", populacaoA);
            System.out.printf("População final da cidade B: %.0f habitantes%n", populacaoB);
        }
    }
}
