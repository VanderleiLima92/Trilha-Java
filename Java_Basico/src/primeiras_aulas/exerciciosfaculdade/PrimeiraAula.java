import java.util.Scanner;



public class PrimeiraAula {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
        System.out.println("Digite o Primeiro valor");
        int num1 = sc.nextInt();
        
        System.out.println("Digite o Primeiro valor");
        int num2 = sc.nextInt();
        
        int resultado = num1 * num2;
        
        
        System.out.println("O Resultado da multiplicação é: " + resultado);
        
        sc.close();
    }
}
