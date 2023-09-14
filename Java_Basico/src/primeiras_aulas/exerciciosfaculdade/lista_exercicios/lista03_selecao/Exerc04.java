
/*4. Escreva um programa que pede para o usuário inserir dois números, obtém os números do usuário e então imprime
o maior número seguido pelas palavras “é o maior”. Se os números forem iguais, imprime a mensagem “Estes
números são iguais”. */

package primeiras_aulas.exerciciosfaculdade.lista_exercicios.lista03_selecao;

import java.util.Scanner;

public class Exerc04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2;
        

        System.out.println("Digite o primeiro número");
        num1 = sc.nextInt();

        System.out.println("Digite o segundo número");
        num2 = sc.nextInt();

        if(num1 > num2){
            System.out.format("O número: %d é o maior \n", num1);
        }

        else if (num1 < num2){
            System.out.format("O número: %d é o maior \n", num2);
        }

        else{
            System.out.println("Os números são iguais");
        }

        sc.close();
    }
}

