import java.util.Scanner;

public class DesafioNomes {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
            // Ler 10 nomes
        String[] nomes = new String[10];
        for (int i = 0; i < 10; i++) {
            nomes[i] = sc.nextLine().trim();
        }

        // Imprimir o terceiro nome
        System.out.println(nomes[2]);

        // Imprimir o sétimo nome
        System.out.println(nomes[6]);

        // Imprimir o nono nome
        System.out.println(nomes[8]);


    sc.close();    
		}
        
}

