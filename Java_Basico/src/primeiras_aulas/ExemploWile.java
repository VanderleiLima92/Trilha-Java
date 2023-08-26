package primeiras_aulas;

import java.util.concurrent.ThreadLocalRandom;

public class ExemploWile {
    public static void main(String[] args) {
        
        double mesada = 50.0;

            // cuidado ao usar o While pois se não colocar uma condição q para o fluxo ele gera um loop infinito
        while(mesada > 0){
            double valorDoce = valorAleatorio();

            if(valorDoce > mesada)
            valorDoce = mesada;

            System.out.println("Doce do valor: "+ valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }

        System.out.println("Mesada: "+ mesada);
        System.out.println("Pedro gastou toda a sua mesada em doce");
    }

        // metodo que retorna um valor aleatório entre 2 e 15
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 15);
    }
}
