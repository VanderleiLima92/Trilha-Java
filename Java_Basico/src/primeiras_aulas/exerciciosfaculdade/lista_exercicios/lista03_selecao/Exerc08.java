
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

package primeiras_aulas.exerciciosfaculdade.lista_exercicios.lista03_selecao;

import java.util.Scanner;

public class Exerc08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        double alt, peso, imc;
       
        

        System.out.println("Digite a sua altura");
        alt = sc.nextDouble();

        System.out.println("Digite seu peso");
        peso = sc.nextDouble();

       
        imc = peso / (alt * alt);

        
        // Exibe o IMC do usuário
        System.out.println("Seu IMC é: " + imc);

        // Exibe a classificação do IMC
        if (imc < 18.5) {
            System.out.println("Abaixo do peso ideal.");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Peso ideal, muito bem.");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Sobrepeso, um regime leve pode ajudar.");
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Obesidade leve.");
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Obesidade moderada.");
        } else {
            System.out.println("Obesidade mórbida.");
        }
        sc.close();
}
}

