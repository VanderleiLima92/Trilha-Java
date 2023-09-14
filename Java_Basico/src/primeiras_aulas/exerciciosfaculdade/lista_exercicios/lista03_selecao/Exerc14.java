
/*14. Escreva um programa  que lê as notas de 10 alunos e calcula a média aritmética delas. Caso a média seja pelo
menos 6, o programa deve exibir a quantidade de alunos que tiveram nota maior do que 8. Caso contrário, o programa
deve exibir a quantidade de alunos que tiraram nota 0. */

package primeiras_aulas.exerciciosfaculdade.lista_exercicios.lista03_selecao;

import java.util.Scanner;

public class Exerc14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int nota;
        int qtdAlunosAcimaDe8 = 0;
        int qtdAlunosComNota0 = 0;
        double media = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Informe a nota do aluno " + (i + 1) + ": ");
            nota = sc.nextInt();

            
            media += nota;

            // Contando a quantidade de alunos com nota acima de 8
            if (nota > 8) {
                qtdAlunosAcimaDe8 ++;
            }

            // Contando a quantidade de alunos com nota 0
            if (nota == 0) {
                qtdAlunosComNota0 ++;
            }
        }

        // Calculamos a média
        media /= 10;

        // Exibe a quantidade de alunos com nota acima de 8 se a média for pelo menos 6
        if (media >= 6) {
            System.out.println("A quantidade de alunos com nota acima de 8 é: " + qtdAlunosAcimaDe8 );
        } else {
            // Exibe a quantidade de alunos com nota 0 se a média for menor do que 6
            System.out.println("A quantidade de alunos com nota 0 é: " + qtdAlunosComNota0 );
        }

        sc.close();
}
}
