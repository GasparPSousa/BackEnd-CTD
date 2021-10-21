package Aula05Proxy03Spotify;

public class Main {

    public static void main(String[] args) {


        Usuario usuario = new Usuario("Gaspar", "00001", "Premium");
        IServicoDownload servico = new ProxyDownload();
        servico.baixarMusica(usuario);

        usuario = new Usuario("Fernando", "00002", "Free");
        servico.baixarMusica(usuario);

        usuario = new Usuario("Geovani", "00003", "Premium");
        servico.baixarMusica(usuario);

        usuario = new Usuario("Octavio", "00004", "Free");
        servico.baixarMusica(usuario);



    }
}
