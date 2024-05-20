import java.util.Scanner;
public class LunchBreak
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int duration = Integer.parseInt(scanner.nextLine());
        int pause = Integer.parseInt(scanner.nextLine());
        double timeLunch = pause / 8.0;
        double timeRepose = pause / 4.0;
        double timeLeft = pause - timeLunch - timeRepose;
        if(timeLeft >= duration)
        {
            int timeCeil = (int)Math.ceil(timeLeft - duration);
            System.out.printf("You have enough time to watch %s and left with %d minutes free time.", name, timeCeil);
        }
        else
        {
             int timeCeil = (int)Math.ceil(duration - timeLeft);
            System.out.printf("You don't have enough time to watch %s, you need %d more minutes.", name, timeCeil);
        }
    }
}
