package Aula05Proxy03Spotify;

public class ServicoDownload implements IServicoDownload{

    @Override
    public void baixarMusica(Usuario usuario) {
        System.out.println(usuario.getNome() + ", você é cliente Premium!! Baixe sua música preferida e se divirta!");
    }
}
