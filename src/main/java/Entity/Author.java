package Entity;
import Types.Genre;
import Entity.Book;

public class Author {

    public int id;
    public String name;
    public String lastName;
    public  String gender;

    Author (int id, String name, String lastName, String gender){
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
    }
    public String getName(){
        return name;
    }
    public String getLastName(){
        return lastName;
    }
    public String getGender(){
        return gender;
    }
}
