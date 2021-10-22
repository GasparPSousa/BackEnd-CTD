package Aula06Proxy05NetflixSeries;

public interface IGradeSerie {

    String getSerie(String nomeSerie) throws SerieNãoHabilitadaException;
}
