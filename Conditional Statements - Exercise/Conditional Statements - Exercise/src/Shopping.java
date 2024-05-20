import java.util.Scanner;
public class Shopping
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int numberVideoCard = Integer.parseInt(scanner.nextLine());
        int numberProc = Integer.parseInt(scanner.nextLine());
        int numberRam = Integer.parseInt(scanner.nextLine());
        double totalPriceVidCard = numberVideoCard * 250;
        double totalSum = totalPriceVidCard + numberProc * totalPriceVidCard * 0.35
                + numberRam * totalPriceVidCard * 0.1;
        if(numberVideoCard > numberProc)
        {
            totalSum *= 0.85;
        }
        if(budget >= totalSum)
        {
            System.out.printf("You have %.2f leva left!", budget - totalSum);
        }
        if(totalSum > budget)
        {
            System.out.printf("Not enough money! You need %.2f leva more!", totalSum - budget);
        }
    }
}
