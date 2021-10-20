package Aula04ChainOfResponsability02ControleEmail;

public class ProcessaMail {

    public static void main(String[] args) {

        CheckMail check = new CheckMail();
        check.verificar(new Mail("gaspar@digitalhouse.com", "tecnico@colmeia.com", "Teste"));
        check.verificar(new Mail("gaspar@digitalhouse.com", "gerencia@colmeia.com", "Teste"));
        check.verificar(new Mail("gaspar@digitalhouse.com", "comercial@colmeia.com", "Teste"));
        check.verificar(new Mail("gaspar@digitalhouse.com", "teste@colmeia.com", "Teste"));
        System.out.println();

        check.verificar(new Mail("gaspar@digitalhouse.com", "teste1@colmeia.com", "Teste"));
        check.verificar(new Mail("gaspar@digitalhouse.com", "teste2@colmeia.com", "Teste"));
        check.verificar(new Mail("gaspar@digitalhouse.com", "teste3@colmeia.com", "Teste"));
        check.verificar(new Mail("gaspar@digitalhouse.com", "teste4@colmeia.com", "Teste"));
        System.out.println();

        check.verificar(new Mail("gaspar@digitalhouse.com", "teste1@colmeia.com", "Gerência"));
        check.verificar(new Mail("gaspar@digitalhouse.com", "teste2@colmeia.com", "Comercial"));
        check.verificar(new Mail("gaspar@digitalhouse.com", "teste3@colmeia.com", "Técnico"));
        check.verificar(new Mail("gaspar@digitalhouse.com", "teste4@colmeia.com", "Teste"));

    }
}
