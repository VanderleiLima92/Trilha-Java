/*1. Escreva um programa que faz a leitura de um número inteiro e um número real. Caso o número inteiro seja menor
do que o número real, o programa deve imprimir uma mensagem dizendo isso ao usuário. Caso contrário, o programa
somente termina. */

package primeiras_aulas.exerciciosfaculdade.lista_exercicios.lista03_selecao;

import java.util.Scanner;

public class Exerc01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numInteiro;
        double numReal;

        System.out.println("Digite um número inteiro");
        numInteiro = sc.nextInt();

        System.out.println("Digite um número real");
        numReal = sc.nextDouble();

        if(numInteiro < numReal){
            System.out.format("O número inteiro: %d é menor que o número real: %.2f \n", numInteiro, numReal);
        }

        else{
            System.out.format("O número real: %.2f é menor que o número inteiro: %d \n", numReal, numInteiro );
        }

        sc.close();
    }
}
