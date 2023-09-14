
/*10. Escreva um programa que oferece para o usuário as seguintes opções:
1 – Misto quente R$5,50
2 – Salada Chinesa R$10,20
3 – Suco de Laranja R$4,00
4 – Suco de Manga R$3,50
Se o usuário digitar qualquer número diferente de 1, 2, 3 ou 4, o seu programa deve exibir uma mensagem de erro e
terminar. Caso contrário, se o usuário escolher alguma bebida, o programa deve exibir “tenha um excelente drink, vai
lhe custar” seguido do valor da bebida. Se o usuário escolher alguma comida, o programa deve exibir  “bom apetite,
vai lhe custar” seguido do valor da comida */

package primeiras_aulas.exerciciosfaculdade.lista_exercicios.lista03_selecao;

import java.util.Scanner;

public class Exerc10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int opcao;
       
        System.out.println("1 - Misto quente R$5,50 \n 2 - Salada Chinesa R$10,20 \n 3 - Suco de Laranja R$4,00 \n 4 - Suco de Manga R$3,50");
               

        System.out.println("Digite a opcão desejada: ");
        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Bom apetite, vai lhe custar R$5,50");
                break;
            case 2:
                System.out.println("Bom apetite, vai lhe custar R$10,20");
                break;
            case 3:
                System.out.println("Tenha um excelente drink, vai lhe custar R$4,00");
                break;
            case 4:
                System.out.println("Tenha um excelente drink, vai lhe custar R$3,50");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
        sc.close();
}
}
