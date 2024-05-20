import java.util.Scanner;
public class WorldSwimmingRecord
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timePerMetre = Double.parseDouble(scanner.nextLine());
        double delay = ((int)distance / 15)*12.5;
        double totalTimeWithDelay = distance * timePerMetre + delay;
        double difference = record - totalTimeWithDelay;

        if(difference > 0)
        {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTimeWithDelay);
        }
        else
        {
            System.out.printf("No, he failed! He was %.2f seconds slower.", Math.abs(difference));
        }
    }
}
