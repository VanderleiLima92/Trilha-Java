
/*7. Faça um programa que lê um valor real, representando o valor de uma peça de roupa. A seguir, o programa deve ler
um inteiro (0, 1 ou 2) os quais representam as seguintes opções:
0 – Compra à vista
1 – Compra parcelada no cartão
2 – Crediário
Na opção 0, o programa deve calcular quanto custa a peça de roupa com 10% de desconto.
Na opção 1, o programa deve perguntar ao usuário quantas parcelas deseja utilizar e exibir o valor da parcela.
Na opção 2, o usuário pagará juros de 10% sobre o valor total. O programa deve ler o número de parcelas
desejado e exibir o valor de cada parcela, que é calculado sobre o valor com juros.
Caso o usuário digite alguma opção diferente de 0, 1 ou 2, o programa deve informar “opção inválida” e
terminar. */

package primeiras_aulas.exerciciosfaculdade;

import java.util.Scanner;

public class Exerc07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        double valorPeca;
        int tipoPag, numParcela;
        

        System.out.println("Digite o vlor da peça");
        valorPeca = sc.nextDouble();

        System.out.println("Digite: \n 0 - Compra à vista \n 1 - Compra parcelada no cartão \n 2 - Crediário");
        tipoPag = sc.nextInt();

        

        switch(tipoPag){
            case 0:
                valorPeca = valorPeca - (valorPeca * 0.10);
                System.out.println("Desconto de 10%: " + valorPeca);
                break;

            case 1:    
                System.out.println("Digite o número de parcelas");
                numParcela = sc.nextInt();

                valorPeca = valorPeca / numParcela;
                System.out.format("O valor da parcela é: %.2f \n",valorPeca);
                break;

            case 2:
                System.out.println("Digite o número de parcelas");
                numParcela = sc.nextInt();

                valorPeca = valorPeca * 1.1;
                valorPeca = valorPeca / numParcela;
                System.out.format("O valor da parcela é: %.2f \n", valorPeca);
                break;

            default:
                System.out.println("Opção inválida");   
                break; 
        }

        

        

        sc.close();
}
}
