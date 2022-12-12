import java.util.Comparator;

public class Book implements Comparator <Book> {
    String name;
    String author;
    int year;
    Book(String name,String author,int year){
        this.name=name;
        this.author=author;
        this.year=year;
    }

    public int getYear() {
        return year;
    }
    String getName(){
        return name;
    }
    String getAuthor(){
        return author;
    }

    public int compare(Book b1,Book b2){
        return b1.getYear()-b2.getYear();
    }
    public static Comparator<Book> YearComparator= new Comparator<Book>() {
        @Override
        public int compare(Book b1, Book b2) {
            return b1.getYear() - b2.getYear();
        }
    };
    public static Comparator<Book>NameComparator=new Comparator<Book>(){
        @Override
        public int compare(Book b1,Book b2) {
            return b1.getName().compareTo(b2.getName());
        }
    };

    @Override
    public String toString() {
        return "Book: "+name+" Author: "+author+" Year: "+year;
    }
}