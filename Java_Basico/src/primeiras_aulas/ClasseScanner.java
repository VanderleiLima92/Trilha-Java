package primeiras_aulas;

import java.util.Locale;
import java.util.Scanner;

public class ClasseScanner{

    
    public static void main(String[] args) {

    // criando objeto scanner para entrada de dados
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
        
} 
    
}
