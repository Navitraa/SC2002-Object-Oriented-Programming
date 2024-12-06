// Lab 1 QuesLab2p1on 1 
import java.util.Scanner;

public class P1
{
    /**
     * 
     */
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter character:");
        String input = scanner.nextLine();
        char choice = input.charAt(0);

        if (choice == 'A'||choice == 'a')
        {
            System.out.println("Action movie fan");
        }
        else if (choice == 'C' || choice == 'c')
        {
            System.out.println("Comedy movie fan");
        }
        else if (choice == 'D' || choice == 'd')
        {
            System.out.println("Drama movie fan");
        }
        else
        {
            System.out.println("Invalid choice");
        }
        scanner.close();
    }
}