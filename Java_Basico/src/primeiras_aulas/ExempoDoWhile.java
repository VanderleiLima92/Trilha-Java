package primeiras_aulas;

import java.util.Random;

public class ExempoDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando..");

        // similar ao while porém ele excuta no minimo 1 vez o código sendo verdadeiro ou false
        do {
            // executando repetidas vezes ate alguém atender
            System.out.println("Telefone tocando");
        }while(tocando());

        System.out.println("Alô !!!");

    }

    private static boolean tocando(){
        // atendeu recebera true caso o valor aletório entre 1 e 3 seja 1
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? "+ atendeu);

        // negando o ato de continuar tocando
        return ! atendeu;
    }
}
