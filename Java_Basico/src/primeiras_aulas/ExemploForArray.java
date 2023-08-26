package primeiras_aulas;

public class ExemploForArray {
    public static void main(String[] args) {
        
        // em arrays o indice inicia em ZERO
        String alunos [] = {"JOÃO", "PEDRO", "LUCAS", "PAULO"};

        for( int x = 0; x < alunos.length; x ++){
            System.out.println("O aluno no indice x=: " + x + " é " + alunos[x]);
        }

        // for de outra maneira
        for( String aluno: alunos){
            System.out.println("O nome do aluno é: " + aluno);
        }
    }
}
