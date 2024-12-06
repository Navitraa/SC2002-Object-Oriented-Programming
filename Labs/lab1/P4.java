import java.util.Scanner;

public class P4 {
    public static void main(String[] args){
        // Get user input 
        Scanner scanner = new Scanner(System.in);
        System.out.println("height:");
        int height = Integer.parseInt(scanner.nextLine());

        // Error case
        if (height <= 0)
        {
            System.out.println("Error input!!");
            return;
        }

        // Print tower
        String line_print = "";
        for(int i=0; i < height; i++)
        {
            if (i % 2 == 0)
            {
                line_print = "AA" + line_print;
            }
            else 
            {
                line_print = "BB" + line_print;
            }
            System.out.println(line_print);
        }
    }
}
