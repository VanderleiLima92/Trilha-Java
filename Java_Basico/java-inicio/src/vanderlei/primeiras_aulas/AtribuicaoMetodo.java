package vanderlei.primeiras_aulas;
public class AtribuicaoMetodo {
    
    public static String nomeCompleto (String primeiroNome, String segundoNome){

        return "Resultado do Metodo " + primeiroNome.concat(" ").concat(segundoNome);
    }

    public static void main(String[] args) { // metodo main é o principal onde é rodado o codigo
        String primeiroNome = "Vanderlei";
        String segundoNome = "Lima";

        // atribuindo o metodo com os seus 2 parametros
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }
}
