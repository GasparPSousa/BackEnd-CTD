package Aula06Proxy04NetFlix;

// 5º Classe Criada
public class GradeDeFilmes implements IGradeDeFilmes {

    @Override
    public Filme getFilme(String nomeFilme) throws FilmeNaoHabilitadoException {
        // Não precisa desse throws FilmeNaoHabilitadoException pois a exceção é feita na classe do proxy
        Filme filme = null;
        switch (nomeFilme) {
            case "Homem Aranha":
                filme = new Filme("Homem Aranha", "Brasil", "www.homemaranha.com.br");
                break;

            case "Colombianos em busca de vingança":
                filme = new Filme("Colombianos em busca de vingança", "Colombia", "www.vinganca.com.co");
                break;

            case "De volta para o futuro":
                filme = new Filme("De volta para o futuro", "Argentina", "www.futuro.com.ar");
                break;

            case "Matrix":
                filme = new Filme("Matrix", "Brasil", "www.matrix.com.br");
                break;

            case "Boneco Assassino":
                filme = new Filme("Boneco Assassino", "Colombia", "www.boneco.com.br");

        }

        return filme;
    }
}


