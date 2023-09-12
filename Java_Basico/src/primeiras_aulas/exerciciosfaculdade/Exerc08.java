
/*8. Escreva um programa que lê a altura e peso do usuário e calcula o seu IMC, índice de massa corpórea. 
O programa deve exibir um texto para o usuário conforme a tabela abaixo:
IMC Texto
Abaixo de 18,5 Abaixo do peso ideal.
Entre 18,5 e 24,9 Peso ideal, muito bem.
Entre 25,0 e 29,9 Sobrepeso, um regime leve pode ajudar.
Entre 30,0 e 34,9 Obesidade leve.
Entre 35,0 e 39,9 Obesidade moderada.
Acima de 40 Obesidade mórbida.
 */

package primeiras_aulas.exerciciosfaculdade;

import java.util.Scanner;

public class Exerc08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        double alt, peso, result;
       
        

        System.out.println("Digite a sua altura");
        alt = sc.nextDouble();

        System.out.println("Digite o seu peso");
        peso = sc.nextDouble();

        result = peso / alt*alt;

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
