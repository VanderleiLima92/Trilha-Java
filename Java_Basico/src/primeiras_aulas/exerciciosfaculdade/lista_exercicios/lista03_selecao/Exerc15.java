
/*15. Faça um programa que lê os seguintes dados:
- valor/hora (é um número real positivo)
- horas trabalhadas (é um inteiro)
- imposto (um real entre 0 e 1, inclusive)
- comissão (é um real positivo)
Seu programa deve calcular e exibir para o usuário os seguintes valores:
Salário bruto, que é igual ao valor/hora multiplicado pelo número de horas trabalhadas.
Salário líquido, que é igual ao salário bruto menos o imposto mais a comissão. Note que a comissão somente
entrará nos cálculos caso o número de horas trabalhadas seja pelo menos 120. */

package primeiras_aulas.exerciciosfaculdade.lista_exercicios.lista03_selecao;

import java.util.Scanner;

public class Exerc15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valorHora, imposto, comissao, salarioBruto, salarioLiquido;
        int horasTrabalhadas;


        System.out.print("Informe o valor da hora: ");
        valorHora = sc.nextDouble();

        System.out.print("Informe as horas trabalhadas: ");
        horasTrabalhadas = sc.nextInt();

        System.out.print("Informe o imposto: ");
        imposto = sc.nextDouble();

        System.out.print("Informe a comissão: ");
        comissao = sc.nextDouble();

        // Calculando o salário bruto
        salarioBruto = valorHora * horasTrabalhadas;

        // Calculando o salário líquido
        if (horasTrabalhadas >= 120) {
            salarioLiquido = salarioBruto - imposto + comissao;
        } else {
            salarioLiquido = salarioBruto - imposto;
        }

        
        System.out.println("O salário bruto é de R$" + salarioBruto);
        System.out.println("O salário líquido é de R$" + salarioLiquido);


        sc.close();

}

}
