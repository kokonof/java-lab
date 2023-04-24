package lab3.Book;


public class AudioBook extends Book {
    private int listeningTime;

    public AudioBook(int id, String name, String author, String publication, int yearPublication, int listeningTime, float price) {
        super(id, name, author, publication, yearPublication, price);
        this.listeningTime = listeningTime;
    }

    public int getListeningTime() {
        return listeningTime;
    }

    public void setListeningTime(int listeningTime) {
        this.listeningTime = listeningTime;
    }

    @Override
    public String toString() {
        return "Книжка:" +
                "\nІдентифікатор = " + id +
                ",\nНазва книги = " + name +
                ",\nАвтор = " + author +
                ",\nВидавництво = " + publication +
                ",\nРік публікації = " + yearPublication +
                ",\nЧас прослуховування = " + listeningTime +
                ",\nЦіна = " + price + "грн";
    }
}
