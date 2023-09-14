
/* Escreva um programa que lê duas notas de um estudante, ambas sendo valores reais. O programa deve calcular a
média e exibir um texto para o usuário conforme a tabela a seguir:
Nota Texto
 média >= 9 Parabéns, continue assim!
7 <= média < 9 Aprovado.
6 <= média < 7 Aprovado no limite, estude um pouco mais.
2 < = média  < 6 Não está aprovado mas ainda pode fazer a segunda época
média < 2 Reprovado. Nos vemos semestre que vem */

package primeiras_aulas.exerciciosfaculdade.lista_exercicios.lista03_selecao;

import java.util.Scanner;

public class Exerc09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        double nota1, nota2, med;
       
        

        System.out.println("Informe a primeira nota: ");
        nota1 = sc.nextDouble();

        System.out.println("Informe a segunda nota: ");
        nota2 = sc.nextDouble();

        med = (nota1 + nota2) / 2;

        // Exibe a média
        System.out.println("A média das notas é: " + med);

        // Exibe a classificação da média
        if (med >= 9) {
            System.out.println("Parabéns, continue assim!");
        } else if (med >= 7 && med < 9) {
            System.out.println("Aprovado.");
        } else if (med >= 6 && med < 7) {
            System.out.println("Aprovado no limite, estude um pouco mais.");
        } else if (med >= 2 && med < 6) {
            System.out.println("Não está aprovado mas ainda pode fazer a segunda época");
        } else {
            System.out.println("Reprovado. Nos vemos semestre que vem");
        }
        sc.close();
}
}
