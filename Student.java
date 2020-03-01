/**
 The Student class is an abstract class used to 
 @author Chris Woolley and Kevin Nehrbauer
 */
public abstract class Student implements Comparable{
	private String fname;
	private String lname;
	protected int credit;
	public Student(String fname, String lname, int credit) {
		this.fname = fname;
		this.lname = lname;
		this.credit = credit;
	} //constructor
	//must implement compareTo method because Student class implements the Comparable Interface
	//return 0 if fname and lname of the two students are equal,
	//return -1 if this fname and lname is < obj’s, return 1 if this fname and lname is > obj’s
	//Hint: use the .equals and compareToIgnoreCase methods of the String class to compare fname
	//and lname; names are not case-sensitive
	/**
	 * @param obj
	 * @return 
	 */
	public int compareTo(Object obj) {
		return 0;
	}
	//return a string with fname, lname and credit hours; subclasses will be using this method.
	public String toString() {
		return "";
	}
	//compute the tuition due; concrete implementation is required in the subclasses.
	public abstract int tuitionDue() {
		return 0;
	}
}
