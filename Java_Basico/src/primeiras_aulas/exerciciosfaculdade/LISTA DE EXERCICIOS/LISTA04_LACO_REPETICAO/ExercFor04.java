package primeiras_aulas.exerciciosfaculdade;

import java.util.Scanner;

public class ExercFor04 {
    public static void main(String[] args) {
        
        int x;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        x = sc.nextInt();

        if (x <= 3){
            System.out.println("Número primo");
        }
        else{
            boolean ehPrimo = true;

            for(int div = 2; div < (x -1); div++){
                if (x % div ==0){
                    System.out.println("Consegui dividir por: " + div);
                    ehPrimo = false;
                }
            }
            if(ehPrimo){
                System.out.println("É primo");
            }
            else{
                System.out.println("Não é primo");
            }

        }
        

        sc.close();
}
}
