package primeiras_aulas.poo;

import java.util.Random;

public class Personagem {
    String nome;
    int nivel, forca;

    void mostrarStatus(){
    System.out.format("Personagem: %s (lvl %d) com %d de força.\n", nome, nivel, forca);
    }

    // simulando um dado de 20 faces
    int calcularDano(){
        Random gerador = new Random();
        int dado20Faces = 1+ gerador.nextInt(19); // random inicia com zero por isso tem q somar 1
        int dano = forca + dado20Faces;
        return dano; // como o metodo é int tem q retornar algum valor
    }

    // metodo que não retorna nada e recebe um parametro alvo do tipo string
    void atacar(String alvo, String habilidade){
        int danoCausado = calcularDano();
        if (habilidade.length() == 0){
        System.out.format("%s atacou %s e causou %d de dano. \n", nome, alvo, danoCausado);
        }
        else{
            System.out.format("%s atacou usando %s contra %s e causou %d de dano. \n", nome, habilidade, alvo, danoCausado);
        }


}
}
