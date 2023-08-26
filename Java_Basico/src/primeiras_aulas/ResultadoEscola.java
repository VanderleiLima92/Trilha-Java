package primeiras_aulas;

import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane; // abre um pop up

public class ResultadoEscola {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite sua nota: ");
        int nota = sc.nextInt();

        if(nota >= 7)
            JOptionPane.showMessageDialog(null, "Aprovado!");
            //System.out.println("Aprovado!");

        else if (nota >= 5 && nota < 7)
            System.out.println("Recuperação");
           
         
        else
            System.out.println("Reprovado!"); 
           

    sc.close();
    }
    
}
