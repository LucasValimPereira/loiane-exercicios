package aula17;

public class LoopFor {
    public static void main(String[] args) {

        for (int contador = 0; contador < 5 ; contador++) {
            System.out.println("Contador contando: " + contador);
        }

        for (int contador = 5; contador >= 0 ; contador--) {
            System.out.println("Contador decrementando: " + contador);
        }

        //for com duas variaveis
        for (int i=0, j=10 ; i < j ; i++, j--) {
            System.out.println("i = " + i + "; j = " + j);
        }

        //partes ausentes pode ser que seu programa requer isso
        int count = 0;
        for ( ; count < 10 ; ) {
            System.out.println("valor de count: " + count);
            count += 2;
        }

        for (int cont=0; cont < 10; cont += 2) {
            System.out.println("valor de cont: " + cont);
        }

        //loop infinito for (;; );

        //loop sem corpo quando quer somar valores
        int soma = 0;
        for (int i=1; i <5; soma += i++);
        System.out.println("O valor da soma é " + soma);

        //for de uma linha
        for (int i = 0; i < 5 ; i++)
            System.out.println("i tem valor: " + i);

    }
}
