import java.util.Scanner;
public class Numbers
{
// --------------------------------------------
// Reads in an array of integers, sorts them,
// then prints them in sorted order.
// --------------------------------------------
public static void main (String[] args)
{
	Scanner scan = new Scanner(System.in);
	System.out.print ("\nHow many integers do you want to sort? ");
	int size = scan.nextInt();
	Comparable[] intList = new Comparable[size]; // main change: intList should be of Comparable[] data type, not int[]
    System.out.println ("\nEnter the number one at a time...");

	for (int i = 0; i < size; i++) {
		intList[i] = scan.nextInt();
    }

    Sorting.insertionSort(intList);
	System.out.println ("\nYour numbers in sorted order...");

	for (int i = 0; i < size; i++) {
		System.out.print(intList[i] + " ");
	}
    System.out.println ();
}
}
