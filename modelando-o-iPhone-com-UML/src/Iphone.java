import apps.MensageiroInstantaneo;
import apps.NavegadorInternet;
import apps.ReprodutorMusical;
import apps.AparelhoTelefonico;

public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico, MensageiroInstantaneo {

    public void abrirApp(String app) {
        System.out.println("Abrindo " + app);
    }

    public void fecharApp(String app) {
        System.out.println("Fechando " + app);
    }

    public void colocarAppSegundoPlano(String app) {
        System.out.println("Deixando o " + app + " em segundo plano");
    }

    @Override
    public void selecionarContato(String name) {
        System.out.println("Contato " + name + " selecionado");
    }


    // Aparelho telefonico
    @Override
    public void ligar() {
        System.out.println("Realizando uma ligação");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo uma ligação");

    }

    @Override
    public void desligar() {
        System.out.println("Desligando uma ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correido de voz");

    }


    // Mensageiro Instantaneo
    @Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagem");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem");
    }

    @Override
    public void enviarImagem() {
        System.out.println("Enviando imagem");
    }


    // Reprodutor musical
    @Override
    public void tocar() {
        System.out.println("Reproduzindo música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");

    }

    @Override
    public void selecionarMusica(String nomeMusica) {
        System.out.println(nomeMusica + " selecionada");

    }

    @Override
    public void aumentarVolume() {
        System.out.println("Aumentando o volume");
    }

    @Override
    public void diminuirVolume() {
        System.out.println("Diminuindo o volume");

    }


    // Navegador
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo uma página no navegador");

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba ao navegador");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página do navegador");

    }
}
