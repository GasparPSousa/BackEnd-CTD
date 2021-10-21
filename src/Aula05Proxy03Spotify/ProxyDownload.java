package Aula05Proxy03Spotify;

public class ProxyDownload implements IServicoDownload {

    @Override
    public void baixarMusica(Usuario usuario) {
        if(verificarUsuario(usuario.getTipoDeUsuario())) {
//            System.out.println(usuario.getNome() + ", você é cliente Premium!! Baixe sua música preferida e se divirta!");
            ServicoDownload servico = new ServicoDownload();
            servico.baixarMusica(usuario);
        } else {
            System.out.println(usuario.getNome() + ", você é cliente 'Free'. Assine 'Premium' para poder baixar.");
        }
    }

    public boolean verificarUsuario(String tipoDeUsuario){

        if(tipoDeUsuario.equalsIgnoreCase("Premium")) {
            return true;
        } else  {
            return false;
        }
    }
}
