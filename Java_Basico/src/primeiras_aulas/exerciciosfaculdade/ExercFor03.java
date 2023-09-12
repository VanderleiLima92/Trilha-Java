package primeiras_aulas.exerciciosfaculdade;

import java.util.Scanner;

public class ExercFor03 {
    public static void main(String[] args) {
        
        long x, result;
        result = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        x = sc.nextInt();

        for(int i = 2; i <= x; i++){
            result *= i;

        }

        System.out.println(result);

        sc.close();
    }
}
