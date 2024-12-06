import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.Comparator;


// Lab Part A
public class PlaneSeat {
        private int seatID;
        private boolean assigned;
        private int customerID;

        public PlaneSeat(int seat_id) {
            this.seatID = seat_id;
            this.assigned = false;  //initally seat is not assigned
            this.customerID = -1;  //initally customerID is not assigned to any particular seat
        }

        public int getSeatID() {
            return seatID;
        }

        public int getCustomerID() {
            return customerID;
        }

        public boolean isOccupied() {
            return assigned;
        }

        public void assign(int cust_id) {
            this.customerID = cust_id;
            this.assigned = true;
        }

        public void unAssign() {
            this.customerID = -1; //In Java, int is a primitive type and cannot be assigned null. You should use a special value (such as -1) to represent an "unassigned" state instead of null
            this.assigned = false; //In Java, boolean cannot be assigned 0 or 1. Instead use true or false.
        }
    }


    
