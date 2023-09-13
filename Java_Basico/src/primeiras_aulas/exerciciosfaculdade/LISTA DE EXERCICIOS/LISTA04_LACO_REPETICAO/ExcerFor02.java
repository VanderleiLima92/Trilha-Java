package primeiras_aulas.exerciciosfaculdade;

import java.util.Scanner;

public class ExcerFor02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, result, rep;
        rep = 1;

        do{
        System.out.println("Digite um número: ");
        x = sc.nextInt();

        result = x*x;

        System.out.format("O quadrado do número: %d é %d \n", x, result);


        System.out.println("Digite 0 para fechar ");
        rep = sc.nextInt();
        }while (rep != 0);

        sc.close();
    }
}
