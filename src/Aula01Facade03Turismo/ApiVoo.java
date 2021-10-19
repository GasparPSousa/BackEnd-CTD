package Aula01Facade03Turismo;

public class ApiVoo {

    // Procurar os voos de acordo com uma data pre-definida

    public void buscarVoos(String dataPartida, String dataRetorno, String origem, String destino) {
        System.out.println("=======================");
        System.out.println("Voos encontrados para: " + destino + " saindo de " + origem);
        System.out.println("Data partida: " + dataPartida + " - Data de Retorno " + dataRetorno);
    }
}
