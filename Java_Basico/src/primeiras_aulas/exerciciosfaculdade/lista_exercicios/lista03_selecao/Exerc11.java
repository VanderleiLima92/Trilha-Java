
/*11. Faça um programa que lê os seguintes dados:
- código de estado (um inteiro de 1 a 5)
- valor inicial de carga
Seu programa deve calcular qual o valor final de uma carga de acordo com as seguintes regras. 
Caso o código de estado seja 2 ou 5 o valor final da carga é o valor inicial menos 12%.
Caso o código de estado seja 1, 3 ou 4, o valor final da carga é o valor inicial menos 15% */

package primeiras_aulas.exerciciosfaculdade.lista_exercicios.lista03_selecao;

import java.util.Scanner;

public class Exerc11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int codUf;
        double valFinal, valInicio;

        System.out.print("Informe o código de estado: ");
        codUf = sc.nextInt();

        // Solicitamos o valor inicial da carga
        System.out.print("Informe o valor inicial da carga: ");
        valInicio = sc.nextDouble();

        // Calculamos o valor final da carga
        if (codUf == 2 || codUf == 5) {
            valFinal = valInicio - (valInicio * 0.12);
        } else {
            valFinal = valInicio - (valInicio * 0.15);
        }

        // Exibe o valor final da carga
        System.out.println("O valor final da carga é R$" + valFinal);

sc.close();    }

}
