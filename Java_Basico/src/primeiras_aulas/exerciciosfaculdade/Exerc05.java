
/*5. Escreva um programa que lê três inteiros a partir do teclado e imprime a soma, a média, o produto, o menor e o
maior desses números */

package primeiras_aulas.exerciciosfaculdade;

import java.util.Scanner;

public class Exerc05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, num3, soma, prod;
        double med;
        

        System.out.println("Digite o primeiro número");
        num1 = sc.nextInt();

        System.out.println("Digite o segundo número");
        num2 = sc.nextInt();

        System.out.println("Digite o terceiro número");
        num3 = sc.nextInt();

        soma = num1 + num2 + num3;
        System.out.format("A soma dos números são: %d \n", soma);

        med = soma / 3;
        System.out.format("A média dos números são: %.1f \n", med);

        prod = num1 * num2 * num3;
        System.out.format("O prduto dos números são: %d \n", prod);

        if(num1 > num2 & num1 > num3){
            System.out.format("O número: %d é o maior \n", num1);
        }

        else if (num2 > num1 & num2 > num3){
            System.out.format("O número: %d é o maior \n", num2);
        }

        else if (num3 > num2 & num3 > num1){
            System.out.format("O número: %d é o maior \n", num3);
        }

        if(num1 < num2 & num1 < num3){
            System.out.format("O número: %d é o menor \n", num1);
        }

        else if (num2 < num1 & num2 < num3){
            System.out.format("O número: %d é o menor \n", num2);
        }

        else if (num3 < num2 & num3 < num1){
            System.out.format("O número: %d é o menor \n", num3);
        }

        

        

        sc.close();
    }
}
