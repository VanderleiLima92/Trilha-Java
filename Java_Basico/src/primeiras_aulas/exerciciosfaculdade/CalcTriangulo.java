/*Ler as dimensões de um retângulo (base e altura), calcular e escrever a área do
retângulo. */

import java.util.Scanner;

public class CalcTriangulo {
    public static void main(String[] args) {
        float base, altura, area;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a base do Triangulo: ");
        base = sc.nextFloat();

        System.out.println("Digite a altura do Triangulo: ");
        altura = sc.nextFloat();

        area = (base*altura) /2;

        System.out.println("A área do triangulo é: " + area);
    }
}
