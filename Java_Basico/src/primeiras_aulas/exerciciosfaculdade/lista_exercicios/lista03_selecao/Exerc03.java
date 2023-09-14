
/*3. Escreva um programa que faz a leitura de 2 números inteiros. Caso o primeiro seja maior do que o segundo, o
programa imprime “primeiro maior do que o segundo”. Caso contrário, o programa imprime “segundo maior do que o
primeiro”. */

package primeiras_aulas.exerciciosfaculdade.lista_exercicios.lista03_selecao;

import java.util.Scanner;

public class Exerc03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2;
        

        System.out.println("Digite o primeiro número");
        num1 = sc.nextInt();

        System.out.println("Digite o segundo número");
        num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println("primeiro maior do que o segundo");
        }

        else{
            System.out.println("segundo maior do que o primeiro");
        }

        sc.close();
    }
}

