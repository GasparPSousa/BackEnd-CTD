package Aula06Proxy05NetflixSeries;

public class GradeSerie implements IGradeSerie {

    @Override
    public String getSerie(String nomeSerie) throws SerieNãoHabilitadaException {

        String link = null;

        switch (nomeSerie) {

            case "Peaky Blinders":
                link = "www.peakyblinders.com.br";
                break;

            case "La Casa de Papel":
                link = "www.lacasadepapel.com.br";
                break;

            case "Vinkings":
                link = "www.vinkings.com.br";
                break;

            case "Breaking Bad":
                link = "www.breakingbad.com.ar";
                break;

            case "Ozark":
                link = "www.ozark.com.br";
                break;

            case "Billons":
                link = "www.billions.com.br";
                break;

            case "O Gambito da Rainha":
                link = "www.ogambitodarainha.com.br";
                break;

        }

        return link;

    }
}
