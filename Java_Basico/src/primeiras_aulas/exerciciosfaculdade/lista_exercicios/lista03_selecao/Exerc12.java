
/*12. Escreva um programa  que verifica se um dado número inteiro de quatro dígitos é uma senha válida. Para ser
considerado como uma senha válida, um número tem que ter as seguintes características:
- O primeiro dígito da esquerda para a direita tem que ser 8 ou 5
- O quarto dígito da esquerda para a direita tem que ser 5 ou 1
- A soma do segundo com o terceiro dígitos tem que ser 3 caso o quarto dígito seja 5 e 0 caso ele seja 1
Por exemplo, o número 8125 é uma senha válida pois começa com 8, termina com 5 e a soma dos dois dígitos do
meio é 3. */

package primeiras_aulas.exerciciosfaculdade.lista_exercicios.lista03_selecao;

import java.util.Scanner;

public class Exerc12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int senha;
        

        System.out.print("Informe sua senha: ");
        senha = sc.nextInt();

        if (senha >= 1000 && senha <= 9999) {
            int primeiroDigito = senha / 1000;
            int segundoDigito = senha / 100 % 10;
            int terceiroDigito = senha / 10 % 10;
            int quartoDigito = senha % 10;

            if (primeiroDigito == 8 || primeiroDigito == 5) {
                if (quartoDigito == 5) {
                    if (segundoDigito + terceiroDigito == 3) {
                        System.out.println("Senha válida");
                    } else {
                        System.out.println("Senha inválida");
                    }
                } else if (quartoDigito == 1) {
                    if (segundoDigito + terceiroDigito == 0) {
                        System.out.println("Senha válida");
                    } else {
                        System.out.println("Senha inválida");
                    }
                }
            } else {
                System.out.println("Senha inválida");
            }
        } else {
            System.out.println("Senha inválida");
             }

    sc.close();          
}
}
