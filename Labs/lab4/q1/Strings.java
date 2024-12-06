import java.util.Scanner;

public class Strings {
// --------------------------------------------
// Reads in an array of string obkects, sorts them,
// then prints them in sorted order.
// --------------------------------------------
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print ("\nHow many string objects do you want to sort? ");
        int size = scan.nextInt();
        // scan.nextLine(); // Consumes the leftover newline character

        Comparable[] strList = new Comparable[size];
        System.out.println ("\nEnter the string objects...");

        for (int i = 0; i < size; i++) {
            strList[i] = scan.next();  // use of scan.next()-separates by whitespace VS scan.nextLine()-separates by line
        }

        Sorting.insertionSort(strList); //the difference is that i need to sort the string objects based on their first char
        System.out.println ("\nYour numbers in sorted order...");

        for (int i = 0; i < size; i++) {
            System.out.print(strList[i] + " ");
        }
        System.out.println ();
    }
}
