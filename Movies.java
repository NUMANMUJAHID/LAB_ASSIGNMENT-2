import java.util.ArrayList;
import java.util.Objects;

public class Movies {
    private String title;
    private String release_year;
    private int ranking;
    private String genre;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movies movies = (Movies) o;
        return ranking == movies.ranking && Objects.equals(title, movies.title) && Objects.equals(release_year, movies.release_year) && Objects.equals(genre, movies.genre);
    }


    @Override
    public String toString() {
        return "Movies{" +
                "title='" + title + '\'' +
                ", release_year='" + release_year + '\'' +
                ", ranking=" + ranking +
                ", genre='" + genre + '\'' +
                '}';
    }



    public Movies(String title, String releaseYear, int ranking, String genre) {
        this.title = title;
        release_year = releaseYear;
        this.ranking = ranking;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRelease_year() {
        return release_year;
    }

    public void setRelease_year(String release_year) {
        this.release_year = release_year;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public static void main(String[] args) {
        ArrayList<Movies> movie = new ArrayList<>();
        System.out.println(movie.isEmpty());
        System.out.println(movie.size());
        movie.add(new Movies("Predestination","2002",07,"Science Fiction"));
        for(Movies m : movie){
            System.out.println(m);
        }
        movie.add(new Movies("12 Angry Men","1956",05,"Crime"));

        movie.remove(1);
        movie.remove(new Movies("12 Angry Men","1956",05,"Crime"));
        for (Movies m : movie) {
            m.setRanking(m.getRanking() + 1);
        }
        for(Movies m : movie){
            System.out.println(m);
        }
        System.out.println(movie.indexOf(new Movies("12 Angry Men","1956",05,"Crime")));
    }


}

