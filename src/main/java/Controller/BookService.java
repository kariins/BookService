package Controller;

import java.util.ArrayList;
import Entity.Book;
import Entity.Author;
import Types.Genre;

public class BookService {
    public ArrayList<Book> books;
    public ArrayList<Author> authors;

    public BookService(){
        this.authors = new ArrayList<>();
        this.books = new ArrayList<>();
    }


    public void addBook(Book book) {
        this.books.add(book);
    }

    public void removeBook(Book book) {
        this.books.remove(book);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
    public ArrayList<Author> getAuthors() {
        return authors;
    }
    public ArrayList<Book> listByTypeFantasy(){
        ArrayList<Book> booksByFantasy = new ArrayList<>();
        for(Book book: books) {
            if(book.getGenre().equals(Genre.fantasy)) {
                booksByFantasy.add(book);
            }
        }
        return booksByFantasy;
    }
    public ArrayList<Book> listOfBooksBefore199() {
        ArrayList<Book> booksBefore199 = new ArrayList<>();

        for(Book book: books) {
            if(book.getYearOfRelease() <1999) {

            }
        }
        return booksBefore199;
    }
    public Book mostExpensiveBook() {
        Book mostExpensive = books.get(0);
        for (Book book: books){
            if(book.getPrice() > mostExpensive.getPrice()){
                mostExpensive = book;
            }
        }
        return mostExpensive;
    }
    public Book cheapestBook() {
        Book cheapest = books.get(0);
        for (Book book: books){
            if (book.getPrice() < cheapest.getPrice()) {
                cheapest = book;
            }
        }
        return cheapest;
    }
    public Book bookBy3Authors() {
        for(Book book: books){
            if(book.getAuthors().size() == 3){
                return book;
            }
        }
        return null;
    }
    public Boolean verifyBook(Book book) {
        return books.contains(book);
    }

    public ArrayList<Book> listOfBooksByAuthor(Author provideAuthor){
        ArrayList<Book> authorBooks = new ArrayList<>();
        for(Book book: books){
            for(Author author1: book.getAuthors()){
                if(provideAuthor.equals((author1))){
                    authorBooks.add(book);
                }
            }
        }
        return authorBooks;
    }
}
