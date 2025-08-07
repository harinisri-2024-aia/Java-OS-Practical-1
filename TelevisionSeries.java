public class TelevisionSeries {

    String title;
    String genre;
    int totalEpisodes;
    double rating;

    void displaySeriesInfo() {
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Total Episodes: " + totalEpisodes);
        System.out.println("Rating: " + rating + "/10");
    }

    public static void main(String[] args) {
        TelevisionSeries series1 = new TelevisionSeries();

        series1.title = "Breaking Bad";
        series1.genre = "Crime, Drama, Thriller";
        series1.totalEpisodes = 62;
        series1.rating = 9.5;
        series1.displaySeriesInfo();
    }
}
