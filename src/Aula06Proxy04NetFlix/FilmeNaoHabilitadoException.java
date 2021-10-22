package Aula06Proxy04NetFlix;

// 3º Classe criada
public class FilmeNaoHabilitadoException extends Exception{

    public FilmeNaoHabilitadoException(String messageForUser) {
        super(messageForUser);
    }
}
