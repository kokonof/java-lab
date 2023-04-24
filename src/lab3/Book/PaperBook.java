package lab3.Book;

public class PaperBook extends Book {

    protected int numberPages;

    public PaperBook(int id, String name, String author, String publication, int yearPublication, int numberPages, float price) {
        super(id, name, author, publication, yearPublication, price);
        this.numberPages = numberPages;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(int numberPages) {
        this.numberPages = numberPages;
    }

    @Override
    public String toString() {
        return "Книжка:" +
                "\nІдентифікатор = " + id +
                ",\nНАзва = " + name +
                ",\nАвтор = " + author +
                ",\nВидавництво = " + publication +
                ",\nДата публікації = " + yearPublication +
                ",\nКількість сторінок = " + numberPages +
                ",\nЦіна = " + price + "грн";
    }
}
