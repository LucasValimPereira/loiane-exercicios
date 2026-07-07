package aula17;

public class ex15 {
    public static void main(String[] args) {
        int n = 500;

        long termo1 = 0;
        long termo2 = 1;

        System.out.println("Sequêncoa de Fibonacci até o " + n + "º termo: ");

        for (int i = 0; i <= n; i++) {
            System.out.println(termo1 + " ");

            long proximoTermo = termo1 + termo2;
            termo1 = termo2;
            termo2 = proximoTermo;
        }
    }
}
