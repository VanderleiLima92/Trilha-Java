package primeiras_aulas;

import java.util.Locale;
import java.util.Scanner;


public class CondicaoTernaria {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite sua nota: ");
        int nota = sc.nextInt();

        String resultado = nota > 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
           
        System.out.println(resultado);
    sc.close();
    }
}
