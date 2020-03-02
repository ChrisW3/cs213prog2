
public class Outstate extends Student{
	private boolean tristate;
	
	public Outstate(String fname, String lname, int credit, boolean isTriState) {
		super(fname, lname, credit);
		tristate = isTriState;
	}

	@Override
	public String toString() {
		return super.toString() + " " + tristate;
	}
	
	@Override
	public int tuitionDue() {
		if(tristate) {
			if(credit > 15) {
				return (756-200) * 15 + 1441;
			}
			else if(credit >= 12) {
				return (756-200) * credit + 1441;
			}
			else {
				return 756 * credit + 846;
			}
		}
		else {
			if(credit > 15) {
				return 756 * 15 + 1441;
			}
			else if(credit >= 12) {
				return 756 * credit + 1441;
			}
			else {
				return 756 * credit + 846;
			}
		}		
	}	
}
