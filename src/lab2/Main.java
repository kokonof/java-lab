package lab2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ввести текст: ");
        String text = scanner.nextLine();
        StringChangerText stringChangerText = new StringChangerText(text);

        System.out.print("Короткий рядок: ");
        String line = scanner.nextLine();

        System.out.print("Ціле число: ");
        int number = scanner.nextInt();

        System.out.println(stringChangerText.getInsertLineAfterNumber(number, line));
        System.out.println("Number word = " + stringChangerText.getText().split(" ").length);
    }
}