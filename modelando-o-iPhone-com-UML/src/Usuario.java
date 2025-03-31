import apps.ReprodutorMusical;

public class Usuario {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.abrirApp("iPod");
        iphone.selecionarMusica("Beatles - Lucy in the Sky with Diamonds");
        iphone.tocar();
        iphone.aumentarVolume();
        iphone.pausar();
        iphone.colocarAppSegundoPlano("iPod");
        iphone.abrirApp("Telefone");
        iphone.selecionarContato("Henrique");
        iphone.ligar();
        iphone.desligar();
        iphone.fecharApp("Telefone");
    }
}