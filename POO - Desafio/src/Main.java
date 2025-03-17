public class Main {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        meuIphone.selecionarMusica("Chão de Giz");
        meuIphone.tocar();
        meuIphone.pausar();
        
        
        meuIphone.ligar("+55 88 99999-9999");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        meuIphone.exibirPaginas("www.google.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();



    }

}
