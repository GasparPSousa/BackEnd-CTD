package Aula01Facade02Supermercado;

public class FacadeDesconto implements IFacadeDesconto{

    // Armazenando a instância de cada API na memória
    private ApiCartao apiCartao;
    private ApiProduto apiProduto;
    private ApiQuantidade apiQuantidade;

    // Construtor que cria as instâncias
    public FacadeDesconto() {
        apiCartao = new ApiCartao();
        apiProduto = new ApiProduto();
        apiQuantidade = new ApiQuantidade();
    }

    public int desconto(Cartao cartao, Produto prod, int quantidade) {

        int desconto = 0;

        desconto = desconto + apiQuantidade.desconto(quantidade);
        desconto = desconto + apiProduto.desconto(prod);
        desconto = desconto + apiCartao.desconto(cartao);

        return desconto;

    }






}
