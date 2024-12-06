public class SalePerson implements Comparable {
    private String firstName;
    private String lastName;
    private int totalSales;

    public SalePerson(String first_name, String last_name, int total_sales) { //constructor
        this.firstName = first_name;
        this.lastName = last_name;
        this.totalSales = total_sales;
    }

    public String toString() {
        return String.format("%s, %s, %d", firstName, lastName, totalSales); //convert to string
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getTotalSales() {
        return totalSales;
    }

    public boolean equals(Object o) { // difficult
        return (((SalePerson)o).getFirstName().equals(firstName) && ((SalePerson)o).getLastName().equals(lastName));
    }

    public int compareTo(Object o) { // difficult
        if (((SalePerson)o).getTotalSales() < totalSales) {
            return -1;
        }
        else if (((SalePerson)o).getTotalSales() > totalSales) {
            return 1;
        }
        else {
            if (lastName.compareTo(((SalePerson) o).getLastName()) < 0) { //note syntax; which alphabetical order
                return 1;
            }
            else {
                return -1;
            }
        }
    }
}
