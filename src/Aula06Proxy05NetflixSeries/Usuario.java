package Aula06Proxy05NetflixSeries;

public class Usuario {

    public static void main(String[] args) {

        GradeSerieProxy proxy = new GradeSerieProxy(new GradeSerie());

        try {
            System.out.println(proxy.getSerie("Peaky Blinders"));
        } catch (SerieNãoHabilitadaException e) {
            System.out.println(e);
        }

        try {
            System.out.println(proxy.getSerie("La Casa de Papel"));
        } catch (SerieNãoHabilitadaException e) {
            System.out.println(e);
        }

        try {
            System.out.println(proxy.getSerie("O Gambito da Rainha"));
        } catch (SerieNãoHabilitadaException e) {
            System.out.println(e);
        }

        try {
            System.out.println(proxy.getSerie("Ozark"));
        } catch (SerieNãoHabilitadaException e) {
            System.out.println(e);
        }

        try {
            System.out.println(proxy.getSerie("Billons"));
        } catch (SerieNãoHabilitadaException e) {
            System.out.println(e);
        }

        try {
            System.out.println(proxy.getSerie("Vinkings"));
        } catch (SerieNãoHabilitadaException e) {
            System.out.println(e);
        }

        try {
            System.out.println(proxy.getSerie("Breaking Bad"));
        } catch (SerieNãoHabilitadaException e) {
            System.out.println(e);
        }





    }
}
