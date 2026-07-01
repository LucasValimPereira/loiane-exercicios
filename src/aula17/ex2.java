package aula17;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String usuario;
        String senha;

        do {
            System.out.println("Digite um nome de úsuario: ");
            usuario = sc.nextLine();
            System.out.println("Digite uma senha: ");
            senha = sc.nextLine();

            if(usuario.equals(senha)){
                System.out.println("A senha não pode ser igual a usuario");
            }
        }while (usuario.equals(senha));

        System.out.println("Cadastro realizado com sucesso");
        sc.close();
    }
}
