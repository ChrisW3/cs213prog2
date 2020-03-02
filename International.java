
public class International extends Student{
	private boolean exchange;
	
	public International(String fname, String lname, int credit, boolean isExchange) {
		super(fname, lname, credit);
		exchange = isExchange;
	}

	@Override
	public String toString() {
		return super.toString() + " " + exchange;
	}
	
	@Override
	public int tuitionDue() {
		if(exchange) {
			return 1441 + 350;
		}
		else {
			if(credit > 15) {
				return 945 * 15 + 1441 + 350;
			}
			else if(credit >= 12) {
				return 945 * credit + 1441 + 350;
			}
			else {
				return 945 * credit + 846 + 350;
			}
		}		
	}	
}
