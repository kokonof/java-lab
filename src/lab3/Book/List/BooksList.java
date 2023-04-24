package lab3.Book.List;

import lab3.Book.Book;

import java.util.ArrayList;
import java.util.List;

public class BooksList{
    private int size = 0;
    protected List<Book> bookList;
    protected Book[] booksArray;

    public BooksList(){
        bookList = new ArrayList<Book>();
    }
    public void add(Book book) {
        bookList.add(book);
    }
    public void remove(int index) {
        bookList.remove(index);
    }

    public Book get(int index) {
        return bookList.get(index);
    }

    public int getLength() {
        return bookList.size();
    }

    public String searchAuthor(String author){
        String result = "";
        for (int i = 0; i < getLength(); i++ ){
            if(author.equals(get(i).getAuthor()))
                result += "\n\n"+ get(i).toString();
        }
        return result;
    }
    public String searchPublisher(String publication){
        String result = "";
        for (int i = 0; i < getLength(); i++ ){
            if(publication.equals(get(i).getPublication()))
                result += "\n\n"+ get(i).toString();
        }
        return result;
    }
    public String searchYearPublication(int year){
        String result = "";
        for (int i = 0; i < getLength(); i++ ){
            if(get(i).getYearPublication() >= year)
                result += "\n\n"+ get(i).toString();
        }
        return result;
    }
}

