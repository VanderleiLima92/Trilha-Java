package primeiras_aulas.poo;

public class App {
    public static void main(String[] args) {
        Personagem heroi = new Personagem();
        heroi.nome = "Hercules";
        heroi.nivel = 2;
        heroi.forca = 16;

        heroi.mostrarStatus();

        // chamar um metodo atacar e passou como argumento um string "Hydra"
        heroi.atacar("Hydra", "Soco duplo");
    }
    
}
