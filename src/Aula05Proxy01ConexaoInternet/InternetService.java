package Aula05Proxy01ConexaoInternet;

public class InternetService implements IConexaoInternet{

    @Override
    public void conectarCom(String url) {
        System.out.println("Conectando com " + url);
    }
}
