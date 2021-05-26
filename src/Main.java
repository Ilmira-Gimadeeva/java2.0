import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число x: ");
        double x = in.nextDouble();

        System.out.print("Введите число y: ");
        double y = in.nextDouble();

        Addition addition = new Addition();

        System.out.println("Сумма = " + addition.sum(x,y));
    }
}
