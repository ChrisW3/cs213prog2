
public class Instate extends Student{
	private int funds;
	
	public Instate(String fname, String lname, int credit, int f) {
		super(fname, lname, credit);
		funds = f;
	}

	@Override
	public String toString() {
		return super.toString() + " " + funds;
	}
	
	@Override
	public int tuitionDue() {
		if(credit > 15) {
			return 433 * 15 + 1441 - funds;
		}
		else if(credit >= 12) {
			return 433 * credit + 1441 - funds;
		}
		else {
			return 433 * credit + 846;
		}
			
	}
}
