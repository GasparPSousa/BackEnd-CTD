package Aula05Proxy01ConexaoInternet;

import java.util.List;

public class ProxyInternet implements IConexaoInternet {

    private InternetService internetService;
    private List<String> sitesBloqueados;

    public ProxyInternet(InternetService internetService, List<String> sitesBloqueados) {
        this.internetService = internetService;
        this.sitesBloqueados = sitesBloqueados;
    }

    @Override
    public void conectarCom(String url) {
        if(!this.sitesBloqueados.contains(url)) {
            this.internetService.conectarCom(url);
        } else {
            System.out.println("Acesso Negado");
        }
    }
}
