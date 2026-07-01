//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Entre com sua idade: ");
    int idade = sc.nextInt();

    if (idade>= 18) {
        System.out.println("É maior de idade.");
    } else{
        System.out.println("É menor de idade");
    }

    //barato <= 10
    //10 < valor < 15 - pedir desconto
    //15 <= valor 17 - pesquisar mais
    //>= 17 - muito

    System.out.println("Entre com o preço de um item");
    double valor =sc.nextDouble();

    if(valor <= 10) {
        System.out.println("Esta barato, pode comprar");
    } else if (valor > 10 && valor < 15) {
        System.out.println("Você pode pedir um desconto");
    } else if (valor >= 15 && valor < 17){
        System.out.println("Pode pesquisar mais");
    } else {
        System.out.println("Muito caro");
    }
}
