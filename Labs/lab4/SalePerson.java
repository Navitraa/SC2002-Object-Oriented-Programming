
public class SalePerson implements Comparable<SalePerson>{
	private String firstName;
	private String lastName;
	private int totalSales;
	
	public SalePerson(String firstName, String lastName, int totalSales) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.totalSales = totalSales;
	}
	
	public String toString() {
		return ("<"+lastName+"> , <"+firstName+"> : <"+totalSales+">");
	}
	
	public boolean equals(Object obj) {
		if (this == obj) {
            return true; // Check if the objects are the same
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // Null or different class type
        }
        SalePerson other = (SalePerson) obj;
        return firstName.equals(other.firstName) && lastName.equals(other.lastName);

	}
	
    public int compareTo(SalePerson other) {
        if (this.totalSales != other.totalSales) {
            return Integer.compare(this.totalSales, other.totalSales); // Compare total sales
        } else {
            return this.lastName.compareTo(other.lastName); // Break tie by last name
        }
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
}
