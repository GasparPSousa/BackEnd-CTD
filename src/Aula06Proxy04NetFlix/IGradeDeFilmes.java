package Aula06Proxy04NetFlix;

// 4º Classe(Interface) criada
public interface IGradeDeFilmes {

    Filme getFilme(String nomeFilme) throws FilmeNaoHabilitadoException;
}
