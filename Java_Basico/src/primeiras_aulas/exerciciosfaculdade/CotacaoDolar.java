package primeiras_aulas.exerciciosfaculdade;

/* ler a cotação do dolar e a quantidade de dolares
 * converter para real e mostrar o resultado
 */

import java.util.Scanner;



public class CotacaoDolar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         float cotDolar, qtDolar, real;

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o valor da cotação Dolar: ");
    cotDolar = sc.nextFloat();
    
    System.out.println("Digite a quatidade de Dolar: ");
    qtDolar = sc.nextFloat();

    real = cotDolar * qtDolar;
    System.out.println("O Valor em Real R$ é:  " + real);
    
    sc.close();
}
}
