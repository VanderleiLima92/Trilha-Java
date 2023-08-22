package primeiras_aulas;

public class OperadorTernario {
    
    public static void main(String[] args) {
        // Pode substituir um IF

        int a = 5;
        int b = 5;

        String resustado = a == b ? "Verdadeiro" : "falso"; 

        String resultadoIf;
        System.out.println(resustado);

        // expresão em IF
        if (a==b)
            resultadoIf = "Verdadeiro";
        else
            resultadoIf = "Falso";
            
        System.out.println(resultadoIf);    

        

    }
}
