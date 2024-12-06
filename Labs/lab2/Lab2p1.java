import java.util.Scanner;
import java.util.Random;

public class Lab2p1 {
public static void main(String[] args)
    {
    int choice;
    Scanner sc = new Scanner(System.in);
    
    do
    {
    System.out.println("Perform the following methods:");
    System.out.println("1: multiplication test");
    System.out.println("2: quotient using division by subtraction");
    System.out.println("3: remainder using division by subtraction");
    System.out.println("4: count the number of digits");
    System.out.println("5: position of a digit");
    System.out.println("6: extract all odd digits");
    System.out.println("7: quit");
    choice = sc.nextInt();
    switch (choice)
    {
        case 1: 
        mulTest();
        break;

        case 2: 
        /* Random rand = new Random();
        int min = 1;
        int max = 100;
        int m = (int)rand.nextInt(max - min + 1);
        int n = (int)rand.nextInt(max - min + 1); */

        // get inputs
        System.out.print("Please enter a positive integer m: ");
        int m = sc.nextInt();
        System.out.print("Please enter a positive integer n: ");
        int n = sc.nextInt();

        divide(m, n);
        break;

        case 3:
        // get inputs
        System.out.print("Please enter a positive integer m: ");
        int first_number = sc.nextInt();
        System.out.print("Please enter a positive integer n: ");
        int second_number = sc.nextInt();
        
        int remainder = modulus(first_number, second_number);
        System.out.println(first_number + " % " + second_number + " = " + remainder);
        break;

        case 4: 
        countDigits();
        break;

        case 5: 
        // Get inputs of n, digit
        System.out.print("Please enter a positive integer n: ");
        int input_integer = sc.nextInt();
        System.out.print("Please enter a single digit to find in n: ");
        int input_digit = sc.nextInt();
        // Call position() function
        int position = position(input_integer, input_digit);
        System.out.println("position = " + position);
        break;

        case 6: 
        System.out.print("Please enter a positive integer n: ");
        long input = sc.nextLong();
        extractOddDigits(input);
        break;

        case 7: System.out.println("Program terminating ….");
    }
    } 
    while (choice < 7);
    }
    // Method 1: Multiplication Test
    public static void mulTest() 
    {
        Scanner sc = new Scanner(System.in);
        int correct = 0;
        for (int i = 0; i < 5; i++) {
            int a = (int)((Math.random() * 9) + 1);
            int b = (int)((Math.random() * 9) + 1);
            System.out.print("How much is " + a + " times " + b + "? ");
            int answer = sc.nextInt();
            if (answer == a * b) 
            {
                System.out.println("Correct!");
                correct++;
            } 
            else 
            {
                System.out.println("Wrong. The correct answer is " + (a * b));
            }
        }
        System.out.println("You got " + correct + " out of 5 correct.");
        sc.close();
    }

    // Method 2: quotient using division by subtraction
    public static void divide(int m, int n)
    {
        int quotient = 0;
        int remainder = m;
        while (remainder > n)
        {
            remainder -= n;
            quotient++;
        }
        System.out.println(m + "/" + n + " = " + quotient);
    }

    // Method 3: remainder using division by subtraction
    public static int modulus(int m, int n) 
    {
        while (m >= n) {
            m -= n;
        }
        return m;
    }

    // Method 4: count the number of digits
    public static void countDigits() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        if (sc.hasNextInt()) 
        {
            int input = sc.nextInt();
            // Handle negative input case
            if (input < 0) {
                System.out.println("n: " + input + " - Error input!!");
            }
            // Positive input case
            else 
            {
                int count = 0;
                int n = input;
                // Special case: if n is 0, it has 1 digit
                if (n == 0) {
                    System.out.println("n: " + input + " - count = " + 1);
                }
                // Count the digits
                while (n > 0) {
                    n /= 10;
                    count++;
                }
                System.out.println("n: " + input + " - count = " + count);
            }
            
        } 
        else 
        {
            String input = sc.nextLine();
            System.out.println("n: " + input + " - Error input!!");
        }
    
        // sc.close();
    }

    // Method 5: position of a digit
    public static int position(int n, int digit)
    {
        int pos = 1; // Position starts from 1 (rightmost digit is at position 1)

        // Loop through each digit of n
        while (n > 0) 
        {
            int currentDigit = n % 10; // Get the rightmost digit

            if (currentDigit == digit) {
                return pos; // Return the position if the digit is found
            }

            n /= 10; // Remove the rightmost digit
            pos++;   // Move to the next position
        }
        return -1; // Return -1 if the digit is not found
    }

    // Method 6: extract all odd digits
    public static void extractOddDigits(long n)
    {
        if (n < 0) 
        {
            System.out.println("oddDigits = Error input!!");
            return;  
        }

        long oddDigits = 0;
        long multiplier = 1;

        while (n > 0) {
            long digit = n % 10;  // Extract the rightmost digit
            if (digit % 2 != 0) {  // Check if the digit is odd
                oddDigits += digit * multiplier;  // Add the odd digit to the result
                multiplier *= 10;
            }
            n /= 10;  // Remove the rightmost digit
        }

        // For no odd digits
        if (oddDigits == 0) oddDigits = -1;
        System.out.println("oddDigits = " + oddDigits);
    }
    }

