import java.util.Scanner;
public class ToyShop
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceExc = Double.parseDouble(scanner.nextLine());
        int numPuzzles = Integer.parseInt(scanner.nextLine());
        int numPuppets = Integer.parseInt(scanner.nextLine());
        int numBears = Integer.parseInt(scanner.nextLine());
        int numMinions = Integer.parseInt(scanner.nextLine());
        int numTrucks = Integer.parseInt(scanner.nextLine());
        int totalNumToys = numPuzzles + numPuppets
                + numBears + numMinions + numTrucks;
        double totalPrice = numPuzzles*2.6 + numPuppets*3
                + numBears*4.1 + numMinions*8.20 + numTrucks*2;
        if(totalNumToys >= 50)
        {
            totalPrice *= 0.75;
        }
        double totalPriceWithRent = totalPrice*0.9;
        if(totalPriceWithRent >= priceExc)
        {
            System.out.printf("Yes! %.2f lv left.", totalPriceWithRent - priceExc);
        }
        else
        {
            System.out.printf("Not enough money! %.2f lv needed.", priceExc - totalPriceWithRent);
        }


    }
}
