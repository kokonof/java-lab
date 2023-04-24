package lab1;
import java.util.ArrayList;
import java.util.Scanner;

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

        boolean isActive = true;
        while (isActive){
            System.out.printf("\nВведіть номер за яким критерієм здійснювати пошук:\n"+
                    "1.Пошук за автором.\n"+
                    "2.Пошук по видавництву.\n"+
                    "3.Пошук випущених після заданого року.\n" +
                    "4.Вийти з програми.\n"+
                    "Виберіть критерій:"
            );
            Scanner scanner = new Scanner(System.in);

            switch (scanner.nextInt())
            {
                case(1):
                    System.out.print("Введіть імя автора: ");
                    scanner = new Scanner(System.in);
                    System.out.println(main.searchAuthor(scanner.nextLine()));
                    break;
                case(2):
                    System.out.print("Введіть назву видавництва: ");
                    scanner = new Scanner(System.in);
                    System.out.println(main.searchPublisher(scanner.nextLine()));
                    break;
                case(3):
                    System.out.print("Введіть рік: ");
                    System.out.println(main.searchYearPublication(scanner.nextInt()));
                    break;
                case(4):
                    isActive = false;
                    break;

            }
        }
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