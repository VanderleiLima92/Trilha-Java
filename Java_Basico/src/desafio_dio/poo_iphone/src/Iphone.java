package desafio_dio.poo_iphone.src;

interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica();
}

interface AparelhoTelefonico {
    void ligar();
    void atender();
    void iniciarCorrerioVoz();
}

interface NavegadorInternet {
    void exibirPagina();
    void adicionarNovaAba();
    void atualizarPagina();
}

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    
    public void tocar() {
        // implementação do método tocar
        System.out.println("TOCANDO MUSICA");
    }
    
    public void pausar() {
        // implementação do método pausar
        System.out.println("PAUSANDO MUSICA");
    }
    
    public void selecionarMusica() {
        // implementação do método selecionarMusica
        System.out.println("SELECIONANDO MUSICA");
    }
    
    public void ligar() {
        // implementação do método ligar
        System.out.println("LIGANDO");
    }
    
    public void atender() {
        // implementação do método atender
        System.out.println("ATENDENDO");
    }
    
    public void iniciarCorrerioVoz() {
        // implementação do método iniciarCorrerioVoz
        System.out.println("CORREIO DE VOZ");
    }
    
    public void exibirPagina() {
        // implementação do método exibirPagina
        System.out.println("EXIBINDO PÁGINA");
    }
    
    public void adicionarNovaAba() {
        // implementação do método adicionarNovaAba
        System.out.println("ADICIONANDO PÁGINA");
    }
    
    public void atualizarPagina() {
        // implementação do método atualizarPagina
        System.out.println("ATUALIZANDO PÁGINA");
    }
}
