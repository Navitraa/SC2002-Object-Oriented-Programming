import java.util.Scanner;

public class PlaneApp {
    public static void main(String[] args) {

            Plane plane = new Plane(); //instantiate a plane object
            int choice;
            Scanner sc = new Scanner(System.in);
            
            do {
            System.out.println("Enter the number of your choice:");
            System.out.println("1: show number of empty seats");
            System.out.println("2: show list of empty seats");
            System.out.println("3: show list of customers together with their seat numbers in order of seat numbers");
            System.out.println("4: show list of customers together with their seat numbers in order of customer ID");
            System.out.println("5: assign a customer to a seat");
            System.out.println("6: remove a seat assignment");
            System.out.println("7: quit");
            choice = sc.nextInt();

            switch (choice)
            {
                case 1: 
                plane.showNumEmptySeats();
                break;

                case 2:
                plane.showEmptySeats();
                break;

                case 3: 
                plane.showAssignedSeats(true);
                break;

                case 4: 
                plane.showAssignedSeats(false);
                break;

                case 5:
                System.out.println("Enter seatID to be assigned: ");
                int input_seatID = sc.nextInt();
                System.out.println("Enter custID to be assigned: ");
                int input_custID = sc.nextInt();

                plane.assignSeat(input_seatID, input_custID);
                break;

                case 6:
                System.out.println("Enter seatID to be un-assigned: ");
                int seatID_input = sc.nextInt();

                plane.unAssignSeat(seatID_input);
                break;

                case 7:
                System.out.println("Program terminating ….");

            }
        }
        while (choice < 7);
    }
}