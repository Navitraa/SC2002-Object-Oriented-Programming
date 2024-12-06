import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {

        // Get user input 
        Scanner scanner = new Scanner(System.in);
        System.out.println("starting (in S$):");
        int start = Integer.parseInt(scanner.nextLine());
        System.out.println("ending (in S$):");
        int end = Integer.parseInt(scanner.nextLine());
        System.out.println("increment (in S$):");
        int increment = Integer.parseInt(scanner.nextLine());

        // Error case
        if ((start > end && increment > 0) || (start < end && increment < 0))
        {
            System.out.println("Error input!!");
            return;
        }

        // Generate first table using a for loop
        System.out.println("Using for loop:");
        System.out.println("US$ \t S$");
        System.out.println("--------------");

        for(int i = start; i <= end; i += increment)
        {
            double USD = i * 1.82;
            System.out.println(i + "\t" + USD);
        }

        // Generate second table using a while loop
        System.out.println("Using while loop:");
        System.out.println("US$ \t S$");
        System.out.println("--------------");

        int j = start;
        while(j <= end)
        {
            double USD = j * 1.82;
            System.out.println(j + "\t" + USD);
            j += increment;
        }

        // Generate third table using a do/while loop
        System.out.println("Using do/while loop:");
        System.out.println("US$ \t S$");
        System.out.println("--------------");

        int k = start;
        do
        {
            if (k > end)
            {
                break;
            }
            double USD = k * 1.82;
            System.out.println(k + "\t" + USD);
            k += increment;
        }
        while (k <= end);

    }
}
