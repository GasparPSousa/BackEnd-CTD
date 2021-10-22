package Aula06Proxy05NetflixSeries;

public class GradeSerieProxy implements IGradeSerie {

    private GradeSerie grade;
    private int qtdViews = 0;


    public GradeSerieProxy(GradeSerie grade) {
        this.setGrade(grade);
    }

    public void setGrade(GradeSerie grade) {
        this.grade = grade;
    }

    @Override
    public String getSerie(String nomeSerie) throws SerieNãoHabilitadaException {

        String link = grade.getSerie(nomeSerie);

        if (qtdViews < 5) {
            qtdViews++;
//            System.out.println(qtdViews);
            return link;
        } else  {
            throw new SerieNãoHabilitadaException(nomeSerie + " - Excede o número de reproduções permitidas " );
        }

    }
}
