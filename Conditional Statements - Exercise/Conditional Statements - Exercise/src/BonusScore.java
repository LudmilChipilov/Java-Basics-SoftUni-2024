import java.util.Scanner;
public class BonusScore
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        double bonus = 0;
        if (number <= 100) {
            bonus = 5.0;
        }
        if (number > 100 && number < 1001) {
            bonus = 0.2 * number;

        }
        if (number > 1000) {
            bonus = 0.1 * number;
        }
        if (number % 2 == 0) {
            bonus += 1;
        }
        if(number == 5 || number % 10 == 5)
        {
            bonus += 2;
        }
        double finalNumber = (double)number + bonus;
        System.out.printf("%.1f%n", bonus);
        System.out.printf("%.1f%n", finalNumber);
    }
}
