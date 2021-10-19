package Aula01Facade03Turismo;

public class Main {

    public static void main(String[] args) {

        // Criando o primeiro cliente(Instância do primeiro cliente)
        IFacadeTurismo cliente1 = new FacadeTurismo();

        // Solicitar a busca de voos e hoteis do primeiro cliente
        cliente1.buscar("19/10/2021", "10/12/2021", "São Paulo", "Salvador");

    }
}
