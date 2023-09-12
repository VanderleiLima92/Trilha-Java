package primeiras_aulas.exerciciosfaculdade;

/*Ler 4 números, calcular o quadrado para cada um, somar todos os quadrados e mostrar o
resultado. */

import java.util.Scanner;

public class CalcularQuadrado {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num1, num2, num3, num4, result;

    System.out.println("Digite o primeiro número: ");
    num1 = sc.nextInt();

    System.out.println("Digite o segundo número: ");
    num2 = sc.nextInt();

    System.out.println("Digite o terceiro número: ");
    num3 = sc.nextInt();

    System.out.println("Digite o quarto número: ");
    num4 = sc.nextInt();

    result = (num1*num1) + (num2*num2) + (num3*num3) + (num4*num4);

    System.out.println("A soma do quadro dos números são: " + result);

    sc.close();
}
}