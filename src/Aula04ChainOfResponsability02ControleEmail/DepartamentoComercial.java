package Aula04ChainOfResponsability02ControleEmail;

public class DepartamentoComercial extends Handler{

    @Override
    public void verificar(Mail eMail) {

        if((eMail.getDestino().equalsIgnoreCase("comercial@colmeia.com")) ||
                (eMail.getAssunto().equalsIgnoreCase("Comercial"))){
            System.out.println("Enviado ao Departamento Comercial");
        } else {
            if(this.getSeguinte() != null) {
                this.getSeguinte().verificar(eMail);
            }
        }
    }
}
