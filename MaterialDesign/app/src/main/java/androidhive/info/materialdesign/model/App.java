package androidhive.info.materialdesign.model;

import java.util.ArrayList;

/**
 * Created by sonpx on 5/4/15.
 */
public class App {

    private String title, thumbnailUrl;
    private int year;
    private String  rating;
    private ArrayList<String> genre;

    public App() {
    }

    public App(String name, String thumbnailUrl, int year, String  rating,
                 ArrayList<String> genre) {
        this.title = name;
        this.thumbnailUrl = thumbnailUrl;
        this.year = year;
        this.rating = rating;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String  getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public ArrayList<String> getGenre() {
        return genre;
    }

    public void setGenre(ArrayList<String> genre) {
        this.genre = genre;
    }


}
