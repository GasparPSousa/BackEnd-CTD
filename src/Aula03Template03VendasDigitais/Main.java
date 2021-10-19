package Aula03Template03VendasDigitais;

public class Main {

    public static void main(String[] args) {

        Vendedores vendedor = new Funcionarios("Gaspar", 5, 10, 10, 1);
        vendedor.mostrarCategoria();

        vendedor = new Afiliados("Renner", 5, 1);
        vendedor.mostrarCategoria();

        Estagiario estagiario = new Estagiario("Marcos Spano", 5, 2);
        estagiario.mostrarCategoriaEstagiario();
    }
}
