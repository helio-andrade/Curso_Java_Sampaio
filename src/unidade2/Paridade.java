package unidade2;

import java.util.Scanner;

public class Paridade {
    public static void main(String[] args) {
        System.out.print("Digite um número inteiro: ");
        int numero = new Scanner(System.in).nextInt();

        System.out.println(numero + 
        		(numero % 2 == 0 ? " é par!" : " é ímpar"));
    }
}
