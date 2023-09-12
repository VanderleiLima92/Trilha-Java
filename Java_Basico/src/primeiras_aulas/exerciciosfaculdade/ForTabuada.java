package primeiras_aulas.exerciciosfaculdade;

import java.util.Scanner;



public class ForTabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        String resp = "S";

        while ("S".equals(resp)) {
            
        
        System.out.println("Digite qual é a tabuada deseja ver");
        x = sc.nextInt();

        // inicialização; condição; inclementação 
        for (int i = 0; i<= 10; i++){
            int result = i * x;
            System.out.format("%d x %d = %d \n", i, x, result);
            
        }

        System.out.println("Deseja ver outra tabuada?: \n S-Sim ou N-Não");
        resp = sc.next();
        resp = resp.toUpperCase();

        }

        sc.close();
}
}
