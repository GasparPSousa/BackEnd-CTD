package Aula06Proxy04NetFlix;

// 6º Classe criada
public class GradeDeFilmesProxy implements IGradeDeFilmes{

    private GradeDeFilmes grade;
    private IP ip;

    public IP getIP() {
        return ip;
    }

    public void setIp(IP ip) {
        this.ip = ip;
    }

    public GradeDeFilmesProxy(GradeDeFilmes grade) {
        this.setGrade(grade);
    }

    public void setGrade(GradeDeFilmes grade) {
        this.grade = grade;
    }

    @Override
    public Filme getFilme(String nomeFilme) throws FilmeNaoHabilitadoException {
        Filme filme = grade.getFilme(nomeFilme);
        if(!(getIP().getPais()).equalsIgnoreCase(filme.getPais())) {
            throw new FilmeNaoHabilitadoException(nomeFilme + " não disponível em " + getIP().getPais());
        }
        return filme;
    }
}
