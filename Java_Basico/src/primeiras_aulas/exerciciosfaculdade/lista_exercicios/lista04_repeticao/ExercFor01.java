
/*1. Escreva um programa que exibe os primeiros 100 números naturais. Faça versões
usando for, while e do/while */

package primeiras_aulas.exerciciosfaculdade.lista_exercicios.lista04_repeticao;

public class ExercFor01 {
    public static void main(String[] args){
        int num = 0;
        int x = 100;

        for(int i =0; i <100; i = i+2){
            System.out.println(i);
        }


        while(num < 100){
            
            System.out.println(num);
            num ++;
        }

        do{
            System.out.println(x);
            x --;
        } while(x > 0);
    }
}
