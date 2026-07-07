package aula17;

import java.math.BigInteger;

public class ex16 {
    public static void main(String[] args) {
        int n = 500;

        BigInteger termo1 = BigInteger.ZERO;
        BigInteger termo2 = BigInteger.ONE;

        System.out.println("Gerando a sequência...");

        for (int i = 0; i <= n; i++) {

            BigInteger proximoTermo = termo1.add(termo2);
            termo1 = termo2;
            termo2 = proximoTermo;
        }

        System.out.println("\nO 500º termo correto é:\n" + termo1);
    }
}
