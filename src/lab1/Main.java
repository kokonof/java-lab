package lab1;
import java.util.ArrayList;

public class Main {
    private ArrayList<Book> bookArrayList = new ArrayList<Book>();
    public static void main(String[] args) {
        Main main = new Main();
        Book book1 = new Book(1,
                "Книга 1",
                "Перший автор",
                "Видавництво Букварик",
                2001,
                352,
                300);

        Book book2 = new Book(2,
                "Книга 2",
                "Другий автор",
                "Видавництво Щоденник",
                2011,
                152,
                200);
        Book book3 = new Book(3,
                "Книга 3",
                "Третій автор",
                "Видавництво Метелик",
                2017,
                408,
                400);

        main.bookArrayList.add(book1);
        main.bookArrayList.add(book2);
        main.bookArrayList.add(book3);
    }

    public String searchAuthor(String author){
        String result = "";
        for (int i = 0; i < bookArrayList.size(); i++ ){
            if(author.equals(bookArrayList.get(i).getAuthor()))
                result += "\n\n"+ bookArrayList.get(i).toString();
        }
        return result;
    }
    public String searchPublisher(String publication){
        String result = "";
        for (int i = 0; i < bookArrayList.size(); i++ ){
            if(publication.equals(bookArrayList.get(i).getPublication()))
                result += "\n\n"+ bookArrayList.get(i).toString();
        }
        return result;
    }
    public String searchYearPublication(int year){
        String result = "";
        for (int i = 0; i < bookArrayList.size(); i++ ){
            if(bookArrayList.get(i).getYearPublication() >= year)
                result += "\n\n"+ bookArrayList.get(i).toString();
        }
        return result;
    }
}