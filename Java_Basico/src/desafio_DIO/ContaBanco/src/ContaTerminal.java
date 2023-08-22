import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        /*
         * TO DO: criar um programa onde ele registra os dodas bancario de um novo
         * usuario
         * Exemplo de inscrição:
         * Atributo Tipo Exemplo
         * Numero Inteiro 1021
         * Agencia Texto 067-8
         * Nome Cliente Texto MARIO ANDRADE
         * Saldo Decimal 237.48
         * 
         */
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Digite o número da conta: ");
        int numero = sc.nextInt();

        System.out.println("Digite a Agencia: ");
        String agencia = sc.next();

        System.out.println("Digite o nome do cliente: ");
        String nome = sc.next();

        System.out.println("Digite o saldo: ");
        double saldo = sc.nextDouble();

        
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque!", nome, agencia, numero, saldo );
    
        sc.close();

    }
}