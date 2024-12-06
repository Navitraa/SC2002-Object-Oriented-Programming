import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.Comparator;

// Lab Part B
public class Plane {
        private PlaneSeat[] seats; // array of PlaneSeat objects
        private int numEmptySeat;

        public Plane() {
            this.seats = new PlaneSeat[12];
            this.numEmptySeat = 12;

            for (int i = 0; i < 12; i++) {
                seats[i] = new PlaneSeat(i + 1); // initialise seats with IDs from 1 to 12
            }
        }

        private PlaneSeat[] sortSeats() {
            
            PlaneSeat[] sortedSeats = Arrays.copyOf(seats, seats.length);
            
            Arrays.sort(sortedSeats, new Comparator<PlaneSeat>() {
                @Override
                public int compare(PlaneSeat s1, PlaneSeat s2) {
                    // comparing occupied vs unoccupied: essentially moves unoccupied seats to the rightmost of the array
                    if (!s1.isOccupied() && !s2.isOccupied()) return 0;
                    if (!s1.isOccupied()) return 1;
                    if (!s2.isOccupied()) return -1;

                    // compares two occupied seats by their customerID
                    return Integer.compare(s1.getCustomerID(), s2.getCustomerID());
                }
            });
            return sortedSeats;
        }

        public void showNumEmptySeats() {
            System.out.println("The number of empty seats is " + numEmptySeat);
        }

        public void showEmptySeats() {
            System.out.println("Empty seats: ");
            for (PlaneSeat seat: seats) {  // [An enhanced for-each loop] PlaneSeat seat: Declares a variable seat of type PlaneSeat. For each iteration, seat will refer to an element from the seats collection or array.
                if (!seat.isOccupied()) {
                    System.out.println("SeatID: " + seat.getSeatID());
                }
            }
        }
        
        public void showAssignedSeats(boolean bySeatId) {
            System.out.println("Assigned seats:");
            if (bySeatId) {
                // Display by seat ID (question: how do you know that this is sorted by seatID)
                for (PlaneSeat seat : seats) {
                    if (seat.isOccupied()) {
                        System.out.println("SeatID " + seat.getSeatID() + " assigned to CustomerID " + seat.getCustomerID());
                    }
                }
            } 
            else {
                // Display by customer ID (sorted order)
                PlaneSeat[] sortedSeats = sortSeats();
                for (PlaneSeat seat : sortedSeats) {
                    if (seat.isOccupied()) {
                        System.out.println("SeatID " + seat.getSeatID() + " assigned to CustomerID " + seat.getCustomerID());
                    }
                }
            }  
        }

        public void assignSeat(int seatId, int cust_id) { //Note: variable names are case-sensitive in java
            // input error handling: invalid seat number 
            if (seatId < 1 || seatId > 12) {
                System.out.println("Invalid seat ID."); 
                return;
            }

            PlaneSeat seat = seats[seatId - 1]; // Get the seat object based on the seat ID
            // 
            if (!seat.isOccupied()) {
                seat.assign(cust_id);
                numEmptySeat--;
                System.out.println("Seat " + seatId + " assigned to CustomerID " + cust_id);
            } 
            else {
                System.out.println("Seat " + seatId + " is already occupied.");
            }
        }

        public void unAssignSeat(int seatId) {
            if (seatId < 1 || seatId > 12) {
                System.out.println("Invalid seat ID.");
                return;
            }
            
            PlaneSeat seat = seats[seatId - 1]; // Get the seat object based on the seat ID
            if (seat.isOccupied()) {
                seat.unAssign();
                numEmptySeat++;
                System.out.println("Seat " + seatId + " has been unassigned.");
            } else {
                System.out.println("Seat " + seatId + " is already empty.");
            }
        }
    }