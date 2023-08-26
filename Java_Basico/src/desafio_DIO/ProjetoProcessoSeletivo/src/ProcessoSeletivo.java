

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        selecaoCandidatos();
        imprimirCandidatosSelecionados();
    }
    
    static void imprimirCandidatosSelecionados(){
        String[] candidatos = {"FELIPE", "MARCIA", "JULIANA", "PEDRO", "PAULA"};
    
        System.out.println("Imprimindo lista de candidatos informando o indice do elemento");

        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de nº " + (indice +1) + " é " + candidatos[indice]);
        }
    }

    static void selecaoCandidatos(){
        String[] candidatos = {"FELIPE", "MARCIA", "JULIANA", "PEDRO", "PAULA", "MONICA", "MIRELA"};
        
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.printf("O candidato %s solicitou este valor de salário: %.2f ", candidato, salarioPretendido);
            System.out.println("");
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }
    
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800 , 2200);
    }
    
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA ");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}

