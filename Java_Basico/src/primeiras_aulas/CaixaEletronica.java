package primeiras_aulas;

public class CaixaEletronica {
   
    public static void main(String[] args) {
        
        // aplicando condicionais

        double saldo = 25.0;
        double valorSolicitado = 22.0;

        

        if(valorSolicitado < saldo){ // caso o if tenha mais de uma instrução precisa acrescentar {} para ele identificar como bloco
            saldo = saldo - valorSolicitado; 
            System.out.println("Seu saldo é: " + saldo);   
        }    
        else
         System.out.println("Saldo Indisponível!");
           
        
    }
}
