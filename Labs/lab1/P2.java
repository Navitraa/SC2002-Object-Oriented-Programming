import java.util.Scanner;

public class P2 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Read salary input
        System.out.println("salary:");
        String salary_input = scanner.nextLine();
        int salary = Integer.parseInt(salary_input.replace("$", ""));

        // Read merit points input
        System.out.println("merit:");
        String merit_input = scanner.nextLine();
        int merit = Integer.parseInt(merit_input);

        // Determine grade
        char grade = ' ';
        // Range 1
        if (salary >= 500 && salary < 600)
        {
            grade = 'C';
        }
        // Range 2 (overlapping)
        else if (salary >= 600 && salary <= 649)
        {
            if (merit < 10)
            {
                grade = 'C';
            }
            else
            {
                grade = 'B';
            }
        }
        // Range 3
        else if (salary > 649 && salary < 700)
        {
            grade = 'B';
        }
        // Range 4 (overlapping)
        else if (salary >= 700 && salary <= 799)
        {
            if (merit < 20)
            {
                grade = 'B';
            }
            else
            {
                grade = 'A';
            }
        }
        // Range 5
        else if (salary > 799 && salary <= 899)
        {
            grade = 'A';
        }
        else 
        {
            System.out.println("Invalid salary range.");
            return; // exit the program for invalid salary
        }
        // Print grade
        System.out.println("Grade " + grade);
    }
}
