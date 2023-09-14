/*6. Escreva um programa que lê dois valores reais. O primeiro valor é o saldo de uma conta bancária e o segundo é um
valor que o usuário deseja sacar desta conta. Caso seja possível efetuar o saque (ou seja, o saldo não fique negativo), o
programa deve mostrar o saldo remanescente. Caso contrário, deve informar o usuário que não foi possível realizar o
saque */

package primeiras_aulas.exerciciosfaculdade.lista_exercicios.lista03_selecao;

import java.util.Scanner;

public class Exerc06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        double saldo, valorSaque;
        

        System.out.println("Digite o saldo");
        saldo = sc.nextDouble();

        System.out.println("Digite o valor do saque");
        valorSaque = sc.nextDouble();

        double result = saldo - valorSaque;

        if(valorSaque > saldo)
            System.out.println("Não foi possível realizar saque"); 
            
        else    
            System.out.println("Valor remanescente: " + result);

        

        

        sc.close();
    }
}
