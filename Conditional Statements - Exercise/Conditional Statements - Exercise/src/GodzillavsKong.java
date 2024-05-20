import java.util.Scanner;
public class GodzillavsKong
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int numActors = Integer.parseInt(scanner.nextLine());
        double priceDress = Double.parseDouble(scanner.nextLine());
        double sumTotal = 0;
        double priceSets = 0.1*budget;
        double totalPriceDress = numActors*priceDress;
        if(numActors > 150)
        {
            totalPriceDress *= 0.9;
        }
        sumTotal = totalPriceDress + priceSets;
        if(sumTotal > budget)
        {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", sumTotal - budget);
        }
        else
        {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - sumTotal);
        }
    }
}
