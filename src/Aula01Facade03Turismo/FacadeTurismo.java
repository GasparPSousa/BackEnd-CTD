package Aula01Facade03Turismo;

public class FacadeTurismo implements IFacadeTurismo{

    // Armazenar a instância de cada API na memória.
    private ApiVoo apiVoo;
    private ApiHotel apiHotel;


    // Construtor que cria as instâncias (inicializa
    public FacadeTurismo() {
        apiVoo = new ApiVoo();
        apiHotel = new ApiHotel();
    }

    // Centralizar as buscas de voos e hoteis
    @Override
    public void buscar(String dataPartida, String dataRetorno, String origem, String destino) {
        apiVoo.buscarVoos(dataPartida, dataRetorno, origem, destino);
        apiHotel.buscarHoteis(dataPartida, dataRetorno, destino);
    }
}
