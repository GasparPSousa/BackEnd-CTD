package Aula06Proxy04NetFlix;

public class Usuario {

    public static void main(String[] args) {

        GradeDeFilmesProxy proxy = new GradeDeFilmesProxy(new GradeDeFilmes());
        proxy.setIp(new IP(50, 23, 15, 18));

        try{
            System.out.println(proxy.getFilme("Homem Aranha").getLink());
        }
        catch (FilmeNaoHabilitadoException e){
            System.out.println(e);
        }

        try{
            System.out.println(proxy.getFilme("Matrix").getLink());
        }
        catch (FilmeNaoHabilitadoException e){
            System.out.println(e);
        }


    }
}
