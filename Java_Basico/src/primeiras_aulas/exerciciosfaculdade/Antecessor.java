
/*Ler um valor inteiro e exibir seu antecessor. */

import java.util.Scanner;

public class Antecessor {
    public static void main(String[] args) {
        int num1, antec;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        num1 = sc.nextInt();

        antec = num1 - 1;
        System.out.println("Seu antecessor é: " + antec);

        
    }
}
