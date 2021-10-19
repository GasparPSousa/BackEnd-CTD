package Aula01Facade03Turismo;

public class ApiHotel {

    // Procurar os hoteis de acordo com uma data pre-definida

    public void buscarHoteis(String dataEntrada, String dataSaida, String cidade) {
        System.out.println("=======================");
        System.out.println("Hoteis encontrados  " + cidade);
        System.out.println("Data Entrada: " + dataEntrada + " - Data de Saída " + dataSaida);
    }
}
