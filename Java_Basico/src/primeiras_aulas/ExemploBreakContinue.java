package primeiras_aulas;

public class ExemploBreakContinue {
    public static void main(String[] args) {
        
        for(int numero = 1; numero <= 6; numero ++){
            if(numero == 3)
                continue; // continue ele não imprime a condição e continua o for

            else if(numero == 5) 
                break; // atingiu a condiçao para a execução

            System.out.println(numero);        
        }
    }
}
