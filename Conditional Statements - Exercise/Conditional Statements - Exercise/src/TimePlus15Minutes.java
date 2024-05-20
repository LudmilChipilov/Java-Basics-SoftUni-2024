import java.util.Scanner;
public class TimePlus15Minutes
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int totalMinutes = hours*60 + minutes + 15;
        int finalHour = totalMinutes / 60;
        if(finalHour == 24)
        {
            finalHour = 0;
        }
        int finalMinutes = totalMinutes % 60;
        System.out.printf("%d:%02d", finalHour, finalMinutes);

    }
}
