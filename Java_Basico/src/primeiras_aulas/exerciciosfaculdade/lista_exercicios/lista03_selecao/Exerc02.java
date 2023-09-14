
/*2. Escreva um programa que faz a leitura de dois números reais e verifica se eles são iguais. Se forem, o programa
deve mostrar uma mensagem ao usuário informando-o disso. Caso contrário, o programa somente termina. */

package primeiras_aulas.exerciciosfaculdade.lista_exercicios.lista03_selecao;

import java.util.Scanner;

public class Exerc02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numInteiro;
        double numReal;

        System.out.println("Digite um número inteiro");
        numInteiro = sc.nextInt();

        System.out.println("Digite um número real");
        numReal = sc.nextDouble();

        if(numInteiro == numReal){
            System.out.format("O número inteiro: %d é igual ao número real: %.2f \n", numInteiro, numReal);
        }

        else{
            System.out.println("--- FIM DO PROGRAMA ---");
        }

        sc.close();
    }
}
