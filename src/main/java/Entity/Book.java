package Entity;

import Types.Genre;
import Entity.Author;

import java.util.ArrayList;

public class Book {

    public int id;
    public String title;
    public float price;
    public int yearOfRelease;
    public String authorList;
    public ArrayList<Author> authors;
    public Genre genre;

    Book (int id, String title, float price, int yearOfRelease, String authorList, Genre genre){
        this.id = id;
        this.title = title;
        this.price = price;
        this.yearOfRelease = yearOfRelease;
        this.authors = new ArrayList<>();
        this.authorList = authorList;
        this.genre = genre;
    }
    public String getTitle(){
        return title;
    }
    public float getPrice(){
        return price;
    }
    public int getYearOfRelease(){
        return yearOfRelease;
    }
    public String getAuthorList() {
        return authorList;
    }
        public ArrayList<Author> getAuthors() {
            return authors;
    }
    public Genre getGenre(){
        return genre;
    }
}
