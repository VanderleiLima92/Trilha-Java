package primeiras_aulas;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
    
    
        
    
     public static void main(String[] args) {

        // utilizado para trar erro que o usuario comete ao preencher incorretamente
        try {
    // criando objeto scanner para entrada de dados
        formulario();
    

    } catch (InputMismatchException e) {
        // informação ou função que srá feito caso apresente um erro
        System.err.println("Digite os campos idade e altura em número! Para altura utilize ponto(.) ao inves de virgula(,)");
        formulario();
        }

            
     } 
     
     private static void formulario(){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); 
            System.out.println("Digite seu Nome: ");
            String nome = scanner.next();

            System.out.println("Digite seu Sobrenome: ");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura: ");
            double altura = scanner.nextDouble();

            // imprimindo valores obtidos pelo usuario
            System.out.println("Olá me chamo " + nome + " " + sobrenome);
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm");
        
        scanner.close();

        
        
     }
}
