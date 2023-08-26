import java.util.Random;

public class LigarCAndidato {
    public static void main(String[] args) {
        
        String[] candidatos = {"FELIPE", "MARCIA", "JULIANA", "PEDRO", "PAULA"};
    
        for(String candidato: candidatos){
            entrandoEmContato(candidato);

        }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizados = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizados ++;
            else 
                System.out.println("CONTATO REALIZADO COM SUCESSO");    
        }while(continuarTentando && tentativasRealizados <3);

        if(atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizados + " TENTATIVA");

        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MÁXIMO TENTATIVAS  " + tentativasRealizados);    
    }

    // metodo auxiliar
    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }
}    
