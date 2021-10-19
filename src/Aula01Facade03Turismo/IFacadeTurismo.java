package Aula01Facade03Turismo;

import java.util.List;

// A Intergace é o contrato que vai determinar as regras do Facade
public interface IFacadeTurismo {

    public void buscar(String dataPartida, String dataRetorno, String origem, String destino);
}
