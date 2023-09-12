package primeiras_aulas.exerciciosfaculdade;

/*Calcular o pagamento de comissão de vendedores de peças, levando-se em
consideração que sua comissão será de 5% do total da venda e que você tem os seguintes
dados: preço unitário da peça e quantidade vendida. */

import java.util.Scanner;

public class ComissaoVendedor {
    public static void main(String[] args) {

        double precoUnitPeca, qtdVendida, comissao;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor unitário da peça: ");
        precoUnitPeca = sc.nextDouble();

        System.out.println("Digite a quantidade vendida: ");
        qtdVendida = sc.nextDouble();

        comissao = ((precoUnitPeca * qtdVendida) * 0.05);

        
        System.out.println("Sua comissão é: " + comissao);

        sc.close();
    }
}
